package com.krakedev.examen.test.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.Vendedor;

public class TestVendedorJUnit {
	
	@Test
    void calcularSueldo_debeRetornarSueldoFijo() {
        Vendedor vendedor = new Vendedor("1111111111","V");
        vendedor.setSueldoFijo(800.0);

        double resultado = vendedor.calcularSueldo();

        assertEquals(800.0, resultado, 0.001);
    }
}
