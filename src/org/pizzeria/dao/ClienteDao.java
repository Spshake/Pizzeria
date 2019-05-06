/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.persona.cliente.Cliente;

/**
 *
 * @author Gonzalo
 */
public interface ClienteDao {
    
    public Cliente buscarPorNombre (String nombre);
    
}
