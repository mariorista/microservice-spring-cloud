package mar.cod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MarYmlConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarYmlConfigServerApplication.class, args);
	}

}
