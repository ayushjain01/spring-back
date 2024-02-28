package springboot.backend.springback.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.backend.springback.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // all crud database methods
}