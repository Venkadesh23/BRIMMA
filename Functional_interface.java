import java.util.*;
import java.lang.*;

@FunctionalInterface
public interface Functional_interface {
    void  vehicle(String veh_name);
}

class  Main
{
    public static void main(String[] args) {

        Functional_interface fi= (veh_name) ->
        {
            System.out.print("Vehicle is " + veh_name);
        };
        fi.vehicle("CAR");
        fi.vehicle("BIKE");
    }
}

