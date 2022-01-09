package mar.cod.conf;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

	@Bean
	public RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
		Function<PredicateSpec, Buildable<Route>> pred = p -> p.path("/addition-service").uri("lb://addition-service");
		Function<PredicateSpec, Buildable<Route>> pred0 = p -> p.path("/multiply-service").uri("lb://multiply-service");
		
		Function<PredicateSpec, Buildable<Route>> pred01 = p -> p.path("/get/**").uri("http://httpbin.org:80");
////		Function<PredicateSpec, Buildable<Route>> pred2=p-> p.path("/add/**").uri("lb://addition-service");
//		Function<PredicateSpec, Buildable<Route>> pred2_5 = p -> p.path("/add/**").uri("http://localhost:8080");
//		Function<PredicateSpec, Buildable<Route>> pred2_6 = p -> p.path("**/add/**").uri("http://mario.rista.com:8080");
//		Function<PredicateSpec, Buildable<Route>> pred3 = p -> p.path("/multip1ly/**").uri("lb://multiply-service");
		return builder.routes()
				.route("AAAAAAAAAAAA", pred01)
				.route(pred0)
				.route(pred)
//				.route(pred2_5).route(pred2_6).route(pred3)
				.build();
	}
}
