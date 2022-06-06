package com.example.controle.telaEmprestimo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.controle.R;
import com.example.controle.model.ProdutoEmprestimo;

import java.util.List;

/* Gerenciador do RecyclerView da tela principal*/
public class ListAdapterEmprestimo extends RecyclerView.Adapter<ListAdapterEmprestimo.ItemLista> {


    private List<ProdutoEmprestimo> listaEmprestimo;

    public ListAdapterEmprestimo(List<ProdutoEmprestimo> listaEmprestimo) {
        this.listaEmprestimo = listaEmprestimo;
    }

    @NonNull
    @Override
    /* Invocado sempre que o adapter for criar uma nova viewHolder (item da lista)*/
    public ItemLista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // criação de uma view a partir do arquivo xml
        View roupaaXML = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.emprestimo_lista, parent, false);
        return new ItemLista(roupaaXML);
    }

    @Override
    /* invocado para vincular a fonte de dados às suas respectivas viewHolders*/
    public void onBindViewHolder(@NonNull ItemLista itemListaEmprestimo, int position) {
        // define os dados a serem apresentados nos componentes da viewholder
        ProdutoEmprestimo emprestimo = listaEmprestimo.get(position);

        itemListaEmprestimo.setLabelModeloProdEmprestimo(emprestimo.getModeloEmprestimo());
        itemListaEmprestimo.setLabelNumeroSerieEmprestimo(emprestimo.getNumeroDeSerieEmprestimo());
        itemListaEmprestimo.setLabelCodEmprestimo(emprestimo.getCodigoDoEmprestimo());
        itemListaEmprestimo.setLabelOrgaoEmprestimo(emprestimo.getOrgaoBeneficiadoEmprestimo());
        itemListaEmprestimo.setLabelDataEmprestimo(emprestimo.getDataEmprestimo());
        itemListaEmprestimo.setLabelDataDevolucaoEmprestimo(emprestimo.getDataDevoluçãoEmprestimo());

//            itemLista.setLabelTipoProd(produto.getItemTipo());
//            itemLista.setLabelNumeroSerie(produto.getItemNumeroDeSerie());
//            itemLista.setLabelModeloProd(produto.getItemModelo());
//            itemLista.setLabelStatusProd(produto.getItemStatus());
//            itemLista.setLabelFornecedorProd(produto.getItemFornecedor());
//


    }

    @Override
    public int getItemCount() {
        return listaEmprestimo.size();
    }


    // classe interna que representa cada um dos itens da lista
    public static class ItemLista extends RecyclerView.ViewHolder {

        TextView labelModeloProdEmprestimo, labelNumeroSerieEmprestimo, labelCodEmprestimo,
                labelOrgaoEmprestimo, labelDataEmprestimo, labelDataDevolucaoEmprestimo;

        public ItemLista(View roupaaXML) {
            super(roupaaXML);
            // captura os componentes do layout
            labelModeloProdEmprestimo = roupaaXML.findViewById(R.id.labelModeloProdEmprestimo);
            labelNumeroSerieEmprestimo = roupaaXML.findViewById(R.id.labelNumeroDeSerieProdEmprestimo);
            labelCodEmprestimo = roupaaXML.findViewById(R.id.labelCodgEmprestimo);
            labelOrgaoEmprestimo = roupaaXML.findViewById(R.id.labelOrgaoEmprestimo);
            labelDataEmprestimo = roupaaXML.findViewById(R.id.labelDataEmprestimo);
            labelDataDevolucaoEmprestimo = roupaaXML.findViewById(R.id.labelDataDevolucaoEmprestimo);

        }

        public void setLabelModeloProdEmprestimo(String labelModeloProdEmprestimo) {
            this.labelModeloProdEmprestimo.setText(labelModeloProdEmprestimo);
        }

        public void setLabelNumeroSerieEmprestimo(String labelNumeroSerieEmprestimo) {
            this.labelNumeroSerieEmprestimo.setText(labelNumeroSerieEmprestimo);
        }

        public void setLabelCodEmprestimo(String labelCodEmprestimo) {
            this.labelCodEmprestimo.setText(labelCodEmprestimo);

        }

        public void setLabelOrgaoEmprestimo(String labelOrgaoEmprestimo) {
            this.labelOrgaoEmprestimo.setText(labelOrgaoEmprestimo);

        }

        public void setLabelDataEmprestimo(String labelDataEmprestimo) {
            this.labelDataEmprestimo.setText(labelDataEmprestimo);

        }

        public void setLabelDataDevolucaoEmprestimo(String labelDataDevolucaoEmprestimo) {
            this.labelDataDevolucaoEmprestimo.setText(labelDataDevolucaoEmprestimo);
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
