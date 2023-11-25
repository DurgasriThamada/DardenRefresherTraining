package darden.refresher.student.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "Student DTO Model class information"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {

    private long id;
    @Schema(
            description = "Student first name"
    )
    @NotEmpty(message = "firstname should not be empty")
    private String firstName;
    @Schema(
            description = "Student last name"
    )
    @NotEmpty(message = "lastname should not be empty")
    private String lastName;
    @Schema(
            description = "Student email"
    )
    @NotEmpty(message = "email should not be empty")
    @Email(message = "email should be in correct format")
    private String emailId;

}
