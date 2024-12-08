package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConfiguracoesBibliotecaTest {

    @Test
    public void deveRetornarNomeBiblioteca() {
        ConfiguracoesBiblioteca.getInstance().setNomeBiblioteca("Biblioteca Central");
        assertEquals("Biblioteca Central", ConfiguracoesBiblioteca.getInstance().getNomeBiblioteca());
    }

    @Test
    public void deveRetornarMaximoEmprestimosPermitidos() {
        ConfiguracoesBiblioteca.getInstance().setMaximoEmprestimosPermitidos(5);
        assertEquals(5, ConfiguracoesBiblioteca.getInstance().getMaximoEmprestimosPermitidos());
    }

}