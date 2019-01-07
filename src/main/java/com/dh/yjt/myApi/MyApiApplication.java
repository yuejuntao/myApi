package com.dh.yjt.myApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages ={"com.dh.yjt.*"} )
@EnableDiscoveryClient
public class MyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

}

