public class InstanceofTest {

    public static void main(String[] args){
        FireEngine fe = new FireEngine();
        Car fe2 = null;

        if(fe instanceof Car){
            fe2 = (Car)fe;
        }


        System.out.println(fe2.getClass().getName());
    }

}
class Car {}
class FireEngine extends Car {}
