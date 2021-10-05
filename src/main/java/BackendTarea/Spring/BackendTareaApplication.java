package BackendTarea.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("BackendTarea.Spring")
public class BackendTareaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendTareaApplication.class, args);
	}

}
