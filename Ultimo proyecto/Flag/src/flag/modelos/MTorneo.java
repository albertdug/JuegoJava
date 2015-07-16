

package flag.modelos;

import java.util.Vector;


public class MTorneo {

    private Vector<MTanque> tanques;
    private int nroRondas;
    private int nroMinas;

    public MTorneo(){
    }

    public int getNroMinas() {
        return nroMinas;
    }

    public void setNroMinas(int nroMinas) {
        this.nroMinas = nroMinas;
    }

    public int getNroRondas() {
        return nroRondas;
    }

    public void setNroRondas(int nroRondas) {
        this.nroRondas = nroRondas;
    }

    public Vector<MTanque> getTanques() {
        return tanques;
    }

    public void setTanques(Vector<MTanque> tanques) {
        this.tanques = tanques;
    }

    
    
}
