/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;


import Controller.ControllerOtro;

import Modelo.DaoProductoMysql;
import Vistas.VistaProducto;

/**
 *
 * @author Junior Fabricio
 */
public class Aplicacion {
    public static void main(String[] args) {
        DaoProductoMysql dao= new DaoProductoMysql();
        VistaProducto vista=new VistaProducto();
        
        Controller.ControllerOtro a=new ControllerOtro(vista, dao);
            
        
    }
}
