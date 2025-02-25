package funciones;

import input.Input;
import output.Output;
import producto.Producto;

import java.util.HashMap;
import java.util.UUID;

public class Alta {
    static HashMap<UUID, Producto> listaProductos = new HashMap<>();

    public static void listaProductos(){
        UUID id = UUID.randomUUID();
        Output.mostrarTexto("Introduce la referencia (7 caracteres):");
        String referencia = Input.obtenerTexto();
        Output.mostrarTexto("Introduce el número de unidades:");
        byte numUnidades = Input.obtenerByte();
        Output.mostrarTexto("Introduce la fecha de creado (AAAAMMDDTHH:mm)");
        String fechaCreado= Input.obtenerTexto();
        String fechaModificado = null;

        listaProductos.get(new Producto(id, referencia,numUnidades,fechaCreado,fechaModificado));

    }
}
