package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor{
	
	public VendedorComision(String cedula) {
        super(cedula, "C");
    }

    @Override
    public double calcularSueldo() {
        return this.getComisionPorVenta() * this.getNumeroVentas();
    }
}
