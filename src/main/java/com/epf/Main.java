package com.epf;

import com.oxyl.coursepfback.MODEL.MapModel;
import com.oxyl.coursepfback.MODEL.PlanteModel;
import com.oxyl.coursepfback.MODEL.ZombieModel;
import com.oxyl.coursepfback.persistance.dao.MapDAO;
import com.oxyl.coursepfback.persistance.dao.PlanteDAO;
import com.oxyl.coursepfback.persistance.dao.ZombieDAO;
import com.oxyl.coursepfback.service.PlanteService;
import com.oxyl.coursepfback.service.ZombieService;

import java.util.List;

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        PlanteDAO planteDAO = new PlanteDAO();
        ZombieDAO zombieDAO = new ZombieDAO();

        ZombieModel zombie = new ZombieModel("test",10,10,10,10,"image",1);

        zombieDAO.addZombie(zombie);

        List<ZombieModel> zombies = zombieDAO.getAllZombies();

        for (ZombieModel z : zombies) {
            z.afficherZombie();
        }

        zombieDAO.deleteZombie("test");

        /*PlanteModel plante = new PlanteModel("test", 10,10,10,10,10,"effet","image");

        planteDAO.addPlante(plante);

        List<PlanteModel> plantes = planteDAO.getAllPlantes();

        for (PlanteModel p : plantes) {
            p.afficherPlante();
        }

        planteDAO.deletePlante("test");*/
    }





}
