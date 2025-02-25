package app;

import funciones.Alta;
import input.Input;
import output.Output;

public class App {
    private static final int ALTA = 1;
    private static final int VENTA = 2;
    private static final int COMPRA = 3;
    private static final int SALIR = 4;
    public static void main(String[] args) {

        int opcionMenu = Input.obtenerNumero();
        do {
            Output.mostrarMenu();
            switch (opcionMenu){
                case ALTA:
                    Alta.listaProductos();
                    break;
                case VENTA:
                    break;
                case COMPRA:
                    break;
                case SALIR:
                    break;
                default:
                    System.out.println("No es una opción válida.");
            }
        }while (opcionMenu != SALIR);

    }

}
