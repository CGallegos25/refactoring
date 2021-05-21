package com.mx.refactoring;

public class Refactoring {
	
	public void imprimeFactura() {
		Factura fac = new Factura("Deposito SA de CV", 20000);
		imprimeEncabezado(fac);
	}
	
	public void imprimeEncabezado(Factura factura) {
		System.out.println("Nombre: " + factura.getNombre());
		System.out.println("Cantidad: " + factura.getCantidad());
	}
}
