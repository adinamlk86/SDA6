package ooppractice.geometry;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(double x1,double y1,double x2,double y2,double x3,double y3){

        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);

    }

    @Override
    public String toString() {
        return "Triangle @ " + v1 + v2 + v3;
    }

    public double getPerimeter(){
        double perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }

    public String printType(){
        int l1= (int) v1.distance(v2);
        int l2= (int) v2.distance(v3);
        int l3= (int) v3.distance(v1);

        if(l1==l2 && l2==l3){
            return "equilateral";
        }else if(l1==l2 || l2==l3 || l3==l1){
            return "isosceles";
        } else{
            return "scalene";
        }



    }
}
