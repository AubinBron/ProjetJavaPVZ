package com.oxyl.coursepfback.persistance.dao;

import com.oxyl.coursepfback.MODEL.ZombieModel;

import java.util.List;

public interface ZombieInterfaceDAO {
    public List<ZombieModel> getAllZombies();
    public ZombieModel getZombieByNom(String nom);
    public List<ZombieModel> getZombiesByMapID(int mapID);
}
