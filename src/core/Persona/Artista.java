package EstudioPOO1.src.core.Persona;

import java.util.ArrayList;
import EstudioPOO1.src.core.RockRollRadio.Programa.Cancion;

public class Artista extends Persona {
    private ArrayList<Cancion> cancioneslist;

    public Artista( String nombre) {
        super(nombre);
        this.cancioneslist = new ArrayList<>();
    }

    
}
