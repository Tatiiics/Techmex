package com.techmex.techmex.Data.Dao;

import com.techmex.techmex.Data.Entities.RolesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolesDao extends JpaRepository<RolesModel, Integer> {

    RolesModel findByName(String name);
}
