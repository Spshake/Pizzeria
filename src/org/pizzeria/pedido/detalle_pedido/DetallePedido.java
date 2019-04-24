/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.pedido.detalle_pedido;

import org.pizzeria.pizza.pizza.Pizza;
import org.pizzeria.pizza.variedadPizza.VariedadPizza;
import org.pizzeria.tipo.Tipo;



/**
 *
 * @author Gonzalo
 */
public class DetallePedido {
    private Pizza pizza;
    private VariedadPizza variedadpizza;
    private Tipo tipo;
    
    
    
    

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public VariedadPizza getVariedadpizza() {
        return variedadpizza;
    }

    public void setVariedadpizza(VariedadPizza variedadpizza) {
        this.variedadpizza = variedadpizza;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
    
    
    
    public DetallePedido(Pizza pizza, VariedadPizza variedadpizza, Tipo tipo) {
        this.pizza = pizza;
        this.variedadpizza = variedadpizza;
        this.tipo = tipo;
    }
    
}
