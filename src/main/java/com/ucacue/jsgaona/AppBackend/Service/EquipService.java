/*
package com.ucacue.jsgaona.AppBackend.Service;

import com.ucacue.jsgaona.AppBackend.model.Equip;
import com.ucacue.jsgaona.AppBackend.repository.EquipRepository;

import java.util.List;

public class EquipService {

    private final EquipRepository equipRepository;

    public EquipService(EquipRepository equipRepository) {
        this.equipRepository = equipRepository;
    }

    public List<Equip> listEquips() {
        return equipRepository.findAll();
    }

    public Equip saveEquip(Equip equip) {
        return equipRepository.save(equip);
    }

    public Equip getEquipById(Long id) {
        return equipRepository.findById(id).orElse(null);
        //        .orElseThrow(() -> new ResourceNotFoundException("Equipo no encontrado"));
    }

    public void deleteEquip(Long id) {
        equipRepository.deleteById(id);
    }
}
*/