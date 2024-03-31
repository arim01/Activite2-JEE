package ma.emsi.studentapp.repos;

import ma.emsi.studentapp.entities.Consultation;
import ma.emsi.studentapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepos extends JpaRepository<Consultation, Long> {
}
