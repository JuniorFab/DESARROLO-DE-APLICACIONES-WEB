
import Controladores.ControllerDepartament;
import modelo.DAOdepartamentoMYSQL;
import vistas.JFrameDepartamentos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daw
 */
public class AppEjemplo {
    public static void main(String[] args) {
        JFrameDepartamentos vista=new JFrameDepartamentos();
        vista.setVisible(true);
        DAOdepartamentoMYSQL dao=new DAOdepartamentoMYSQL();
        ControllerDepartament controlador =new ControllerDepartament(vista, dao);
        
        
        
        
    }
}
