package mar.cod.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

public class Multiply {
	private static final Logger log = LoggerFactory.getLogger(Multiply.class);

	public static Float multiply(int a, int b, Builder webClientBuilder) {
//		String url = String.format("http://localhost:8001/func/add/add/%s/%s", a, a);
		String url = String.format("http://addition-service/func/add/add/%s/%s", a, a);
		
//		webClientBuilder.build().get().uri(url).retrieve().bodyToMono(Integer.class).block();
//		RestTemplate restTemplate = new RestTemplate();

//				"http://localhost:8001/func/add/add/12/12";
//		Integer adsum = restTemplate.getForObject(url, Integer.class);
		Float f = 0f;
//		f += adsum;

		for (int i = 0; i < b - 1; i++)
			f += webClientBuilder.build().get().uri(url).retrieve().bodyToMono(Integer.class).block();
//			f += restTemplate.getForObject(url, Integer.class);
		log.info("multiply::::: {} {},f: {}", a, b, f);
		if (b % 2 != 0)
			f -= b;
		return f;
//function muliply= call service addition(a,a) * b-1 times
	}
}
