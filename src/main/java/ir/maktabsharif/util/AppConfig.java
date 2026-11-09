package ir.maktabsharif.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("ir.maktabsharif")
public class AppConfig {
    @Bean
    public InternalResourceViewResolver resolver() {
        return new InternalResourceViewResolver("/WEB INF/views/", ".jsp");
    }
}
