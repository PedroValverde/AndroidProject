package com.example.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controle.model.ProdutoEmprestimo;

public class TelaCadastroDeEmprestimo extends AppCompatActivity {
    EditText textModeloCadEmp, textNumeroSerieCadEmp, textCodgEmp, textOrgEmp, textDataEmp;
    Button cadastrarEmp, cancelarEmp;
    String modeloEmprestimoCad;

    ProdutoEmprestimo produto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_de_emprestimo);
        textModeloCadEmp = findViewById(R.id.textModeloCadEmp);
        textNumeroSerieCadEmp = findViewById(R.id.textNumeroDeSerieCadEmp);
        textCodgEmp = findViewById(R.id.codgEmprestimoCad);
        textOrgEmp = findViewById(R.id.textOrgaoEmpr);
        textDataEmp = findViewById(R.id.dataEmprestimo);


        cadastrarEmp = findViewById(R.id.btnCadastrarProdEmp);
        cancelarEmp = findViewById(R.id.btnCancelarProdEmp);

        cadastrarEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean validar = checarVazio();
                if(validar == true){
                    Toast.makeText(TelaCadastroDeEmprestimo.this, "Cadastro Realizado Com Sucesso", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });

        cancelarEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public boolean checarVazio() {
        if (textModeloCadEmp.length() == 0) {
            textModeloCadEmp.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textNumeroSerieCadEmp.length() == 0) {
            textNumeroSerieCadEmp.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textCodgEmp.length() == 0) {
            textCodgEmp.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textOrgEmp.length() == 0) {
            textOrgEmp.setError("Esse Campo é Obrigatorio");
            return false;
        }
        if (textDataEmp.length() == 0) {
            textDataEmp.setError("Defina a Data Do Emprestimo");
            return false;
        }

        return true;
    }

}