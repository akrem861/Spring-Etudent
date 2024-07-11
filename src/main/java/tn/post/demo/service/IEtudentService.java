package tn.post.demo.service;

import tn.post.demo.model.Etudent;

import java.util.List;

public interface IEtudentService {

    List<Etudent> getAllEtudent();
    Etudent getEtudentById(Long id);

    String addEtudent(Etudent etudent);

    String UpdateEtudent(Long id ,Etudent etudent);

    String DeleteEtudent(Long id);

}
