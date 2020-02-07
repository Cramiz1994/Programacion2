/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itq.inventario.dao;

import itq.inventario.modelo.Movimiento;
import javax.ejb.Stateless;

/**
 *
 * @author SISTEMAS
 */
@Stateless
public class MovimientoDao extends Generico<Movimiento> {



    public MovimientoDao() {
        super(Movimiento.class);
    }
    
}
