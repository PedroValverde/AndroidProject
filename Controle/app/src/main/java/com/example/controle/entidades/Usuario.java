package com.example.controle.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity(tableName = "usuario")
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name="matricula")
    public Integer matricula;
    @ColumnInfo(name = "senha")
    public String senha;
    @ColumnInfo(name="Nome")
    public String nome;
    @ColumnInfo(name="email")
    public String email;
    @ColumnInfo(name="cargo")
    public String cargo;


}
