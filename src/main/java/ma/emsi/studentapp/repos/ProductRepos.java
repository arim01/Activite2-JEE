package ma.emsi.studentapp.repos;

import ma.emsi.studentapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepos extends JpaRepository<Product, Long > //class et id
{
    //Nous permet d'ajouter des produits
}
