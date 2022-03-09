/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen1ITicket.service;


import com.Examen1ITicket.entity.Evento;
import com.Examen1ITicket.repository.EventoRepository;
import java.util.List;
import java.util.Optional;
import com.Examen1ITicket.service.IEventoService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author fabia
 */

@Service
public class EventoService implements IEventoService{
    
        //Inyeccion de dependencias
    @Autowired
    private EventoRepository eventoRepository;
    
    @Override
    public List<Evento> getAllEvent(){
    
        return (List<Evento>)eventoRepository.findAll();
    
    }

    @Override
    public void saveEvent(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public Evento getEventById(long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id);
    }
    
    
    public void find(long id) {
        eventoRepository.findById(id);
    }
    
}
