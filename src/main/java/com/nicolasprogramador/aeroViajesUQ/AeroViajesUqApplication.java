package com.nicolasprogramador.aeroViajesUQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class AeroViajesUqApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeroViajesUqApplication.class, args);
	}


	@GetMapping("/Hello")
	public String hello(@RequestParam(value="name",defaultValue = "world"))

}
