/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.pedido.precio;

/**
 *
 * @author Gonzalo
 */
public class Precio {
    private Precio precio;

    public Precio(Precio precio) {
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

   
    
}
