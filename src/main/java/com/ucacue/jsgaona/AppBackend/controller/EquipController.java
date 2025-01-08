package com.ucacue.jsgaona.AppBackend.controller;

import com.ucacue.jsgaona.AppBackend.model.Equip;
import com.ucacue.jsgaona.AppBackend.repository.EquipRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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

    @DeleteMapping("/{id}")
    public void deleteEquip(@PathVariable Long id) {
        equipRepository.deleteById(id);
    }
}