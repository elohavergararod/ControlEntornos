package input;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static int obtenerNumero(){
        return scanner.nextInt();
    }
    public static byte obtenerByte(){
        return scanner.nextByte();
    }
    public static String obtenerTexto(){
        return scanner.nextLine();
    }
}
