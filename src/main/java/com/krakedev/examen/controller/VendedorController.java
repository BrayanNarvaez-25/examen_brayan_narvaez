package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private final AdminVentas adminVentas;

    public VendedorController(AdminVentas adminVentas) {
        this.adminVentas = adminVentas;
    }

    @PostMapping("/agregar")
    public void agregarVendedor(@RequestBody Vendedor vendedorRequest) {

        Vendedor vendedor = null;

        if (vendedorRequest.getTipo().equals("V")) {
            vendedor = new Vendedor(vendedorRequest.getCedula(), "V");
        }

        if (vendedorRequest.getTipo().equals("C")) {
            vendedor = new VendedorComision(vendedorRequest.getCedula());
        }

        if (vendedorRequest.getTipo().equals("M")) {
            vendedor = new VendedorMixto(vendedorRequest.getCedula());
        }

        vendedor.setSueldoFijo(vendedorRequest.getSueldoFijo());
        vendedor.setNumeroVentas(vendedorRequest.getNumeroVentas());
        vendedor.setComisionPorVenta(vendedorRequest.getComisionPorVenta());

        adminVentas.agregar(vendedor);
    }

    @GetMapping("/sueldo/{cedula}")
    public double calcularSueldoVendedor(@PathVariable String cedula) {
        return adminVentas.calcularSueldo(cedula);
    }
}
