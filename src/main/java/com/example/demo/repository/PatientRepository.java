package com.example.demo.repository;

import com.example.demo.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

public interface PatientRepository extends JpaRepository<Patient,Long>
{
    List<Patient> findByNom(String mc);
    List<Patient> findByNomContains(String mc);
    List<Patient> findByNomContainsAndScore(String mc,double Score);
    List<Patient> findByNomContainsAndScoreLessThan(String mc,double Score);
    @Query("select p from Patient p where p.nom like :x ")
    List<Patient> FindPatients(@Param("x")String mc);



        }