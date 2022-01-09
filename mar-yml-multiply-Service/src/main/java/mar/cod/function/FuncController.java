package mar.cod.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/func/multiply")
@RefreshScope
public class FuncController {
	/**
	 * Having @RefreshScope in the same bean as other @Autowired beans didn;t allow
	 * the live refresh of the values with @value("${property}") but only on
	 * restart. To be trued with @configurationPropertie beans to see if the refresh
	 * will work.Apparently with @configurationProperties it works even
	 * without @RefreshScope.
	 */

	@Autowired
	TestVals testVals;

	@Autowired
	WebClient.Builder webClientBuilder;

	@GetMapping("/v")
	public String versiion() {
		return "1.2.3";
	}

	@GetMapping("/test")
	public String test() {
		return testVals.toString();
	}

	@GetMapping("/multiply/{a}/{b}")
	public Float add(@PathVariable Integer a, @PathVariable Integer b) {
		return multy(a, b);
	}

	@PostMapping("/multiply/")
	public Float addpost(@RequestParam Integer a, @RequestParam Integer b) {
		return multy(a, b);

	}

	private Float multy(Integer a, Integer b) {

		return Multiply.multiply(a, b, webClientBuilder);
	}
}
