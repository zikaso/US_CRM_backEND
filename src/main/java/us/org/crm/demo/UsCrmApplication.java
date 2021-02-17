package us.org.crm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import us.org.crm.demo.entities.Customer;
import us.org.crm.demo.repositories.CustomerRepo;


@SpringBootApplication
public class UsCrmApplication  implements CommandLineRunner {
     @Autowired
     private CustomerRepo customerRepo;

    public static void main(String[] args) {
        SpringApplication.run(UsCrmApplication.class, args);
    }


    public void run(String... args) throws Exception {
        for (int i = 0; i <20 ; i++) {
            customerRepo.save(new Customer(null ,"HPS"+i , false,"HPS@gmail.com","06254158","RES lo 69 CASA","CASA",""));
        }

    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("*");
            }
        };
    }

}
