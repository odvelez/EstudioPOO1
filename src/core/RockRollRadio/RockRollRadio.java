package EstudioPOO1.src.core.RockRollRadio;

import java.util.ArrayList;

import EstudioPOO1.src.core.Persona.Artista;
import EstudioPOO1.src.core.Persona.Invitado;
import EstudioPOO1.src.core.Persona.Locutor;
import EstudioPOO1.src.core.RockRollRadio.Programa.Cancion;
import EstudioPOO1.src.core.RockRollRadio.Programa.Emision;
import EstudioPOO1.src.core.RockRollRadio.Programa.Programa;

public class RockRollRadio {
    private ArrayList<Cancion> cancioneslist;
    private ArrayList<Artista> artistaslist;
    private ArrayList<Invitado> invitadoslist;
    private ArrayList<Locutor> locutoreslist;
    private ArrayList<Programa> programaslist;

    public RockRollRadio() {
        this.cancioneslist = new ArrayList<>();
        this.artistaslist = new ArrayList<>();
        this.invitadoslist = new ArrayList<>();
        this.locutoreslist = new ArrayList<>();
        this.programaslist = new ArrayList<>();

    }

    public boolean addLocutor(Locutor locutor) {
        if (!this.locutoreslist.contains(locutor)) {
            this.locutoreslist.add(locutor);
            return true;
        }
        return false;
    }

    public boolean addPrograma(Programa programa) {
        if (!this.programaslist.contains(programa)) {
            this.programaslist.add(programa);
            return true;
        }
        return false;
    }

    public boolean addArtista(Artista artista) {
        if (!this.artistaslist.contains(artista)) {
            this.artistaslist.add(artista);
            return true;
        }
        return false;
    }

    public boolean addCancion(Cancion cancion) {
        if (!this.cancioneslist.contains(cancion)) {
            this.cancioneslist.add(cancion);
            return true;
        }
        return false;
    }

    public boolean addEmision(Emision emision){
        Programa programa = emision.getPrograma();

        if (programa != null){
            return programa.addEmision(emision);
    }

    return false;
}

    public boolean addInvitado(Invitado invitado) {
        if (!this.invitadoslist.contains(invitado)) {
            this.invitadoslist.add(invitado);
            return true;
        }
        return false;
    }

    public Locutor getLocutor(int index){
        return locutoreslist.get(index);
    }

    public Artista getArtista(int index){
        return artistaslist.get(index);
    }

    public Programa getPrograma(int index){
        return programaslist.get(index);
    }

    public Cancion getCancion(int index){
        return cancioneslist.get(index);
    }
    
}
