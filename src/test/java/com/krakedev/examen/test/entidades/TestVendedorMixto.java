package com.krakedev.examen.test.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorComision;

public class TestVendedorMixto {
	
	 @Test
	    void calcularSueldo_debeRetornarComisionPorVentas() {
	        VendedorComision vendedor = new VendedorComision("2222222222");
	        vendedor.setComisionPorVenta(50.0);
	        vendedor.setNumeroVentas(10);

	        double resultado = vendedor.calcularSueldo();

	        // 50.0 * 10 = 500.0
	        assertEquals(500.0, resultado, 0.001);
	    }
}
