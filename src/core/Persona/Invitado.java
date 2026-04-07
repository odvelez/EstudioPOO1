package EstudioPOO1.src.core.Persona;

import java.util.ArrayList;
import EstudioPOO1.src.core.RockRollRadio.Programa.Emision;

public class Invitado extends Persona {
    private ArrayList<Emision> emisioneslist;

    public Invitado( String nombre) {
        super(nombre);
        this.emisioneslist = new ArrayList<>();
    }

    
}
