package EstudioPOO1.src.core.RockRollRadio.Programa;

import EstudioPOO1.src.core.Persona.Artista;
import EstudioPOO1.src.core.RockRollRadio.Utils.Genero;

public class Cancion {
    private String nombre;
    private Artista artista;
    private Genero genero;
    
    public Cancion(String nombre, Artista artista, Genero genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }

}
