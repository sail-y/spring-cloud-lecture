package com.test.springlecture.echo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @author yangfan
 * @date 2019/11/23
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler(), "/echo").setAllowedOrigins("*");

    }

    @Bean
    public EchoService echoService() {
        return new DefaultEchoService("You said \"%s\"");
    }

    @Bean
    public WebSocketHandler webSocketHandler() {
        return new EchoWebSocketHandler(echoService());
    }
}
