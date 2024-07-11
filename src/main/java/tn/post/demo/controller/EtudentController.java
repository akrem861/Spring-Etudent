package tn.post.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.post.demo.model.Etudent;
import tn.post.demo.service.IEtudentService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/etudent")
@RequiredArgsConstructor
public class EtudentController {

    private final IEtudentService service;
    private Map<String, String> response = new HashMap<>();



    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAllEtudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getEtudentById(id));
    }

    @PostMapping("")
    public ResponseEntity<?> addEtudent(@RequestBody Etudent etudent){
        response.clear();
        response.put("message", service.addEtudent(etudent));
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> UpdateEtudent(@PathVariable Long id ,@RequestBody Etudent etudent){
        response.clear();
        response.put("message", service.UpdateEtudent(id,etudent));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        response.clear();
        response.put("message", service.DeleteEtudent(id));
        return ResponseEntity.ok(response);
    }

}
