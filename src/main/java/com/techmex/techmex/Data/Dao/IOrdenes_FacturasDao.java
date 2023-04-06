package com.techmex.techmex.Data.Dao;

import com.techmex.techmex.Data.Entities.Ordenes_FacturasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IOrdenes_FacturasDao extends JpaRepository<Ordenes_FacturasModel, Integer> {

    Optional<Ordenes_FacturasModel> findById(Integer id);
}
