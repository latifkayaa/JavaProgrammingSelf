package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static day30_CustomClass.utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(numbers);

        System.out.println(sum(10,20));
        System.out.println(sum(100,200));
        System.out.println(subtract(100,75));
        System.out.println(multiplication(100,0));

    }
}
