/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.pedido.estado_pedido;

/**
 *
 * @author Gonzalo
 */
public class EstadoPedido {
    
    private Integer id;
    private String nombre;
    private String descripcion;
    
    /**
     * Constructor por defecto de la clase Estado.
     */
    public EstadoPedido() {
    }
    
    /**
     * Constructor con todos los atributos de la clase Estado.
     * @param nombre
     * @param descripcion 
     */
    public EstadoPedido(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    /**
     * Método que devuelve true si el estado es Generada, sino devuelve false, El estado generada es de la factura.
     * @return 
     */
    public boolean esOrdenada() {
        return nombre.equals("Tomada");
    }
    
    
    public boolean esRecibida() {
        return nombre.equals("Pasada");
    }
    
            public boolean esDelivery() {
                return nombre.equals("Reparto");
            }
            
                    public boolean esEntregado() {
                        return nombre.equals("Se entregó");
                    }   
                    
                    public boolean noEntregado() {
                        return nombre.equals("No se entregó");
                    }   
            
            public boolean esRetirada() {
                return nombre.equals("Retira");
            }
            
                    public boolean seRetira() {
                       return nombre.equals("Fue retirada");
                    }
                    
                    public boolean noRetira() {
                       return nombre.equals("No se retiró");
                    }
            
            public boolean esCancelada() {
                return nombre.equals("Canceló");
            }
            
           
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
    
