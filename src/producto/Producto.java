package producto;
import java.util.UUID;
public class Producto {
    private static UUID id;
    String referencia;
    byte numUnidades;
    String fechaCreado;
    String fechaModificado;

    public Producto(UUID id, String referencia, byte numUnidades, String fechaCreado, String fechaModificado){
        this.id = id;
        this.referencia = referencia;
        this.numUnidades = numUnidades;
        this.fechaCreado = fechaCreado;
        this.fechaModificado = fechaModificado;
    }


}
