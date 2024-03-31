package ma.emsi.studentapp.repos;

import ma.emsi.studentapp.entities.Patient;
import ma.emsi.studentapp.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRepos extends JpaRepository<RendezVous, Long> {
}
