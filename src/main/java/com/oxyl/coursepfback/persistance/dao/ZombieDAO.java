package com.oxyl.coursepfback.persistance.dao;

import com.oxyl.coursepfback.MODEL.ZombieModel;

import java.util.ArrayList;
import java.util.List;

public class ZombieDAO extends DAO implements ZombieInterfaceDAO {

    public ZombieDAO() {
        super();
    }

    public List<ZombieModel> getAllZombies() {
        List<ZombieModel> zombies = new ArrayList<>();
        zombies = jdbcTemplate.query("SELECT * FROM Zombie", (rs, rownum)->{
            return new ZombieModel(rs.getString("nom"), rs.getInt("point_de_vie"), rs.getFloat("attaque_par_seconde"), rs.getInt("degat_attaque"), rs.getFloat("vitesse_de_deplacement"), rs.getString("chemin_image"), rs.getInt("id_map"));
        });
        return zombies;
    }

    public ZombieModel getZombieByNom(String nom){
        return jdbcTemplate.queryForObject("SELECT * FROM Zombie WHERE nom = ?", new Object[]{nom}, (rs, rownum)->{
            return new ZombieModel(rs.getString("nom"), rs.getInt("point_de_vie"), rs.getFloat("attaque_par_seconde"), rs.getInt("degat_attaque"), rs.getFloat("vitesse_de_deplacement"), rs.getString("chemin_image"), rs.getInt("id_map"));
        });
    }


    public List<ZombieModel> getZombiesByMapID(int mapID){
        return jdbcTemplate.query("SELECT * FROM Zombie WHERE id_map = ?", new Object[]{mapID}, (rs, rownum)->{
            return new ZombieModel(rs.getString("nom"), rs.getInt("point_de_vie"), rs.getFloat("attaque_par_seconde"), rs.getInt("degat_attaque"), rs.getFloat("vitesse_de_deplacement"), rs.getString("chemin_image"), rs.getInt("id_map"));
        });
    }

    public void addZombie(ZombieModel zombie){
        jdbcTemplate.update("INSERT INTO Zombie (nom, point_de_vie, attaque_par_seconde, degat_attaque, vitesse_de_deplacement, chemin_image, id_map) VALUES (?, ?, ?, ?, ?, ?, ?)", zombie.getNom(), zombie.getPoint_de_vie(), zombie.getAttaque_par_seconde(), zombie.getDegat_attaque(), zombie.getVitesse_de_deplacement(), zombie.getChemin_image(), zombie.getId_map());
    }

    public void deleteZombie(String nom){
        jdbcTemplate.update("DELETE FROM Zombie WHERE nom = ?", nom);
    }

}
