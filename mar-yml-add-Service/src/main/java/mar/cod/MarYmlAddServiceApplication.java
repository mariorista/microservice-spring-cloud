package mar.cod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarYmlAddServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarYmlAddServiceApplication.class, args);
	}

}
