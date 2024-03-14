import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class principal{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();
    }

    public static void mostrarFechaYHora() {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHora.format(formato);
        System.out.println("Fecha y hora actual: " + fechaHoraFormateada);
    }
}

