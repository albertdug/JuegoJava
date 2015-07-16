
package flag.implementadoras;

import flag.interfaces.IMovimiento;

//CBMovimientos.addItem("Quedarse en el punto de inicio"); es el indice 2
public class MovimientoC implements IMovimiento{

    public MovimientoC(){}
    
    public void Moverse() {
        System.out.println("me muevo del tipo C");
    }
}
