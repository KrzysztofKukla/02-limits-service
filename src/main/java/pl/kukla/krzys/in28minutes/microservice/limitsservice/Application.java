package pl.kukla.krzys.in28minutes.microservice.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix //provides fault tolerance for all controllers
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
