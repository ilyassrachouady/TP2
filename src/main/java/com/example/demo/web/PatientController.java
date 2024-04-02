package com.example.demo.web;


import com.example.demo.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController
{
    @Autowired
    PatientRepository patientRepository;
    @GetMapping("/patients")

    public List<Patient> patients ()
    {
        return patientRepository.findAll();
    }
    @GetMapping("/patients/{id}")
    public Patient findpatients (@PathVariable Long id)
    {
        Patient patient =patientRepository.findById(id).orElse(null);
        return patient;
    }


}
