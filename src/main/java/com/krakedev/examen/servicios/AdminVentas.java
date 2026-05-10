package com.krakedev.examen.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.examen.entidades.Vendedor;

@Service
public class AdminVentas {
	
	private ArrayList<Vendedor> vendedores = new ArrayList<>();

    public void agregar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public Double calcularSueldo(String cedula) {
        for (Vendedor v : vendedores) {
            if (v.getCedula().equals(cedula)) {
                return v.calcularSueldo();
            }
        }
        return null;
    }
}
