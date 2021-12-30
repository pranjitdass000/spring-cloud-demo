//package com.stackroute.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RoutingConfig {
//    @Bean
//    public RouteLocator gateWayRoute(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route(r ->r.path("/employee/**")
//                        .uri("http://localhost:8081/")
//                        .id("employeeModule"))
//                .route(r ->r.path("/consumer/**")
//                        .uri("http://localhost:8082/")
//                        .id("consumerModule"))
//                .build();
//
//    }
//}