package fruit;

import com.sun.tools.corba.se.idl.constExpr.Or;
import edible.Edible;

public abstract class Fruit implements Edible {
    public static void main(String[] args) {
        Fruit ap = new Apple();
        Fruit or = new Orange();
        System.out.println(ap.howToEat());
        System.out.println(or.howToEat());
    }
}
