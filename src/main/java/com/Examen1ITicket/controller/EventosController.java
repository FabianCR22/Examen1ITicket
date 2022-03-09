/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen1ITicket.controller;

/**
 *
 * @author fabia
 */


import com.Examen1ITicket.entity.Evento;
import com.Examen1ITicket.service.IEventoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class EventosController {
    
        @Autowired
    private IEventoService eventoService;
    
    @GetMapping("/home")
    public String index(Model model){
    
        List<Evento> listaPersonas=eventoService.getAllEvent();
        model.addAttribute("titulo","Eventos");
        model.addAttribute("eventos", listaPersonas);
        return "eventos";
    
    }
    
    @GetMapping("/eventosN")
    public String crearEvento(Model model){
    
        model.addAttribute("evento", new Evento());
        
        return "crear";
    
    }
    
    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento){
    
        eventoService.saveEvent(evento);
        return "redirect:/evento";
        
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long id){
    
        eventoService.delete(id);
        return "redirect:/evento";
    
    }

}
