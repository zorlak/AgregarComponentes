/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agregar.componentes.controlador;

import com.agregar.componentes.modelo.Producto;
import com.agregar.componentes.util.FacesUtils;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Jorge
 */
@ManagedBean(name="mostrar_nombre")
@RequestScoped

public class MostrarNombre {
    
    public void mostrar(String mensaje){
        Producto producto=(Producto)FacesUtils.getManagedBean("producto");
        producto.setProdNombre(mensaje);
    }
    
}
