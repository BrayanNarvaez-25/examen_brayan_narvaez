package com.krakedev.examen.test.entidades;

import com.krakedev.examen.entidades.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("1234567890","V");
        vendedor.setSueldoFijo(800.0);
        vendedor.setNumeroVentas(10);
        vendedor.setComisionPorVenta(50.0);

        System.out.println(vendedor);
	}

}
