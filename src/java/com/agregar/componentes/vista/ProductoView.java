/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agregar.componentes.vista;

import com.agregar.componentes.util.ExpresionUtil;
import com.icesoft.faces.component.ext.HtmlCommandButton;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UICommand;

/**
 *
 * @author Jorge
 */

@ManagedBean(name="producto_view")
@ViewScoped

public class ProductoView implements Serializable {
    private UICommand btnAddProd= new HtmlCommandButton();
    private ExpresionUtil valueExp = new ExpresionUtil();    
    
    
    public ProductoView(){                
        btnAddProd.setActionExpression(valueExp.getMethodExpresion("#{mostrar_nombre.mostrar('Quesadilla Foranea')}"));
        btnAddProd.setValue("Hola");
    }
    
    public ProductoView(String metodo, String value){
        //metodo deve ser algo como: mostrar_nombre.mostrar('Quesadilla Foranea')
        btnAddProd.setActionExpression(valueExp.getMethodExpresion("#{"+metodo+"}"));
        btnAddProd.setValue(value);
    }
    public UICommand getBtnAddProd() {
        return btnAddProd;
    }

    public void setBtnAddProd(UICommand btnAddProd) {
        this.btnAddProd = btnAddProd;
    }        
    /*
     * boton.setActionExpression(expresion.getMethodExpresion("#{usuario_controler.agregarUsuario}"));        
        
        String value="#{usuario_bean.nombre}";        
        input.setValueExpression("value", expresion.getValueExpression(value));
     */
}
