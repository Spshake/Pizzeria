/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.pedido.pedido;

import org.pizzeria.persona.cliente.Cliente;
import org.pizzeria.persona.empleado.Empleado;

/**
 *
 * @author Gonzalo
 */
public class Pedido {
    private Cliente cliente;
    //Ctrl + Espacio = import

private Empleado empleado;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Pedido(Cliente cliente, Empleado empleado) {
        this.cliente = cliente;
        this.empleado = empleado;
    }


}
