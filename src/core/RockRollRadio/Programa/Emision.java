package EstudioPOO1.src.core.RockRollRadio.Programa;

import java.util.ArrayList;

import EstudioPOO1.src.core.Persona.Invitado;

public class Emision {
    
    private int serial;
    private ArrayList<Cancion> cancionesList;
    private ArrayList<Invitado> invitadosList;
    private Programa programa;
    
    public Emision(Programa programa) {
        this.cancionesList = new ArrayList<>();
        this.invitadosList = new ArrayList<>();
        this.programa = programa;
    }
    
}
