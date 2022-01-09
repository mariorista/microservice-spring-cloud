package mar.cod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class MarYmlApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarYmlApiGatewayApplication.class, args);
	}

}
