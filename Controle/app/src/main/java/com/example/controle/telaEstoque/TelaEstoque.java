package com.example.controle.telaEstoque;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.controle.R;
import com.example.controle.model.ProdutoEstoque;

import java.util.ArrayList;
import java.util.List;

public class TelaEstoque extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<ProdutoEstoque> listaProduto = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_estoque);
        recyclerView = findViewById(R.id.listaEstoque);
        //listagem de item
        this.criarProdutos();
        //Configurando adapter
        ListAdapterEstoque adapter = new ListAdapterEstoque(listaProduto);
        //configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }
    public void criarProdutos(){
        ProdutoEstoque produtos =new ProdutoEstoque("Placa Mãe","14785","ASROCK H61 1155 DDR3 HDMI VGA","Novo","LOGIN" );
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("MEMÓRIA","14756","KINGSTON 4GB DDR4 2666 ","Novo","LOGIN" );
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("MEMÓRIA","14757","KINGSTON 8GB DDR3 1600", "Novo", "GOV");
        listaProduto.add(produtos);

        produtos = new ProdutoEstoque("PROCESSADOR","13758","INTEL I3 3170", "Novo", "INTEL");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("PLACA DE REDE","14782","MYMAXX 10/100/1000", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("Placa Mãe","14785","ASROCK H61 1155 DDR3 HDMI VGA","Novo","LOGIN" );
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("PLACA DE VIDEO","14757","AFOXX GT240", "Semi-Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("Notebook VAYO","34578","SONY VAYO I5, 4GB, 500GB", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("HEADSET GAMER","47856","HP HEADSET C/MICROFONE", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("GABINETE OFFICE","12348","GABINETE MUTILASER OFFICE C/FONTE", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("FONTE ATX","78548","FONTE ATX 300W", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("PROCESSADOR","45712","INTEL I5 7600", "Novo", "INTEL");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("PLACA DE REDE","14782","MYMAXX 10/100/1000", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("PLACA DE VIDEO","7842","ASUS CERBERUS GTX 1050TI", "Semi-Novo", "LOGIN");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("NOTEBOOK SAMSUNG","456789","SAMSUNG ESSENTIALS I3, 4GB, 120GB SSD ", "Novo", "LOGIN");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("SSD","47856","SSD KINGSTON 480GB", "Novo", "LOGIN");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("HDD","12348","HDD SEAGATE 2TB", "Novo", "GOV");
        this.listaProduto.add(produtos);

        produtos = new ProdutoEstoque("FONTE ATX","78548","FONTE ATX 500W", "Novo", "GOV");
        this.listaProduto.add(produtos);



    }
}