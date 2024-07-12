package tn.post.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.post.demo.model.Ecole;
public interface EcoleRepository extends JpaRepository<Ecole,Long>  {
}