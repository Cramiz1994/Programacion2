/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itq.inventario.controlador;

import itq.inventario.modelo.Categoria;
import itq.inventario.servicios.CategoriaServicio;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author SISTEMAS
 */
@ManagedBean
//@Named(value = "categoriaControlador")
@ViewScoped
public class CategoriaControlador {

    @EJB
    private CategoriaServicio categoriaServicio;
    /**
     * Creates a new instance of CategoriaControlador
     */
    private Categoria categoria;

    @PostConstruct
    public void init() {
        categoria = new Categoria();
    }

    public void guardarCategoria() {
        this.categoria.setEstadpCategoria(Boolean.TRUE);
        categoriaServicio.guardarCategoriaServicio(categoria);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
