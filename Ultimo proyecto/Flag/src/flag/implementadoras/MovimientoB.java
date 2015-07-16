
package flag.implementadoras;

import flag.interfaces.IMovimiento;

//CBMovimientos.addItem("Caminar por los bordes"); es el indice 1
public class MovimientoB implements IMovimiento{

    public MovimientoB(){}

    public void Moverse() {
        System.out.println("me muevo del tipo B");
    }
}
