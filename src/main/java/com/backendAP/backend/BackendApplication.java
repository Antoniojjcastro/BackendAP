package com.backendAP.backend;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
        
       @Bean
        public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			     // registry.addMapping("");
                             registry.addMapping("http://localhost:4200");
			}
		};
	}
        
        @Bean
        public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
                  }
        
        @Bean
        public CorsFilter corsFilter(){
            CorsConfiguration corsConfiguration = new CorsConfiguration();
            corsConfiguration.setAllowCredentials(true);
            //corsConfiguration.setAllowedOrigins(Arrays.asList(""));
            corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
            corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Acces-Control-Allow-Origin","Content-Type",
            "Accept","Authorization","Origin, Accept","X-Request-With",
            "Acces-Control-Request-Method","Acces-Control-Request-Headers"));
            corsConfiguration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Authorization",
            "Acces-Control-Allow-Origin","Acces-Control-Allow-Credentials"));
            corsConfiguration.setAllowedMethods(Arrays.asList("GET","PUT","POST","DELETE","OPTIONS"));
            UrlBasedCorsConfigurationSource  urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
            urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration); 
            
            
        return new CorsFilter(urlBasedCorsConfigurationSource);
        }   

}
