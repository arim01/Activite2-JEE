package ma.emsi.studentapp;

import jakarta.persistence.EntityManager;
import ma.emsi.studentapp.entities.Product;
import ma.emsi.studentapp.repos.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

//Application spring boot
@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner {

    @Autowired // injection des independances
    private ProductRepos prod;
    public static void main(String[] args) {

        SpringApplication.run(StudentAppApplication.class, args);
        //une fois que spring demarre il fait appel a la methode run
        //pour ajouter des donnees dns la table produits, on a besoin de spring data

    }

    @Override
    public void run(String... args) throws Exception
    {
        //Ajout
        prod.save(new Product(null,"prod1",500,15));
        prod.save(new Product(null,"prod2",600,15));
        prod.save(new Product(null,"prod3",700,15));
        prod.save(new Product(null,"produit4",700,15));
        List<Product> listes= prod.findAll();
        listes.forEach(p-> {
                    System.out.println(p.toString());
                }
                );

        //Recherche
        Product prod1=prod.findById(Long.valueOf(1)).get();
        System.out.println("Prod 1 : "+ prod1.getNom());
        System.out.println("Prod 1 : Price : "+ prod1.getPrice());

        //Maj
        Product produit1 = prod.findById(Long.valueOf(1)).orElse(null);
        if (produit1 != null) {
            // Modifier les propriétés du produit
            prod1.setNom("Ordinateur");
            prod1.setPrice(1000);
            prod1.setQuantite(200);

            // Enregistrer les modifications
            prod.save(prod1);

            // Afficher les informations mises à jour
            System.out.println("Prod 1 (après modification) : " + produit1.toString());
            System.out.println("Prod 1 (après modification) : Price : " + produit1.getPrice());
        }
        else {
            System.out.println("Produit introuvable.");
        }

        //Suppression
        Product produit4 = prod.findById(Long.valueOf(4)).orElse(null);
        if(produit4 != null){
            System.out.println("Le produit 4 va etre supprimé");
            prod.deleteById(produit4.getId());
            System.out.println("Le produit 4 est supprimé");
        }
        else System.out.println("Le produit 4 est introuvable");

    }


}
