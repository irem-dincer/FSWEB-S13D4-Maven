package org.example;

public class Point {

    private int x;
    private int y;

    public  Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public  void setX(int x) {
        this.x=x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    //Method Overloading;

    //distance from (0,0) point
   public double distance(){
        return Math.sqrt(x*x + y*y);
   }
    //distance from another point

    public double distance(Point p){
return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));


    }

    //distance from (a,b) point
    public double distance(int a, int b){
        return Math.sqrt((a-this.x)*(a-this.x)+(b-this.y)*(b-this.y));
    }


}
