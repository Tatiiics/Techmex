package com.techmex.techmex.Data.Dao;

import com.techmex.techmex.Data.Entities.LineasOrdenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ILineasOrdenDao extends JpaRepository<LineasOrdenModel, Integer> {

        Optional<LineasOrdenModel> findById(Integer id);
        @Query("SELECT lo FROM LineasOrdenModel lo WHERE lo.factura.factura_id = :id")
        List<LineasOrdenModel> findAllByFacturaId(@Param("id") Integer id);
}


