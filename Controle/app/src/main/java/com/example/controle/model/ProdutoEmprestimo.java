package com.example.controle.model;

public class ProdutoEmprestimo {
    private String modeloEmprestimo, numeroDeSerieEmprestimo,codigoDoEmprestimo, orgaoBeneficiadoEmprestimo,
            dataEmprestimo, dataDevoluçãoEmprestimo;


    public ProdutoEmprestimo(){

    }

    public ProdutoEmprestimo(String modeloEmprestimo,String numeroDeSerieEmprestimo,String codigoDoEmprestimo
            ,String orgaoBeneficiadoEmprestimo,String dataEmprestimo,String dataDevoluçãoEmprestimo) {
        this.modeloEmprestimo = modeloEmprestimo;
        this.numeroDeSerieEmprestimo = numeroDeSerieEmprestimo;
        this.codigoDoEmprestimo = codigoDoEmprestimo;
        this.orgaoBeneficiadoEmprestimo = orgaoBeneficiadoEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevoluçãoEmprestimo = dataDevoluçãoEmprestimo;
    }

    public String getModeloEmprestimo() {
        return modeloEmprestimo;
    }

    public void setModeloEmprestimo(String modeloEmprestimo) {
        this.modeloEmprestimo = modeloEmprestimo;
    }

    public String getNumeroDeSerieEmprestimo() {
        return numeroDeSerieEmprestimo;
    }

    public void setNumeroDeSerieEmprestimo(String numeroDeSerieEmprestimo) {
        this.numeroDeSerieEmprestimo = numeroDeSerieEmprestimo;
    }

    public String getCodigoDoEmprestimo() {
        return codigoDoEmprestimo;
    }

    public void setCodigoDoEmprestimo(String codigoDoEmprestimo) {
        this.codigoDoEmprestimo = codigoDoEmprestimo;
    }

    public String getOrgaoBeneficiadoEmprestimo() {
        return orgaoBeneficiadoEmprestimo;
    }

    public void setOrgaoBeneficiadoEmprestimo(String orgaoBeneficiadoEmprestimo) {
        this.orgaoBeneficiadoEmprestimo = orgaoBeneficiadoEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevoluçãoEmprestimo() {
        return dataDevoluçãoEmprestimo;
    }

    public void setDataDevoluçãoEmprestimo(String dataDevoluçãoEmprestimo) {
        this.dataDevoluçãoEmprestimo = dataDevoluçãoEmprestimo;
    }
}
