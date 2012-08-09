/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agregar.componentes.modelo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Jorge
 */
@ManagedBean(name="producto")
@ViewScoped

public class Producto implements Serializable{
    private int prodId;
    private String prodNombre;
    private String prodPrecio;

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdNombre() {
        return prodNombre;
    }

    public void setProdNombre(String prodNombre) {
        this.prodNombre = prodNombre;
    }

    public String getProdPrecio() {
        return prodPrecio;
    }

    public void setProdPrecio(String prodPrecio) {
        this.prodPrecio = prodPrecio;
    }    
    
}
