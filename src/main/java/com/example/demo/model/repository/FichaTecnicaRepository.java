/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.repository;

import com.example.demo.model.FichaTecnica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gggabriel
 */
public interface FichaTecnicaRepository extends JpaRepository<FichaTecnica, Long> {
    
}
