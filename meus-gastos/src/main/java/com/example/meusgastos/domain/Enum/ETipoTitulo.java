package com.example.meusgastos.domain.Enum;

public enum ETipoTitulo {
    ARECEBER("A Receber"),
    APAGAR("A Pagar");
    private String valor;

    private ETipoTitulo(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
}
