/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.persona.cocinero.Cocinero;

/**
 *
 * @author Gonzalo
 */
public interface CocineroDao {
    //El atributo que tengo en la clase principal (Ver el import org.pizzeria... de arriba) es el mismo atributo (String xxx) que  va en la va a ir en esta clase ésta.
    public Cocinero buscarPorPedido (String pedido);
    public Cocinero buscarPorTamanio (String tamanio);
    public Cocinero buscarPorVariedad (String variedad);
    public Cocinero buscarPorEstado (String estado);
    public Cocinero buscarPorCliente (String cliente);
    public Cocinero buscarPorFecha (String fecha);
}
