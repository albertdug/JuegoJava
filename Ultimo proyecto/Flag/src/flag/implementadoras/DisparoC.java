

package flag.implementadoras;

import flag.interfaces.IDisparo;

// CBDisparos.addItem("Disparar al de vida más baja"); es el indice 2
public class DisparoC implements IDisparo{

    public DisparoC(){}

    public void Disparar() {
        System.out.println("disparo del tipo C");
    }
}
