package de.royal.bipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BiproWsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiproWsConfigServerApplication.class, args);
	}
}
