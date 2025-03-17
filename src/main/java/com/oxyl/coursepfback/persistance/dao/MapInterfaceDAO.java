package com.oxyl.coursepfback.persistance.dao;

import com.oxyl.coursepfback.MODEL.MapModel;
import com.oxyl.coursepfback.MODEL.ZombieModel;

import java.util.List;
import java.util.Map;

public interface MapInterfaceDAO {
    public List<MapModel> getAllMaps();
    public MapModel getMapByID(int id);
    public MapModel getMapByZombieNom(String zombieNom);
}
