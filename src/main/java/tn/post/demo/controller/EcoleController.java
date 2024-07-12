package tn.post.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.post.demo.model.Ecole;
import tn.post.demo.service.IEcoleService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ecole")
@RequiredArgsConstructor
public class EcoleController {
    private final IEcoleService service;
    private Map<String,String> respponse=new HashMap<>();
    @GetMapping("")
    public ResponseEntity<?>getAll(){return ResponseEntity.ok(service.getAllEcole());}
    @GetMapping("/{id}")
    public ResponseEntity<?>getById(@PathVariable Long id){return  ResponseEntity.ok(service.getEcoleById(id));}
    @PostMapping("")
    public ResponseEntity<?>addEcole(@RequestBody Ecole ecole){
        respponse.clear();
        respponse.put("message", service.addEcole(ecole));
        return ResponseEntity.ok(respponse);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?>UdateEcole(@PathVariable Long id, @RequestBody Ecole ecole){
        respponse.clear();
        respponse.put("messae",service.UpdateEcole(id,ecole));
        return ResponseEntity.ok(respponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?>DeleteEcole(@PathVariable Long id){
        respponse.clear();
        respponse.put("messae",service.DeleteEcole(id));
        return ResponseEntity.ok(respponse);
    }
}
