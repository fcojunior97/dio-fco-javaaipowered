package dio.fco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DioFcoJavapoweredApplication {

	public String PORT= System.getenv("PORT");

	public static void main(String[] args) {
		SpringApplication.run(DioFcoJavapoweredApplication.class, args);
	}

}
