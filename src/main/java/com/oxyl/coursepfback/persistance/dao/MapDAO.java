package com.oxyl.coursepfback.persistance.dao;

import com.oxyl.coursepfback.MODEL.MapModel;
import com.oxyl.coursepfback.MODEL.PlanteModel;
import com.oxyl.coursepfback.MODEL.ZombieModel;

import java.util.ArrayList;
import java.util.List;

public class MapDAO extends DAO implements MapInterfaceDAO {

    public MapDAO() {
        super();
    }

    public List<MapModel> getAllMaps() {
        List<MapModel> maps;
        maps = jdbcTemplate.query("SELECT * FROM Map", (rs, rownum)->{
            return new MapModel(rs.getInt("ligne"), rs.getInt("colonne"), rs.getString("chemin_image"));
        });
        return maps;
    }

    public MapModel getMapByID(int id){

        return jdbcTemplate.queryForObject("SELECT * FROM Map WHERE id_map = ?", new Object[]{id}, (rs, rownum)->{
            return new MapModel(rs.getInt("ligne"), rs.getInt("colonne"), rs.getString("chemin_image"));
        });
    }


    public MapModel getMapByZombieNom(String zombieNom){
        return new MapModel();
    }
}
