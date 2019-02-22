package com.github.edgar615.spring.consul.discovery;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);

    DiscoveryClient discoveryClient = context.getBean(DiscoveryClient.class);
    List<String> services = discoveryClient.getServices();
    System.out.println(services);
    List<ServiceInstance> list = discoveryClient.getInstances("student-service");
    System.out.println(list);
  }
}
