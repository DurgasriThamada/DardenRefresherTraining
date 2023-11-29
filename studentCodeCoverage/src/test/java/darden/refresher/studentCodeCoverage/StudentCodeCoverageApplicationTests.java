package darden.refresher.studentCodeCoverage;

import darden.refresher.studentCodeCoverage.Entity.Student;
import darden.refresher.studentCodeCoverage.Repository.StudentRepo;
import darden.refresher.studentCodeCoverage.Service.Impl.StudentServiceImpl;
import darden.refresher.studentCodeCoverage.Service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentCodeCoverageApplicationTests {

	@MockBean
	private StudentRepo studentRepository;

	@Autowired
	private StudentService studentService;

	@Test
	public void testCreateStudent() {
		// Mock the behavior of studentRepository
		Student mockStudent = new Student(); // Create a mock student for testing
		when(studentRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(mockStudent));
		when(studentRepository.save(Mockito.any(Student.class))).thenReturn(mockStudent);

		// Call the service method
		Student result = studentService.createStudent(new Student());

		// Verify the result
		assertNotNull(result);
		// Add more assertions as needed
	}

	@Test
	public void testGetUserById() {
		// Mock the behavior of studentRepository
		Student mockStudent = new Student(); // Create a mock student for testing
		when(studentRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(mockStudent));

		// Call the service method
		Student result = studentService.getUserById(1L);

		// Verify the result
		assertNotNull(result);
		// Add more assertions as needed
	}

	@Test
	public void testUpdateStudent() {
		// Mock the behavior of studentRepository
		Student mockStudent = new Student(); // Create a mock student for testing
		when(studentRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(mockStudent));
		when(studentRepository.save(Mockito.any(Student.class))).thenReturn(mockStudent);

		// Call the service method
		Student result = studentService.updateStudent(new Student());

		// Verify the result
		assertNotNull(result);
		// Add more assertions as needed
	}
}