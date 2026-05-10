package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor{
	
	public VendedorComision(String cedula) {
        super(cedula);
    }

    @Override
    public double calcularSueldo() {
        return this.getComisionPorVenta() * this.getNumeroVentas();
    }
}
