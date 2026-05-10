package com.krakedev.examen.test.servicios;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

public class TestAdmin {
	public static void main(String[] args) {
        AdminVentas admin = new AdminVentas();

        // Vendedor normal
        Vendedor v1 = new Vendedor("1111111111");
        v1.setSueldoFijo(800.0);
        v1.setNumeroVentas(10);
        v1.setComisionPorVenta(50.0);

        // Vendedor por comisión
        VendedorComision v2 = new VendedorComision("2222222222");
        v2.setComisionPorVenta(75.0);
        v2.setNumeroVentas(8);

        // Vendedor mixto
        VendedorMixto v3 = new VendedorMixto("3333333333");
        v3.setSueldoFijo(1000.0);
        v3.setNumeroVentas(5);

        // Agregar vendedores
        admin.agregar(v1);
        admin.agregar(v2);
        admin.agregar(v3);

        // Probar calcularSueldo con los tres vendedores
        System.out.println("Sueldo Vendedor normal   (1111111111): " + admin.calcularSueldo("1111111111"));
        System.out.println("Sueldo VendedorComision  (2222222222): " + admin.calcularSueldo("2222222222"));
        System.out.println("Sueldo VendedorMixto     (3333333333): " + admin.calcularSueldo("3333333333"));

        // Probar con cédula inexistente
        Double sueldoInexistente = admin.calcularSueldo("9999999999");
        System.out.println("Sueldo cédula inexistente (9999999999): " + sueldoInexistente);
    }
}
