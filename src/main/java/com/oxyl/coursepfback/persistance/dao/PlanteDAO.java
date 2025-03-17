package com.oxyl.coursepfback.persistance.dao;

import org.springframework.stereotype.Repository;
import com.oxyl.coursepfback.MODEL.PlanteModel;

import java.util.List;

@Repository
public final class PlanteDAO extends DAO implements PlanteInterfaceDAO  {
    public PlanteDAO() {
        super();
    }

    public PlanteModel getPlanteByNom(String nom) {
        return jdbcTemplate.queryForObject("SELECT * FROM Plante WHERE nom = ?", new Object[]{nom}, (rs, rownum)->{
            return new PlanteModel(rs.getString("nom"), rs.getInt("point_de_vie"), rs.getFloat("attaque_par_seconde"), rs.getInt("degat_attaque"), rs.getInt("cout"), rs.getFloat("soleil_par_seconde"), rs.getString("effet"), rs.getString("chemin_image"));
        });
    }

    public List<PlanteModel> getAllPlantes() {
        return jdbcTemplate.query("SELECT * FROM Plante", (rs, rownum)->{
            return new PlanteModel(rs.getString("nom"), rs.getInt("point_de_vie"), rs.getFloat("attaque_par_seconde"), rs.getInt("degat_attaque"), rs.getInt("cout"), rs.getFloat("soleil_par_seconde"), rs.getString("effet"), rs.getString("chemin_image"));
        });
    }

    public void addPlante(PlanteModel plante) {
        jdbcTemplate.update("INSERT INTO Plante (nom, point_de_vie, attaque_par_seconde, degat_attaque, cout, soleil_par_seconde, effet, chemin_image) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", plante.getNom(), plante.getPoint_de_vie(), plante.getAttaque_par_seconde(), plante.getDegat_attaque(), plante.getCout(), plante.getSoleil_par_seconde(), plante.getEffet(), plante.getChemin_image());
    }

    public void deletePlante(String nom) {
        jdbcTemplate.update("DELETE FROM Plante WHERE nom = ?", nom);
    }
}