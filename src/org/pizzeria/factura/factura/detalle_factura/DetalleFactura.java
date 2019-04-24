/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.factura.factura.detalle_factura;

import org.pizzeria.factura.factura.Factura;

/**
 *
 * @author Gonzalo
 */
public class DetalleFactura {
    
    private Factura factura;

    public DetalleFactura(Factura factura) {
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
    
    
}
