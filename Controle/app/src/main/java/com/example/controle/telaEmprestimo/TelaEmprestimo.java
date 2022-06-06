package com.example.controle.telaEmprestimo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.controle.R;
import com.example.controle.TelaCadastroDeEmprestimo;
import com.example.controle.model.ProdutoEmprestimo;
import com.example.controle.model.ProdutoEstoque;


import java.util.ArrayList;
import java.util.List;

public class TelaEmprestimo extends AppCompatActivity {

    RecyclerView recyclerViewEmprestimo;
    TextView textCadastrarEmprestimo;
    private List<ProdutoEmprestimo> listaEmprestimo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_emprestimo);
        textCadastrarEmprestimo = findViewById(R.id.textCadastrarEmprestimo);
        recyclerViewEmprestimo = findViewById(R.id.recyclerViewEmprestimo);

        textCadastrarEmprestimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(TelaEmprestimo.this, TelaCadastroDeEmprestimo.class);
                startActivity(inten);

            }
        });

        ListAdapterEmprestimo adapterEmprestimo = new ListAdapterEmprestimo(listaEmprestimo);

        this.criarEmprestimo();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewEmprestimo.setLayoutManager(layoutManager);
        recyclerViewEmprestimo.setHasFixedSize(true);
        recyclerViewEmprestimo.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewEmprestimo.setAdapter(adapterEmprestimo);


    }
    public void criarEmprestimo(){
        ProdutoEmprestimo emprestimos = new ProdutoEmprestimo("PLACA MÃE ASUS H81", "14789"
                , "478", "ADM", "24/01/2022","24/06/2022" );
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("MONITOR LED AOC 18’5", "24274"
                , "0021", "RH", "10/01/2022","10/01/2023" );
        this.listaEmprestimo.add(emprestimos);


        emprestimos = new ProdutoEmprestimo("NOTEBOOK VAYO I5, 8GB, 240SSD", "24574"
                , "0020", "CONTABILADAE", "23/11/2021","23/11/2022" );
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("NOTEBOOK SAMSUNG ESSENTIAL I3, 4GB, 240SSD", "24789", "0010"
                , "RH", "19/10/2021" ,"19/10/2022");
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("IMPRESSORA HP LASESJET", "12472"
                , "0022", "RH", "10/01/2022","10/01/2023");
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("NOTEBOOK SAMSUNG I3, 4GB, 240SSD", "14574"
                , "0023", "ADM", "19/10/2021","19/10/2022" );
        this.listaEmprestimo.add(emprestimos);

         emprestimos = new ProdutoEmprestimo("PLACA MÃE ASUS H81", "14789"
                , "478", "ADM", "24/01/2022","24/06/2022" );
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("NOTEBOOK SAMSUNG ESSENTIAL I3, 4GB, 240SSD", "24789", "0010"
                , "RH", "19/10/2021" ,"19/10/2022");
        this.listaEmprestimo.add(emprestimos);
        emprestimos = new ProdutoEmprestimo("NOTEBOOK VAYO I5, 8GB, 240SSD", "24574"
                , "0020", "CONTABILADAE", "23/11/2021","23/11/2022" );
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("MONITOR LED AOC 18’5", "24274"
                , "0021", "RH", "10/01/2022","10/01/2023" );
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("IMPRESSORA HP LASESJET", "12472"
                , "0022", "RH", "10/01/2022","10/01/2023");
        this.listaEmprestimo.add(emprestimos);

        emprestimos = new ProdutoEmprestimo("NOTEBOOK SAMSUNG I3, 4GB, 240SSD", "14574"
                , "0023", "ADM", "19/10/2021","19/10/2022" );
        this.listaEmprestimo.add(emprestimos);



    }
}