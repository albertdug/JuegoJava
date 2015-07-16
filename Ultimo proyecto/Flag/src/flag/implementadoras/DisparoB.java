
package flag.implementadoras;

import flag.interfaces.IDisparo;

// CBDisparos.addItem("Evaluar nivel de energía"); es el indice 1
public class DisparoB implements IDisparo {

    public DisparoB(){}

    public void Disparar() {
        System.out.println("disparo del tipo B");
    }
}
