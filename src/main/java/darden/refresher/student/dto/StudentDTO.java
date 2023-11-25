package darden.refresher.student.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {

    private long id;
    @NotEmpty(message = "firstname should not be empty")
    private String firstName;
    @NotEmpty(message = "lastname should not be empty")
    private String lastName;
    @NotEmpty(message = "email should not be empty")
    @Email(message = "email should be in correct format")
    private String emailId;

}
