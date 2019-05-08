/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.persona.empleado.Empleado;

/**
 *
 * @author Gonzalo
 */
public interface EmpleadoDao {
    //El atributo que tengo en la clase principal (Ver el import org.pizzeria... de arriba) es el mismo atributo (String xxx) que  va en la va a ir en esta clase ésta.
    public Empleado buscarPorNombre (String nombre);
}
