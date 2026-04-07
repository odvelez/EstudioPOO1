package EstudioPOO1.src.core.Persona;

import EstudioPOO1.src.core.RockRollRadio.Programa.Programa;
import java.util.ArrayList;

public class Locutor extends Persona {
    private ArrayList<Programa> programaslist;

    public Locutor(String nombre) {
        super(nombre);
        this.programaslist = new ArrayList<>();
    }


}
