/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agregar.componentes.controlador;

import com.agregar.componentes.util.ExpresionUtil;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;

@ManagedBean(name="input_view")
@ViewScoped

/**
 *
 * @author jorge
 */
public class inputDinamico implements Serializable{
    private HtmlInputText input;

    public HtmlInputText getInput() {
        return input;
    }

    public void setInput(HtmlInputText input) {
        this.input = input;
    }
    
    @PostConstruct
    public HtmlInputText inputInit(){
        input= new HtmlInputText();
        
        ExpresionUtil valueExp = new ExpresionUtil();
        String value="#{usuario_bean.nombre}";
        //input.setId("nombre");
        
        input.setValueExpression("value", valueExp.getValueExpression(value));                        
        return input;
    }
}
