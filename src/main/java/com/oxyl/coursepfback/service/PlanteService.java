package com.oxyl.coursepfback.service;

import com.oxyl.coursepfback.MODEL.PlanteModel;
import com.oxyl.coursepfback.MODEL.ZombieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanteService {
    public PlanteModel planteVie(PlanteModel plante, ZombieModel zombieAttaque) {
        plante.setPoint_de_vie(plante.getPoint_de_vie() - zombieAttaque.getDegat_attaque());
        return plante;
    }
}
