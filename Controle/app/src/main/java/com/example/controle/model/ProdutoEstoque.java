package com.example.controle.model;

public class ProdutoEstoque {
    private String itemTipo, itemNumeroDeSerie, itemModelo, itemStatus, itemFornecedor;


    public ProdutoEstoque(){

    }

    public ProdutoEstoque(String itemTipo, String itemNumeroDeSerie, String itemModelo, String itemStatus, String itemFornecedor) {
        this.itemTipo = itemTipo;
        this.itemNumeroDeSerie = itemNumeroDeSerie;
        this.itemModelo = itemModelo;
        this.itemStatus = itemStatus;
        this.itemFornecedor = itemFornecedor;
    }

    public String getItemTipo() {
        return itemTipo;
    }

    public void setItemTipo(String itemTipo) {
        this.itemTipo = itemTipo;
    }

    public String getItemNumeroDeSerie() {
        return itemNumeroDeSerie;
    }

    public void setItemNumeroDeSerie(String itemNumeroDeSerie) {
        this.itemNumeroDeSerie = itemNumeroDeSerie;
    }

    public String getItemModelo() {
        return itemModelo;
    }

    public void setItemModelo(String itemModelo) {
        this.itemModelo = itemModelo;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemFornecedor() {
        return itemFornecedor;
    }

    public void setItemFornecedor(String itemFornecedor) {
        this.itemFornecedor = itemFornecedor;
    }
}
