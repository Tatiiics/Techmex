package com.techmex.techmex.Data.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="roles")
public class RolesModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rol_id;

    @Column(nullable=false, unique=true)
    private String name;
    @ManyToMany(mappedBy="roles")
    private List<UsuariosModel> users;

 }