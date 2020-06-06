package com.example.microservicecloud10zuulgateway7001.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class LoginFilter extends ZuulFilter {

    /**
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext(); // 线程安全的容器
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (token == null){
            currentContext.set("isOk","false");
            // 拒绝访问
            currentContext.setSendZuulResponse(false);
            // 响应状态码
            currentContext.setResponseStatusCode(401);
            currentContext.addZuulResponseHeader("Content-Type","application/json;charset=utf-8");
//            currentContext.addZuulResponseHeader("charset","utf-8");
            currentContext.setResponseBody("{\"result\":\"token 为空\"}");
            return null;
        }
        return null;
    }

}
