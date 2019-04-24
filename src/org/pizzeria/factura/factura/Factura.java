/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.factura.factura;

import org.pizzeria.pedido.pedido.Pedido;

/**
 *
 * @author Gonzalo
 */
public class Factura {
    private Pedido pedido;
    private String numeroDeFactura;
    private String puntoDeVenta;
    private String tipoDeFactura;

    public Factura(Pedido pedido, String numeroDeFactura, String puntoDeVenta, String tipoDeFactura) {
        this.pedido = pedido;
        this.numeroDeFactura = numeroDeFactura;
        this.puntoDeVenta = puntoDeVenta;
        this.tipoDeFactura = tipoDeFactura;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNumeroDeFactura() {
        return numeroDeFactura;
    }

    public void setNumeroDeFactura(String numeroDeFactura) {
        this.numeroDeFactura = numeroDeFactura;
    }

    public String getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public void setPuntoDeVenta(String puntoDeVenta) {
        this.puntoDeVenta = puntoDeVenta;
    }

    public String getTipoDeFactura() {
        return tipoDeFactura;
    }

    public void setTipoDeFactura(String tipoDeFactura) {
        this.tipoDeFactura = tipoDeFactura;
    }
    
}
