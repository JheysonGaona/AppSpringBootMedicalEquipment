package com.ucacue.jsgaona.AppBackend.controller;

import com.ucacue.jsgaona.AppBackend.model.Equip;
import com.ucacue.jsgaona.AppBackend.repository.EquipRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/equips")
public class EquipController {

    @Autowired
    private EquipRepository equipRepository;

    @GetMapping
    public List<Equip> getAllEquips() {
        return equipRepository.findAll();
    }

    @GetMapping("/{id}")
    public Equip getEquipId(@PathVariable Long id) {
        return equipRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Equip createEquip(@RequestBody Equip equip) {
        equip.setLocalDateTime(LocalDateTime.now());
        return equipRepository.save(equip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equip> updateEquip(@PathVariable Long id, @RequestBody Equip updatedEquip) {
        try {
            // Buscar el equipo existente por ID
            Equip existingEquip = equipRepository.findById(id).orElse(null);
            if (existingEquip == null) {
                // Retornar 404 si el equipo no existe
                return ResponseEntity.notFound().build();
            }
            // Actualizar los campos del equipo existente con los datos recibidos
            existingEquip.setNameEquip(updatedEquip.getNameEquip());
            existingEquip.setBrand(updatedEquip.getBrand());
            existingEquip.setModel(updatedEquip.getModel());
            existingEquip.setSpecialization(updatedEquip.getSpecialization());
            existingEquip.setAmount(updatedEquip.getAmount());
            existingEquip.setUnitPrice(updatedEquip.getUnitPrice());
            // existingEquip.setLocalDateTime(LocalDateTime.now());
            // Guardar los cambios en la base de datos
            Equip savedEquip = equipRepository.save(existingEquip);
            // Retornar 200 OK con el equipo actualizado
            return ResponseEntity.ok(savedEquip);
        } catch (Exception e) {
            // Manejo de errores
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @DeleteMapping("/{id}")
    public void deleteEquip(@PathVariable Long id) {
        equipRepository.deleteById(id);
    }
}