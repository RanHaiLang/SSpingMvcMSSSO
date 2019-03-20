package com.rminfo.controller;

import com.alibaba.fastjson.JSONObject;
import com.rminfo.util.TokenUtil;
import com.rminfo.util.UrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/5
 * Time: 17:33
 * 项目名：SSpringMvcMSso
 * 描述：TODO
 * Description: No Description
 */
@Controller
@RequestMapping("SSOServer")
public class SSOServerContoller {

    //判断用户是否登录，利用controller代替拦截器
    @RequestMapping("")
    public String loginCheck(String clientUrl, HttpServletRequest request){
        String userName = (String)request.getSession().getAttribute("isLogin");
        //未登录跳转到客户端登录页面（也可以是服务器自身拥有登录界面）
        if(userName==null){

            System.out.println("路径："+clientUrl+" 未登录,跳转登录页面");
            return "redirect:"+clientUrl+"?url=http://localhost/SSO/user/login";
        }else{
            //以登录携带令牌原路返回
            String token = UUID.randomUUID().toString();
            System.out.println("已经登录，登录账号:"+userName+"服务端产生的token:"+token);
            //存储
            TokenUtil.put(token, userName);
            return "redirect:"+clientUrl+"?token="+token+"&allSessionId="+request.getSession().getId();
        }
    }


    //令牌验证
    @ResponseBody
    @RequestMapping(value="/tokenCheck",method= RequestMethod.POST)
    public String tokenCheck(String token,String clientUrl,String allSessionId){

        JSONObject j=new JSONObject();
        String userName=TokenUtil.get(token);

        //token一次性的，用完即毁
        TokenUtil.remove(token);
        if(userName!=null){
            //设置返回消息
            j.put("erroeCode", 0);
            j.put("header", "认证成功!");
            j.put("userName", userName);

            //存储地址信息，用于退出时销毁

            String url= UrlUtil.get(allSessionId);
            if(url==null){
                url=clientUrl;
            }else{
                url+=","+clientUrl;
            }

            UrlUtil.put(allSessionId, url);

        }
        return j.toJSONString();
    }
}
