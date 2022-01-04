# microservice-spring-cloud
description of requirements for connecting services of a microservice project


spring.application.name=naming-server
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.instance.hostname=localhost
#eureka.client.service-url.defaultZone: http://localhost:8761/eureka/

@SpringBootApplication
@EnableEurekaServer
#################################

spring.application.name=addition-service
server.port=8001
eureka.instance.hostname=localhost
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/

@SpringBootApplication
@EnableEurekaClient
####################################


spring.application.name=multiply-service
server.port=8002
eureka.instance.hostname=localhost
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
-----------------
@SpringBootApplication
@EnableEurekaClient
public class MarYmlMultiplyServiceApplication {
	@Bean
	@LoadBalanced
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MarYmlMultiplyServiceApplication.class, args);
	}


-----------
f += webClientBuilder.build().get().uri(url).retrieve().bodyToMono(Integer.class).block();
//			f += restTemplate.getForObject(url, Integer.class);
}
