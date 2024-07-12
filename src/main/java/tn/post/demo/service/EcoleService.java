package tn.post.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;
import tn.post.demo.model.Ecole;
import tn.post.demo.repository.EcoleRepository;

import java.awt.*;
import java.util.List;
@Service
@RequiredArgsConstructor
public class EcoleService implements IEcoleService {
    private final EcoleRepository repository;


    @Override
    public List<Ecole> getAllEcole() {
        return repository.findAll();
    }

    @Override
    public Ecole getEcoleById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public String addEcole(Ecole ecole) {
        repository.save(ecole);
        return "ecole ajouter avec succée";
    }

    @Override
    public String UpdateEcole(Long id, Ecole ecole) {
        Ecole ecole1=repository.findById(id).get();
        ecole.setId(ecole1.getId());
        repository.save(ecole1);
        return "ecole updated successfuly";
    }

    @Override
    public String DeleteEcole(Long id) {
        repository.deleteById(id);
        return "ecole deleted ";
    }
}
