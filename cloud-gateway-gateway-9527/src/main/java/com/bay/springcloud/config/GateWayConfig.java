package com.bay.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GeteWayConfig
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/11 18:03
 * @Vsrsion 1.0
 **/
@Configuration
public class GateWayConfig {

    /**
     * 配置一个id为route_name 的路由规则，当访问localhost:9527/guonei时会自动跳转百度新闻
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_baidu",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }

}
