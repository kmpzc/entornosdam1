import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        Usuario[] usuarios = crearUsuarios(numero);
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
    
    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];
        for (int i = 0; i < cantidad; i++) {
            Usuario usuario = new Usuario();
            System.out.println("Ingrese los datos del Usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            usuario.nombre = scanner.next();
            System.out.print("Apellidos: ");
            usuario.apellidos = scanner.next();
            System.out.print("Email: ");
            usuario.email = scanner.next();
            usuarios[i] = usuario;
        }
        return usuarios;
    }
}

