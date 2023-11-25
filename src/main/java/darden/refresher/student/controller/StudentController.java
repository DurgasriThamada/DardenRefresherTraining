package darden.refresher.student.controller;

import darden.refresher.student.Entity.Student;
import darden.refresher.student.Exception.ErrorDetails;
import darden.refresher.student.Exception.ResourceNotFoundException;
import darden.refresher.student.Service.StudentService;
import darden.refresher.student.dto.StudentDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("student")
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> createStudent(@RequestBody @Valid StudentDTO student){
        StudentDTO savedStudent = studentService.createStudent(student);
        return new ResponseEntity( savedStudent , HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        List<StudentDTO> allStudents= studentService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable("id") Long studentId){
        StudentDTO studentDTO= studentService.getUserById(studentId);
        return new ResponseEntity<>(studentDTO,HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable("id") Long studentId,@RequestBody @Valid StudentDTO studentDTO){
        studentDTO.setId(studentId);
        StudentDTO updatedStudentDTO = studentService.updateStudent(studentDTO);
        return new ResponseEntity<>(updatedStudentDTO, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId){
        studentService.deleteStudent(studentId);
        return  new ResponseEntity<>("Student successfully deleted!", HttpStatus.OK);
    }

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest){
//        ErrorDetails errorDetails = new ErrorDetails(
//                LocalDateTime.now(),
//                exception.getMessage(),
//                webRequest.getDescription(false),
//                "USER_NOT_FOUND"
//        );
//        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
//    }
}
