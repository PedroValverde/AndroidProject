package com.example.controle.telaEstoque;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.controle.R;
import com.example.controle.model.ProdutoEstoque;


import java.util.List;

/* Gerenciador do RecyclerView da tela principal*/
public class ListAdapterEstoque extends RecyclerView.Adapter<ListAdapterEstoque.ItemLista> {


    private List<ProdutoEstoque> listaProduto;

    public ListAdapterEstoque(List<ProdutoEstoque> lista ) {
        this.listaProduto = lista;
    }

    @NonNull
    @Override
    /* Invocado sempre que o adapter for criar uma nova viewHolder (item da lista)*/
    public ItemLista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // criação de uma view a partir do arquivo xml
        View roupaXML = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista, parent, false);
        return new ItemLista(roupaXML);
    }

    @Override
    /* invocado para vincular a fonte de dados às suas respectivas viewHolders*/
    public void onBindViewHolder(@NonNull ItemLista itemLista, int position) {
        // define os dados a serem apresentados nos componentes da viewholder
            ProdutoEstoque produto = listaProduto.get(position);

            itemLista.setLabelTipoProd(produto.getItemTipo());
            itemLista.setLabelNumeroSerie(produto.getItemNumeroDeSerie());
            itemLista.setLabelModeloProd(produto.getItemModelo());
            itemLista.setLabelStatusProd(produto.getItemStatus());
            itemLista.setLabelFornecedorProd(produto.getItemFornecedor());


//        itemLista.setLabelTipoProd("Cartão de Memoria");
//        itemLista.setLabelNumeroSerie("1457");
//        itemLista.setLabelModeloProd("Kingsto DDR3");
//        itemLista.setLabelStatusProd("Novo");
//        itemLista.setLabelFornecedorProd("GOV");
//        itemLista.setLabelTipoProd(fonteDados.get(position).nome);
//        itemLista.setLabelNumeroSerie(String.valueOf(fonteDados.get(position).idade));
//        itemLista.setLabelModeloProd(fonteDados.get(position).senha);
//        itemLista.setLabelStatusProd(fonteDados.get(position).senha);
//        itemLista.setLabelFornecedorProd(fonteDados.get(position).senha);
//        Log.d("Teste","Vinculando Dados");
    }

    @Override
    public int getItemCount() {
        return listaProduto.size();
    }


    // classe interna que representa cada um dos itens da lista
    public static class ItemLista extends RecyclerView.ViewHolder {

        TextView labelTipoProd, labelNumeroSerieProd, labelModeloProd,labelStatusProd, labelFornecedorProd ;

        public ItemLista(View roupaXML) {
            super(roupaXML);
            // captura os componentes do layout
            labelTipoProd = roupaXML.findViewById(R.id.labelTipoProd);
            labelNumeroSerieProd = roupaXML.findViewById(R.id.labelNumeroDeSerieProd);
            labelModeloProd = roupaXML.findViewById(R.id.labelModeloProd);
            labelStatusProd = roupaXML.findViewById(R.id.labelStatusProd);
            labelFornecedorProd = roupaXML.findViewById(R.id.labelFornecedorProd);

        }

        public void setLabelTipoProd(String labelTipoProd) {
            this.labelTipoProd.setText(labelTipoProd);
        }
        public void setLabelNumeroSerie(String labelNumeroSerie) {
            this.labelNumeroSerieProd.setText(labelNumeroSerie);
        }
        public void setLabelModeloProd(String labelModeloProd) {
            this.labelModeloProd.setText(labelModeloProd);
        }
        public void setLabelStatusProd(String labelStatusProd) {
            this.labelStatusProd.setText(labelStatusProd);
        }
        public void setLabelFornecedorProd(String labelFornecedorProd) {
            this.labelFornecedorProd.setText(labelFornecedorProd);
        }

//        public void setLabelNome(String labelNome) {
//            this.labelNome.setText(labelNome);
//        }
//
//        public void setLabelIdade(String labelIdade) {
//            this.labelIdade.setText(labelIdade);
//        }
//
//        public void setLabelSenha(String labelSenha) {
//            this.labelSenha.setText(labelSenha);
//        }
    }
    // termino da classe interna ---------------------------------------------
}
