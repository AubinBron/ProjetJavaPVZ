package com.oxyl.coursepfback.service;

import com.oxyl.coursepfback.MODEL.PlanteModel;
import com.oxyl.coursepfback.MODEL.ZombieModel;

public class ZombieService {
    public ZombieModel zombieEffet(ZombieModel zombie, PlanteModel planteAttaque) {
        switch (planteAttaque.getEffet()){
            case "slow slow" -> zombie.setVitesse_de_deplacement(zombie.getVitesse_de_deplacement() / 2);
        }
        return zombie;
    }
    public ZombieModel zombieVie(ZombieModel zombie, PlanteModel planteAttaque) {
        zombie.setPoint_de_vie(zombie.getPoint_de_vie() - planteAttaque.getDegat_attaque());
        return zombie;
    }
}
