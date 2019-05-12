/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.pedido.precio.Precio;

/**
 *
 * @author Gonzalo
 */
public interface PrecioDao {
        //El atributo que tengo en la clase principal (Ver el import org.pizzeria... de arriba) es el mismo atributo (String xxx) que  va en la va a ir en esta clase ésta.
    public Precio buscarPorTamanioChica (String tamanio_chica);
    public Precio buscarPorTamanioMediana (String tamanio_mediana);
    public Precio buscarPorTamanioGrande (String tamanio_grande);
    public Precio buscarPorIngrediente (String ingrediente);
    public Precio buscarPorVerdura (String verdura);
    public Precio buscarPorFiambre (String fiambre);
    public Precio buscarPorQueso (String queso);
    public Precio buscarPorSabor (String sabor);
   
}
