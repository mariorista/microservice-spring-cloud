package mar.cod.function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {
	@Value("${test.val1}")
	String val1;
	@Value("${test.val2}")
	String val2;

	@GetMapping("/val")
	public String value() {
		return "v1: ".concat(val1).concat("v2: ").concat(val2);
	}
}
