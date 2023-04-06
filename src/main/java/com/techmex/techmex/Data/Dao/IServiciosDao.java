package com.techmex.techmex.Data.Dao;

import com.techmex.techmex.Data.Entities.ServiciosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IServiciosDao extends JpaRepository<ServiciosModel, Integer> {

    Optional<ServiciosModel> findById(Integer id);
}
