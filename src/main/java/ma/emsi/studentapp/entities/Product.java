package ma.emsi.studentapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Pour que ca soit annotation jpa, on utilise les annotations:
@Entity //a besoin d'un id toujours
//Avec Lombok
@Data // getter et setter, voir struture
@NoArgsConstructor @AllArgsConstructor // constructeur
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double price;
    private int quantite;




}
