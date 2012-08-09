/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agregar.componentes.vista;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIForm;
import javax.faces.component.html.HtmlForm;

/**
 *
 * @author Jorge
 */
@ManagedBean(name="lista_prod_view")
@ViewScoped

public class ListaProductosView {
    private List<ProductoView> listaProdView;
    private UIForm uiForm=new HtmlForm();
    private ProductoView productoView= new ProductoView();

    public List<ProductoView> getListaProdView() {
        return listaProdView;
    }

    public void setListaProdView(List<ProductoView> listaProdView) {
        this.listaProdView = listaProdView;
    }

    public UIForm getUiForm() {
        uiForm.getChildren().add(productoView.getBtnAddProd());
        return uiForm;
    }

    public void setUiForm(UIForm uiForm) {
        this.uiForm = uiForm;
    }
    
    
        
}
