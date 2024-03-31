package ma.emsi.studentapp.repos;

import ma.emsi.studentapp.entities.Medecin;
import ma.emsi.studentapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepos
        extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
