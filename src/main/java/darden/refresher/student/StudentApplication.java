package darden.refresher.student;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring boot REST API Documentation",
				description = "Spring boot REST API Documentation",
				contact = @Contact(
						name = "Durga Sri",
						email = "durgasrithamada@gmail.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring boot Student Management Documentation"
		)
)
public class StudentApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {

		SpringApplication.run(StudentApplication.class, args);
	}

}
