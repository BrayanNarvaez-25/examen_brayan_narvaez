package com.krakedev.examen.test.servicios;

import com.krakedev.examen.servicios.AdminVentas;

public class TestNPE {

	public static void main(String[] args) {
		
		AdminVentas admin = new AdminVentas();

        Double sueldo = admin.calcularSueldo("9999999999");

        if(sueldo != null) {
        	double resultado = sueldo.doubleValue();
        	System.out.println("Sueldo: "+ resultado);
        }else {
        	System.out.println("No se encontró el vendedor, no se puede calcular el sueldo");
        }
        
	}

}
