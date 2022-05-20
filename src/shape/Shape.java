package shape;

import java.util.ArrayList;
import java.util.List;

public interface Shape {

    default void getName2() {
        System.out.println("default method");
    }

     float getSurface();
    float perimeter(ArrayList<Integer> sides);

    String getName();

    boolean getInfoOfZone(String nameZone);


}
