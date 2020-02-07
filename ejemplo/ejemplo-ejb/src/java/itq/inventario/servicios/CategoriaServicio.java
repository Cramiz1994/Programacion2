/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itq.inventario.servicios;

import itq.inventario.dao.*;
import itq.inventario.modelo.Categoria;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author SISTEMAS
 */
@LocalBean
@Stateless
public class CategoriaServicio  {
@EJB
private CategoriaDao categoriaDao;
  

    public CategoriaServicio() {

    }

    public void guardarCategoriaServicio(Categoria categoria) {
    categoriaDao.create(categoria);
    }
    
}