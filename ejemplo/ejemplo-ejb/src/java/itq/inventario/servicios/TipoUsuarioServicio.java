/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itq.inventario.servicios;

import itq.inventario.dao.*;
import itq.inventario.modelo.TipoUsuario;
import javax.ejb.Stateless;

/**
 *
 * @author SISTEMAS
 */
@Stateless
public class TipoUsuarioServicio extends Generico<TipoUsuario> {


    public TipoUsuarioServicio() {
        super(TipoUsuario.class);
    }
    
}
