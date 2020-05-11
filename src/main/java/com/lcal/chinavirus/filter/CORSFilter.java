package com.lcal.chinavirus.filter;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Order(1)
public class CORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        log.info("init CORSFilter");
        System.out.println("init CORSFilter ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        System.out.println("######### filter -before ");
        res.setHeader("Access-Control-Allow-Origin", "*");     //허용할 Origin(요청 url) : "*" 의 경우 모두 허용
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT ,OPTIONS");     //허용할 request http METHOD : POST, GET, DELETE, PUT
        res.setHeader("Access-Control-Max-Age", "3600");     //브라우저 캐시 시간(단위: 초) : "3600" 이면 최소 1시간 안에는 서버로 재요청 되지 않음
//        res.setHeader("Access-Control-Allow-Headers", "X-Requested-With");    //요청 허용 헤더(ajax : X-Requested-With)
        res.setHeader("Access-Control-Allow-Headers", "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");    //요청 허용 헤더(ajax : X-Requested-With)
        // (cf. 요청 허용 헤더 : "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization")
        chain.doFilter(req, res);

        System.out.println("######### filter -after ");
//        log.info("##### filter -after ### ");
    }


    @Override
    public void destroy() {

        System.out.print("####### filter -destroy ");
    }
}
