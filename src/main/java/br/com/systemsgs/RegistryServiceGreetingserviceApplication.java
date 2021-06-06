package br.com.systemsgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RegistryServiceGreetingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceGreetingserviceApplication.class, args);
	}

}
