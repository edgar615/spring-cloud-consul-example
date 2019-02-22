package com.github.edgar615.spring.consul.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
    Environment environment = context.getEnvironment();
    // 对应consul的KV config/config/consul-git.yml
    System.out.println(environment.getProperty("foo"));
  }
}
