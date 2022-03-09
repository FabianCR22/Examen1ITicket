/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen1ITicket.service;

/**
 *
 * @author fabia
 */

import com.Examen1ITicket.entity.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface IEventoService {
    
    public List<Evento> getAllEvent();
    public void saveEvent(Evento evento);
    public Evento getEventById(long id);
    public void delete(long id);
    
}
