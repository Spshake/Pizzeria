/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.factura.factura.Factura;

/**
 *
 * @author Gonzalo
 */
public interface FacturaDao {
        //El atributo que tengo en la clase principal (Ver el import org.pizzeria... de arriba) es el mismo atributo (String xxx) que  va en la va a ir en esta clase ésta.
    public Factura buscarPorPedido (String pedido);
    public Factura buscarPorNumeroDeFactura (String numeroDeFactura);
    public Factura buscarPorPuntoDeVenta (String puntoDeVenta);
    public Factura buscarPorTipoDeFactura (String tipoDeFactura);
}
