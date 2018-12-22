package com.example.eurekaserver.config;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        System.err.println(event.getServerId() + " => [" + event.getAppName() + "] 服务下线");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event){
        System.out.println("[" + event.getInstanceInfo().getAppName() + "] 进行注册");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event){
        System.out.println(event.getServerId() + " => [" + event.getAppName() + "] 服务重连");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event){
        System.out.println( "[" + event.getTimestamp()+ "] 注册中心启动");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event){
        System.out.println("[" + event.getTimestamp() + "] Eureka Server 启动");
    }

}
