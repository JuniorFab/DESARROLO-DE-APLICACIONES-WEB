<?xml version="1.0" encoding="UTF-8"?>
<project-private xmlns="http://www.netbeans.org/ns/project-private/1">
    <editor-bookmarks xmlns="http://www.netbeans.org/ns/editor-bookmarks/2" lastBookmarkId="0"/>
    <open-files xmlns="http://www.netbeans.org/ns/projectui-open-files/2">
        <group/>
    </open-files>
</project-private>
                                                                                                                                                                         uctos/src/App/Aplicacion.java</file>
        </group>
    </open-files>
</project-private>
                                                                                                                                                                                                                                                                                                                                                                                                                                     vista.jTextNombre.setText(" ");
                vista.jTextPrecio.setText(" ");
                
            }
        });
        
        vista.jButtonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(vista.jTextCodigo.getText());
                Producto producto = dao.buscarproducto(codigo);
                if (producto != null) {
                    vista.jTextNombre.setText(producto.getNombre());
                    vista.jTextPrecio.setText(String.valueOf(producto.getPrecio()));
                    vista.jTextCantidad.setText(String.valueOf(producto.getCantidad()));
                    vista.jTextFieldCodigoLetras.setText(producto.getCodigo());

                    System.out.println("Información del Producto:");
                    System.out.println("Código: " + producto.getCodigo());
                    System.out.println("Nombre: " + producto.getNombre());
                    System.out.println("Precio: " + producto.getPrecio());
                    System.out.println("Cantidad: " + producto.getCantidad());
                    System.out.println("codigo " + producto.getCodigo());

                }
            }
        });

        this.vista.jButtonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int codigo = Integer.parseInt(vista.jTextCodigo.getText());
                boolean eliminado = dao.eliminarProducto(codigo);

            }
        });

        this.vista.jButtonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuffer codigo = new StringBuffer(vista.jTextFieldCodigoLetras.getText());
                codigo.setLength(20);
                StringBuffer nombre = new StringBuffer(vista.jTextNombre.getText());
                nombre.setLength(45);
                double precio = Double.parseDouble(vista.jTextPrecio.getText());
                int cantidad = Integer.parseInt(vista.jTextCantidad.getText());

                Producto nuevo = new Producto(codigo.toString(), nombre.toString(), precio, cantidad);

                if (dao.añadirProducto(nuevo)) {
                    System.out.println("Se ha introducido correctamente ");
                } else {
                    System.out.println("No se ha introducido");
                }
            }
        });

        this.vista.jButtonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idProducto = Integer.parseInt(vista.jTextCodigo.getText());
                StringBuffer codigo = new StringBuffer(vista.jTextFieldCodigoLetras.getText());
                codigo.setLength(20);
                StringBuffer nombre = new StringBuffer(vista.jTextNombre.getText());
                nombre.setLength(45);
                double precio = Double.parseDouble(vista.jTextPrecio.getText());
                int cantidad = Integer.parseInt(vista.jTextCantidad.getText());
                if (dao.modificar(idProducto, codigo.toString(), nombre.toString(), precio, cantidad)) {
                    System.out.println("Se ha insertado");
                }

            }
        });
    }

}
