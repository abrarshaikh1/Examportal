package com.examportal.Examportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ExamportalApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configureCors(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Allow CORS on all endpoints
						.allowedOrigins("http://localhost:4200") //Allow Angular app origin
						.allowedMethods("GET", "POST", "DELETE", "PATCH", "PUT") // Allowed HTTP methods
						.allowedHeaders("*") // Allow all headers
						.allowCredentials(true) // Allow credentials (cookies, etc.)
						.maxAge(3600); // Preflight request cache duration
			}


			};
		}
	}


