/**
 * Created by Андрей on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Adder adder = new Adder();
        System.out.println(adder.add(a,b));
        System.out.println(adder.check(a,b));
    }
}
