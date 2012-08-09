/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agregar.componentes.util;

import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

/**
 *
 * @author jorge
 */
public class ExpresionUtil {
    public MethodExpression getMethodExpresion(String metod){
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ExpressionFactory ef = app.getExpressionFactory();
        MethodExpression expr=ef.createMethodExpression(context.getELContext(),metod, String.class, new Class[]{});
        
        return expr;
    }
    
    public ValueExpression getValueExpression(String backingBeanProperty){
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ValueExpression valueExp = elFactory.createValueExpression(context.getELContext(),backingBeanProperty,Object.class); 
        
        return valueExp;
    }
}
