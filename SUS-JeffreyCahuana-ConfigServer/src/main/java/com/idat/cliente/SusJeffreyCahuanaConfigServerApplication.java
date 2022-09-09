package com.idat.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SusJeffreyCahuanaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SusJeffreyCahuanaConfigServerApplication.class, args);
	}

}
