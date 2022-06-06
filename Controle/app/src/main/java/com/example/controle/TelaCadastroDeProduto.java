package com.example.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastroDeProduto extends AppCompatActivity {

    EditText textTipoEquipamentoCad, textNumeroDeSerieCad, textStatusCad, textModeloCad, textFornecedorCad;
    Button btnCadastrarProd, btnCancelarProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_de_produto);

        textTipoEquipamentoCad = findViewById(R.id.textTipoEquipamentoCad);
        textNumeroDeSerieCad = findViewById(R.id.textNumeroDeSerieCad);
        textModeloCad = findViewById(R.id.textModeloCad);
        textStatusCad = findViewById(R.id.textStatusCad);
        textFornecedorCad = findViewById(R.id.textFornecedorCad);
        btnCadastrarProd = findViewById(R.id.btnCadastrarProd);
        btnCancelarProd = findViewById(R.id.btnCancelarProd);

        btnCadastrarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean validarCampos = checarVazioCad();
                if (validarCampos == true) {
                    Toast.makeText(TelaCadastroDeProduto.this, "Cadastro Realizado Com Sucesso", Toast.LENGTH_SHORT).show();
                     finish();
                }

            }
        });

        btnCancelarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    public boolean checarVazioCad() {
        if (textTipoEquipamentoCad.length() == 0) {
            textTipoEquipamentoCad.setError("Campo Obrigatorio");
            return false;
        }
        if (textNumeroDeSerieCad.length() == 0) {
            textNumeroDeSerieCad.setError("Campo Obrigatorio");
            return false;
        }
        if (textModeloCad.length() == 0) {
            textModeloCad.setError("Campo Obrigatorio");
            return false;
        }
        if (textStatusCad.length() == 0) {
            textStatusCad.setError("Campo Obrigatorio");
            return false;
        }
        if (textFornecedorCad.length() == 0) {
            textFornecedorCad.setError("Campo Obrigatorio");
            return false;
        }

        return true;
    }

}