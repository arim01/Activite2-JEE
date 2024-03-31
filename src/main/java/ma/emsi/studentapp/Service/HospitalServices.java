package ma.emsi.studentapp.Service;

import ma.emsi.studentapp.entities.Consultation;
import ma.emsi.studentapp.entities.Medecin;
import ma.emsi.studentapp.entities.Patient;
import ma.emsi.studentapp.entities.RendezVous;
import org.aspectj.apache.bcel.classfile.ConstantInteger;

public interface HospitalServices {

    Patient ajoutPatient(Patient p);
    Medecin ajoutMed(Medecin m);
    RendezVous ajoutRdv(RendezVous rd);
    Consultation ajoutConsultation(Consultation c);



}
