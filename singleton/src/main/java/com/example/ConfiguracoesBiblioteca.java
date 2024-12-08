package com.example;

public class ConfiguracoesBiblioteca {
    private ConfiguracoesBiblioteca() {}

    private static ConfiguracoesBiblioteca instance = new ConfiguracoesBiblioteca();

    public static ConfiguracoesBiblioteca getInstance() {
        return instance;
    }

    private String nomeBiblioteca;
    private int maximoEmprestimosPermitidos;

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public int getMaximoEmprestimosPermitidos() {
        return maximoEmprestimosPermitidos;
    }

    public void setMaximoEmprestimosPermitidos(int maximoEmprestimosPermitidos) {
        this.maximoEmprestimosPermitidos = maximoEmprestimosPermitidos;
    }
}
