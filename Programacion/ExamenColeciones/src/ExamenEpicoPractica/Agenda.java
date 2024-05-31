/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEpicoPractica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Junior Fabricio
 */
public class Agenda {

    HashSet<Contacto> listacontacto;
    private String propietario;

    public Agenda(String propietario) {
        this.propietario = propietario;
        listacontacto = new HashSet<>();
    }

    public HashSet<Contacto> getListacontacto() {
        return listacontacto;
    }

    public void setListacontacto(HashSet<Contacto> listacontacto) {
        this.listacontacto = listacontacto;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Agenda{" + "listacontacto=" + listacontacto + ", propietario=" + propietario + '}';
    }

    public boolean AgregarContacto(Contacto o) {
        try {
            for (Contacto contacto : listacontacto) {
                if (contacto.getTelefono().equals(o.getTelefono())) {
                    throw new TelefonoRepetidoException(contacto);
                }
            }
            listacontacto.add(o);
            return true;
        } catch (TelefonoRepetidoException ex) {
            ex.printStackTrace(System.out);
        }
        return false;

    }

    public boolean BorrarContacto(String nombre) {

        Iterator<Contacto> it = listacontacto.iterator();
        Contacto c = null;
        while (it.hasNext()) {
            c = it.next();
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean BuscarNombre(String nombre) {
        for (Contacto contacto : listacontacto) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(contacto);
                return true;
            }
        }
        return false;

    }

    public void listar() {

        ArrayList<Contacto> ordenado = new ArrayList<>(listacontacto);

        Collections.sort(ordenado);
        
        for (Contacto contacto : ordenado) {
            System.out.println(contacto);
        }

    }
}
