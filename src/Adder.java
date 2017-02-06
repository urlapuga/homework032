/**
 * Created by Андрей on 06.02.2017.
 */
public class Adder extends  Arithmetics{
    Adder(int a,int b){
        super.a = a;
        super.b = b;
    }
    boolean check(){
        if(a > b)return true;
        else {
            return false;
        }
    }
}
