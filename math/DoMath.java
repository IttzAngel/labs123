package math;

import java.net.CacheRequest;

public class DoMath {

    public static void main(String[] args) {
        Calculator calcAdd = new Calculator();
        calcAdd.add1 = 7;
        calcAdd.add2 = 9;
        calcAdd.add();

        Calculator calcSub = new Calculator();
        calcSub.sub1 = 13;
        calcSub.sub2 = 20;
        calcSub.subtract();

        Calculator calcDiv = new Calculator();
        calcDiv.div1 = 20;
        calcDiv.div2 = 5;
        calcDiv.divide();

        Calculator calcMult = new Calculator();
        calcMult.mult1 = 12;
        calcMult.mult2 = 12;
        calcMult.multiply();
    }
}