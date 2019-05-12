/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.factura.factura.Factura;

/**
 *
 * @author amx_c
 */
public class FacturaDaoHibernateImp implements FacturaDao{
    private final SessionFactory sessionFactory;

    public FacturaDaoHibernateImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Factura buscarPorPedido(String pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura buscarPorNumeroDeFactura(String numeroDeFactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura buscarPorPuntoDeVenta(String puntoDeVenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura buscarPorTipoDeFactura(String tipoDeFactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
