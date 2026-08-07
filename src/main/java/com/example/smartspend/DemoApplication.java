package com.example.smartspend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner printLaunchLinks() {
		return args -> {
			System.out.println();
			System.out.println("==================================================================");
			System.out.println("🚀 SmartSpend Application is running successfully!");
			System.out.println("==================================================================");
			System.out.println("🔑 Auth Page:       http://localhost:8081/auth.html");
			System.out.println("📊 Dashboard:       http://localhost:8081/index.html");
			System.out.println("🗄️  H2 Console:      http://localhost:8081/h2-console");
			System.out.println("==================================================================");
			System.out.println();
		};
	}
}

