/*
package br.com.fiap.agendaediario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.agendaediario.models.*;
import br.com.fiap.agendaediario.services.*;

import java.util.List;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping
    public ResponseEntity<List<Evento>> listarEventos() {
        List<Evento> eventos = agendaService.listarEventos();
        return ResponseEntity.ok(eventos);
    }

   // @PostMapping("/create")
   // public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento) {
       // Evento novoEvento = agendaService.criarEvento(evento);
        //return ResponseEntity.status(HttpStatus.CREATED).body(novoEvento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> obterEvento(@PathVariable Long id) {
        Evento evento = agendaService.obterEvento(id);
        if (evento != null) {
            return ResponseEntity.ok(evento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<Evento> atualizarEvento(@PathVariable Long id, @RequestBody Evento evento) {
        Evento eventoAtualizado = agendaService.atualizarEvento(id, evento);
        if (eventoAtualizado != null) {
            return ResponseEntity.ok(eventoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<?> deletarEvento(@PathVariable Long id) {
        boolean deletado = agendaService.deletarEvento(id);
        if (deletado) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
*/