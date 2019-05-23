package geektime.spring.hello.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring!";
	}

}
