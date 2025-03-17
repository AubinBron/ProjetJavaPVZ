package com.oxyl.coursepfback.unitaire.persistance;

import com.oxyl.coursepfback.MODEL.ZombieModel;
import com.oxyl.coursepfback.persistance.dao.ZombieDAO;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUnitaireDAO {
    @Test
    public void testZombieDAO(){
        ZombieModel zombie = new ZombieModel("Zombie de base", 100, (float)0.80, 10, (float)0.50, "images/zombie/zombie.png", 1);
        ZombieDAO zombieDAO = new ZombieDAO();
        assertEquals(zombieDAO.getZombieByNom("Zombie de base"), zombie);
    }
}
