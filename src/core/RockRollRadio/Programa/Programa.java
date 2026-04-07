package EstudioPOO1.src.core.RockRollRadio.Programa;

import java.util.ArrayList;
import java.util.List;

import EstudioPOO1.src.core.Persona.Locutor;

public class Programa {
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisionesList;
    private ArrayList<Locutor> locutoresList;
    
    public Programa(String nombre, Locutor locutoresList) {
        this.nombre = nombre;
        this.emisionesList = new ArrayList<>();
        this.locutoresList = new ArrayList<>();
    }

    

    public boolean addEmision(Emision emision) {
        if (!this.emisionesList.contains(emision)) {
            this.emisionesList.add(emision);
            return true;
        }
        return false;
    }

}
