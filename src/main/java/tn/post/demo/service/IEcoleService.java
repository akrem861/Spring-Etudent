package tn.post.demo.service;

import tn.post.demo.model.Ecole;

import java.util.List;

public interface IEcoleService {

    List<Ecole> getAllEcole();
    Ecole getEcoleById(Long id);

    String addEcole(Ecole ecole);

    String UpdateEcole(Long id ,Ecole ecole);

    String DeleteEcole(Long id);
}
