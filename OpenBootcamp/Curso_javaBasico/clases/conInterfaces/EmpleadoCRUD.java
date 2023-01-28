
package conInterfaces;

import sinInterfaces.Empleado;

import java.util.ArrayList;
import java.util.List;

//Dice lo que hay que hacer pero no como
public interface EmpleadoCRUD {

    void save (Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
