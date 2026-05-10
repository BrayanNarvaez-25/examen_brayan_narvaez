package com.krakedev.examen.entidades;

public class VendedorMixto extends Vendedor{
	
	public VendedorMixto(String cedula) {
        super(cedula);
    }

    @Override
    public double calcularSueldo() {
        return this.getSueldoFijo() + (this.getSueldoFijo() * 0.01 * this.getNumeroVentas());
    }
}
