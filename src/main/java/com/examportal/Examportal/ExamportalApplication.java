package com.examportal.Examportal;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableWebMvc
@OpenAPIDefinition(info = @Info(title = "Spring Boot API", version = "1.0", description = "API documentation for the Spring Boot project"))
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


