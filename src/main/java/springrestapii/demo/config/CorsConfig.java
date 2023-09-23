package springrestapii.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow all origins and methods for Swagger UI
        registry.addMapping("/swagger-ui.html")
                .allowedOriginPatterns("https://*.up.railway.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true); // Allow credentials (e.g., cookies)
    }

}
