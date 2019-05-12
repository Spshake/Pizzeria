/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.pedido.precio.formaDePago.FormaDePago;

/**
 *
 * @author amx_c
 */
public class FormaDePagoDaoHibernateImp implements FormaDePagoDao{
    private final SessionFactory sessionFactory;

    public FormaDePagoDaoHibernateImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public FormaDePago buscarPorEfectivo(String efectivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FormaDePago buscarPorTarjeta(String tarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FormaDePago buscarPorDebito(String debito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
