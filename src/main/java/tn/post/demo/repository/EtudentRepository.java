package tn.post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.post.demo.model.Etudent;

public interface EtudentRepository extends JpaRepository<Etudent,Long> {
}
