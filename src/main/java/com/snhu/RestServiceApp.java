package snhu;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;


/*
 * Run this class as a java application to start spring REST server
 */
@SpringBootApplication
public class RestServiceApp {
	
	
	public static void main(String[] args) {
        SpringApplication.run(RestServiceApp.class, args);
        MongoConnect.ConnectToDB();
    }
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Beans Provided by Spring Boot: ");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.parallelSort(beanNames);
			for(String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
	
	//Change root to /api
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
		webServerFactoryCustomizer(){
		return factory -> factory.setContextPath("/api");
	}
}


