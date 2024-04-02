package com.example.demo;

import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication<List> implements CommandLineRunner
{
    @Autowired
    private PatientRepository patientRepository;


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        patientRepository.save(new Patient(null,"Ilyass",new Date(2001, Calendar.SEPTEMBER,13),9));
        patientRepository.save(new Patient(null,"Oumama",new Date(2002, Calendar.JULY,27),0));
        patientRepository.save(new Patient(null,"Otiti",new Date(2002, Calendar.DECEMBER,21),10));
        patientRepository.save(new Patient(null,"Soumaya",new Date(2002, Calendar.JULY,17),0));

        java.util.List<Patient> Patients=patientRepository.findAll();
        Patients.forEach(p->{
            System.out.println(p.toString());
        });

        Patient patient=patientRepository.findById(Long.valueOf(1)).get();
        System.out.println("********************");
        System.out.println("********************");

        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDate());
        System.out.println(patient.getScore());

        System.out.println("********************");
        System.out.println("********************");

        java.util.List<Patient> patientList =patientRepository.FindPatients("%I%");
        patientList.forEach(p->{
            System.out.println(p.toString());
        });











    }
}
