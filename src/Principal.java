import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el numero de la pelicula de Star Wars que quiere consultar:");
        try{
            // Intentar leer el número de película ingresado por el usuario
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            // Buscar la película con el número ingresado
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            // Mostrar la información de la película en la consola
            System.out.println(pelicula);
            // Crear un objeto GeneradorDeArchivo para guardar la información
            // de la película en un archivo JSON
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            // Guardar la información de la película en un archivo JSON
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e){
            System.out.println("Número no encontrado "+e.getMessage());
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}
