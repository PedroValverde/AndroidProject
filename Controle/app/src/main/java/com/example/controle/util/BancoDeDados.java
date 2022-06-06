package com.example.controle.util;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.controle.DAO.UsuarioDAO;
import com.example.controle.entidades.Usuario;

@Database(entities = {Usuario.class},version = 1)
public abstract class BancoDeDados extends RoomDatabase {
    public abstract UsuarioDAO usuarioDAO();

}
