package ma.emsi.studentapp.Service;

import jakarta.transaction.Transactional;
import ma.emsi.studentapp.entities.Consultation;
import ma.emsi.studentapp.entities.Medecin;
import ma.emsi.studentapp.entities.Patient;
import ma.emsi.studentapp.entities.RendezVous;
import ma.emsi.studentapp.repos.ConsultationRepos;
import ma.emsi.studentapp.repos.MedecinRepos;
import ma.emsi.studentapp.repos.PatientRepos;
import ma.emsi.studentapp.repos.RdvRepos;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service // couche metier
@Transactional //les operations doivent etre Transactionnelle
public class HospitalServicesImpl implements HospitalServices {

    private PatientRepos pat;
    private MedecinRepos med;
    private ConsultationRepos cons;
    private RdvRepos rdR;

    public HospitalServicesImpl(PatientRepos p, ConsultationRepos c,RdvRepos r,MedecinRepos m) {
        this.pat = p;
        this.med=m;
        this.rdR=r;
        this.cons=c;
    }

    //Injection des dependances soit par constructeur sinon @Autowired pour chaque attribut



    @Override
    public Patient ajoutPatient(Patient p) {
        return pat.save(p);
    }

    @Override
    public Medecin ajoutMed(Medecin m) {
        return med.save(m);
    }

    @Override
    public RendezVous ajoutRdv(RendezVous rd) {
        //rd.setId(UUID.randomUUID().toString()); // random chaine de string qui est unique
        //uuid est un generateur
        return rdR.save(rd);
    }

    @Override
    public Consultation ajoutConsultation(Consultation c) {
        return this.cons.save(c);
    }
}
