package tn.post.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.post.demo.model.Etudent;
import tn.post.demo.repository.EtudentRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class EtudentService implements IEtudentService {

    private final EtudentRepository repository;

    @Override
    public List<Etudent> getAllEtudent() {
        return repository.findAll();
    }

    @Override
    public Etudent getEtudentById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public String addEtudent(Etudent etudent) {
            repository.save(etudent);
        return "etudent add successfully";
    }

    @Override
    public String UpdateEtudent(Long id, Etudent etudentNew) {
        Etudent etudentOuled = repository.findById(id).orElseThrow();
                etudentNew.setId(etudentOuled.getId());
                repository.save(etudentNew);
        return "etudent updated successfully";
    }

    @Override
    public String DeleteEtudent(Long id) {
        repository.deleteById(id);
        return "Etudent deleted " ;
    }
}
