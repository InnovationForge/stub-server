//package com.github.innovationforge;
//
//import com.github.tomakehurst.wiremock.WireMockServer;
//import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class StubServerConfig {
//
//    @Value("${stub.server.port}")
//    private int serverPort;
//
//    @Value("${stub.server.path}")
//    private String filesPath;
//
//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public WireMockServer wireMockServer() {
//        WireMockConfiguration config = WireMockConfiguration.wireMockConfig()
//                .port(serverPort)
//                .usingFilesUnderClasspath("wiremock");
//
//        return new WireMockServer(config);
//    }
//}
