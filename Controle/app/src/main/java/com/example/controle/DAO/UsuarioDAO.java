package com.example.controle.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.controle.entidades.Usuario;

import java.util.List;

@Dao
public interface UsuarioDAO {

    @Insert
    List<Long> insertAll(Usuario... usuarios);

    @Query("SELECT * FROM usuario WHERE matricula = :matricula AND senha = :senha")
    public Usuario[] validaLogin(Integer matricula, String senha);





}
