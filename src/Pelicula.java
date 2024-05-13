/*En Java, la palabra clave "record" se utiliza para crear un
 tipo de dato inmutable que representa datos con un conjunto
 fijo de atributos. Es similar a una clase, pero más concisa,
  ya que no requiere definir explícitamente los métodos getter
  y setter. Al usar la palabra clave "record", Java genera
   automáticamente estos métodos, el constructor y el método
    equals() y hashCode() para comparar objetos.*/


public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) {
}
