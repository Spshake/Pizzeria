/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.pedido.estado_pedido.EstadoPedido;

/**
 *
 * @author amx_c
 */
public class EstadoPedidoDaoHibernateImp implements EstadoPedidoDao{
    
    private final SessionFactory sessionFactory;

    public EstadoPedidoDaoHibernateImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public EstadoPedido buscarPorID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoPedido buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoPedido buscarPorDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
