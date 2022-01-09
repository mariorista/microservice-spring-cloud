package mar.cod.function;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/func/add")
@RefreshScope
public class FuncController {

	@PostMapping("/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		return Addition.add(a, b);
	}

	@GetMapping("/add/{a}/{b}")
	public Integer addpost(@PathVariable Integer a, @PathVariable Integer b) {
		return Addition.add(a, b);
	}

	@GetMapping("/v")
	public String versiion() {
		return "1.1.1";
	}
}
