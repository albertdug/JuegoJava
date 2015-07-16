
package flag.implementadoras;

import flag.interfaces.IDisparo;

// CBDisparos.addItem("Evaluar nivel de vida"); el el indice 0
public class DisparoA implements IDisparo {

    public DisparoA(){}

    public void Disparar() {
        System.out.println("disparo del tipo A");
    }

}
