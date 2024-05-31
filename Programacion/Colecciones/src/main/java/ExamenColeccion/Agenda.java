/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenColeccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author daw
 */
public class Agenda {

    private HashSet<Contacto> lista;
    private String propietario;

    public Agenda(String propietario) {
        this.propietario = propietario;
        lista = new HashSet<>();
    }

    public HashSet<Contacto> getLista() {
        return lista;
    }

    public void setLista(HashSet<Contacto> lista) {
        this.lista = lista;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean añadir(Contacto a) throws TelefonoRepetidoException {
        try {
            for (Contacto contacto : lista) {
                if (contacto.getTelefono().equals(a.getTelefono())) {

                    throw new TelefonoRepetidoException(contacto);

                }
            }
            lista.add(a);
            return true;
        } catch (TelefonoRepetidoException x) {
            x.printStackTrace(System.out);

        }
        return false;

    }

    public boolean borrar(String nombre) {
        Iterator<Contacto> it = lista.iterator();
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

    public void listaragenda() {

        ArrayList<Contacto> ordenado = new ArrayList<>(lista);

    }

    @Override
    public String toString() {
        return "Agenda{" + "lista=" + lista + ", propietario=" + propietario + '}';
    }

}
