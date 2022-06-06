package com.example.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.controle.telaEmprestimo.TelaEmprestimo;
import com.example.controle.telaEstoque.TelaEstoque;

public class TelaDeOpcoes extends AppCompatActivity {

    TextView txtNome, txtMatricula, textCargo;
    Button btnEstoque, btnEmprestimo, btnAdcProduto, btnLogOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_opcoes);
        txtNome = findViewById(R.id.textNome);
        txtMatricula = findViewById(R.id.textMatricula);
        textCargo = findViewById(R.id.textCargo);

        btnEstoque = findViewById(R.id.btnEstoque);
        btnEmprestimo = findViewById(R.id.btnEmprestimo);
        btnAdcProduto = findViewById(R.id.btnAdcProduto);
        btnLogOut = findViewById(R.id.btnLogoff);


        btnEstoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaDeOpcoes.this, TelaEstoque.class);
                startActivity(intent);
            }
        });
        btnEmprestimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaDeOpcoes.this, TelaEmprestimo.class);
                startActivity(intent);
            }
        });
        btnAdcProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaDeOpcoes.this, TelaCadastroDeProduto.class);
                startActivity(intent);
            }
        });
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
}