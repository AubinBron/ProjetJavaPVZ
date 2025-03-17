package com.oxyl.coursepfback.persistance.dao;

import com.oxyl.coursepfback.MODEL.PlanteModel;

import java.util.List;

public interface PlanteInterfaceDAO {

    public PlanteModel getPlanteByNom(String nom);
    public List<PlanteModel> getAllPlantes();
}
