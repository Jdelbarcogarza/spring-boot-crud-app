package amigos.code.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// un repositorio es una interfaz. o sea una estructura
// que te permite accesar a la base de datos de una manera ordenada, sin tener
// codigo que haga queries a la DB por toda al codebase

// se encarga de acceder a la DB
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
