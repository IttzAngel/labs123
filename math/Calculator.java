package math;

public class Calculator {

    public long add1;
    public long add2;
    public long sub1;
    public long sub2;
    public long mult1;
    public long mult2;
    public long div1;
    public long div2;

    public void add(){
        System.out.println(add1 + add2);
    }
    public void subtract(){
        System.out.println(sub1 - sub2);
    }
    public void multiply(){
        System.out.println(mult1 * mult2);
    }
    public void divide(){
        System.out.println(div1 / div2);
    }
}