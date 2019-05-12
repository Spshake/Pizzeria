/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.pedido.detalle_pedido.DetallePedido;

/**
 *
 * @author amx_c
 */
public class DetallePedidoDaoHibernateImp implements DetallePedidoDao{
    private final SessionFactory sessionFactory;

    public DetallePedidoDaoHibernateImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public DetallePedido buscarPorPizza(String pizza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetallePedido buscarPorVariedadPizza(String variedadpizza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetallePedido buscarPorTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
