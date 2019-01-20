package ooppractice.geometry;


public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        x=0;
        y=0;
    }



    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+ x +", "+ y +")";
    }

    public double distance(int x,int y){

        double xDiff= this.x-x;
        double yDiff= this.y-y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another){
        int xDiff= (int) (this.x-another.x);
        int yDiff= (int) (this.y-another.y);

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

    }

}
