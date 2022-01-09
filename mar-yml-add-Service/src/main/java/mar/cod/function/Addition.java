package mar.cod.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Addition {
	private static final Logger log = LoggerFactory.getLogger(Addition.class);

	public static int add(int a, int b) {
		log.info("add::::: {} {}", a, b);
		return a + b;
	}
}
