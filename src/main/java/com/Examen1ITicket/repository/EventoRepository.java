/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen1ITicket.repository;


import com.Examen1ITicket.entity.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fabia
 */

@Repository
public interface EventoRepository extends CrudRepository<Evento,Long>{
    
}
