package com.example.controle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.controle.DAO.UsuarioDAO;
import com.example.controle.entidades.Usuario;
import com.example.controle.util.BancoDeDados;

public class TelaDeCadastro extends AppCompatActivity {

    BancoDeDados db;
    EditText textNomeCad, textMatriculaCad, textSenhaCad, textEmailCad;
    RadioButton radioGestor, radioEstagiario;
    RadioGroup radioGroup;
    Button btnCadastrar, btnVoltar;
    String cargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);
        textNomeCad = findViewById(R.id.textNomeCad);
        textMatriculaCad = findViewById(R.id.textMatriculaCad);
        textEmailCad = findViewById(R.id.textEmailCad);
        textSenhaCad = findViewById(R.id.textSenhaCad);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnVoltar = findViewById(R.id.btnVoltar);
        radioGestor = findViewById(R.id.radioGestor);
        radioEstagiario = findViewById(R.id.radioEstagio);
        radioGroup = findViewById(R.id.radioGrupo);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioEstagio) {
                     cargo = "estagiario";

                } else if (i == R.id.radioGestor) {
                     cargo = "gestor";

                }
            }
        });
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean validarCampos = checarVazio();

                if (validarCampos == true) {
                    //iniciando banco de dados
                    db = Room.databaseBuilder(getApplicationContext(), BancoDeDados.class, "BancoUsuario").allowMainThreadQueries().build();
                    UsuarioDAO usuarioDAO = db.usuarioDAO();
                    Usuario usuario = new Usuario();

                    //capturando elementos
                    usuario.nome = textNomeCad.getText().toString();
                    usuario.matricula =Integer.parseInt( textMatriculaCad.getText().toString());
                    usuario.senha = textSenhaCad.getText().toString();
                    usuario.email = textEmailCad.getText().toString();
                    usuario.cargo = cargo;

                    usuarioDAO.insertAll(usuario);
                    Toast.makeText(TelaDeCadastro.this, "Cadastro Realizado com Sucesso", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

//        db=Room.databaseBuilder(getApplicationContext(),BancoDeDados.class,"Banco").allowMainThreadQueries().build();
//        Usuario usuario1 = new Usuario();
//        usuario1.nome = "Teste";
//        usuario1.matricula =111111;
//        usuario1.senha ="12345678";
//        usuario1.email="teste@teste.com";
//        usuario1.cargo="gestor";
//
//        UsuarioDAO usuarioDAO = db.usuarioDAO();
//        usuarioDAO.insertAll(usuario1);

    }

    public boolean checarVazio() {
        if (textNomeCad.length() == 0) {
            textNomeCad.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textMatriculaCad.length() == 0) {
            textMatriculaCad.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textSenhaCad.length() == 0) {
            textSenhaCad.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textEmailCad.length() == 0) {
            textEmailCad.setError("Esse Campo é Obrigatorio");
            return false;
        }

        return true;
    }







}