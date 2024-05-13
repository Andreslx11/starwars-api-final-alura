import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {


    // Método para guardar un objeto Pelicula en formato JSON en un archivo
    public void guardarJson(Pelicula pelicula) throws IOException {

// Crear un objeto Gson para convertir el objeto Pelicula a JSON de forma legible
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Crear un FileWriter para escribir en un archivo con el nombre de la película en formato JSON
        FileWriter escritura = new FileWriter(pelicula.title()+".json");

        // Escribir el JSON del objeto Pelicula en el archivo
        escritura.write(gson.toJson(pelicula));
        // Cerrar el archivo
        escritura.close();
    }
}
