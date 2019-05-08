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
    //El atributo que tengo en la clase principal (Ver el import org.pizzeria... de arriba) es el mismo atributo (String xxx) que  va en la va a ir en esta clase ésta.
    public Cliente BuscarClienteNombre (String nombre);
    public Cliente BuscarClienteApellido (String apellido);
    public Cliente BuscarClienteDNI (String dni);
    public Cliente BuscarClienteCuit (String dni);
    public Cliente BuscarClienteCuil (String dni);
    public Cliente ActualizarClienteHab (String habilitado);
    public Cliente ActualizarClienteDNI (String dni);
}
