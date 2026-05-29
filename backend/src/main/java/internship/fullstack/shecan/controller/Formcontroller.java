package internship.fullstack.shecan.controller;


import internship.fullstack.shecan.dto.Formdto;
import internship.fullstack.shecan.service.Formservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/form")
public class Formcontroller {

    public Formservice fromservice;

        @PostMapping
    public ResponseEntity<Formdto> createform(@RequestBody Formdto formdto){
        Formdto savedform=fromservice.createFrom(formdto);
        return  new ResponseEntity<>(savedform, HttpStatus.CREATED);
        }
    @GetMapping("{id}")
    public ResponseEntity<Formdto>getformById(@PathVariable("{id}") Long formId){
    Formdto formdto = fromservice.getFormById(formId);
     return ResponseEntity.ok(formdto);
    }

    @GetMapping
    public ResponseEntity<List<Formdto>> getallform(){
        List<Formdto> from= fromservice.getAllForm();
        return ResponseEntity.ok(from);
    }
}
