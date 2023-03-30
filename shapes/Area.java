package shapes;

public class Area {

    public static void main(String[] args) {
        Rectangle myRec = new Rectangle();
        myRec.length = 9;
        myRec.width = 23;
        myRec.calculateArea1();

        Triangle myTri = new Triangle();
        myTri.base = 13f;
        myTri.height = 51f;
        myTri.calculateArea2();

        Circle myCir = new Circle();
        myCir.radius = 19;
        myCir.calculateArea3();
    }
}
