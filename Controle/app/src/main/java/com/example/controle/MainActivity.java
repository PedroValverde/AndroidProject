package com.example.controle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controle.DAO.UsuarioDAO;
import com.example.controle.entidades.Usuario;
import com.example.controle.util.BancoDeDados;

public class MainActivity extends AppCompatActivity {
    EditText editLogin, editPass;
    Button btnLogin, btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = findViewById(R.id.editLogin);
        editPass = findViewById(R.id.editPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnCadastro = findViewById(R.id.btnCad);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean validacao = ChecarVazio();
                if (validacao == true) {
                    int login = Integer.parseInt(editLogin.getText().toString());
                    String password = editPass.getText().toString();
                    if (validarLogin(login, password)) {
                        Toast.makeText(MainActivity.this, "Login Efetuado Com Sucesso", Toast.LENGTH_SHORT).show();
                        Intent inte = new Intent(MainActivity.this, TelaDeOpcoes.class);
                        startActivity(inte);
                    } else {
                        Toast.makeText(MainActivity.this, "Crendencias Incorretas", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, TelaDeCadastro.class);
                startActivity(inte);
            }
        });

    }

    public boolean ChecarVazio() {
        if (editLogin.length() == 0) {
            editLogin.setError("Digite a Sua Matricula");
            return false;
        }
        if (editPass.length() == 0) {
            editPass.setError("Digite a Sua Senha");
            return false;
        }
        return true;
    }

    public boolean validarLogin(Integer matricula, String senha) {
        BancoDeDados db = Room.databaseBuilder(getApplicationContext(), BancoDeDados.class, "BancoUsuario").allowMainThreadQueries().build();
        UsuarioDAO usuarioDAO = db.usuarioDAO();

        Usuario[] usuarios = usuarioDAO.validaLogin(matricula, senha);
        if (usuarios.length == 0) return false;
        return true;


//        Usuario[] usuario = usuarioDAO.validarLogin(nome,senha);
//        if(usuario.length == 0)
//            return false;
//            return true;
    }
}