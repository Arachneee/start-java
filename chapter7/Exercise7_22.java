package chapter7;

abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r){
        super();
        this.r = r;
    }
    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }
    @Override
    double calcArea() {
        return width*height;
    }
    boolean isSquare(){
        if (width==height) return true;
        else return false;
    }
}

class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Exercies7_23{
    static double sumArea(Shape[] arr){
        double sum_ = 0;
        for(int i=0;i<arr.length;i++){
            sum_ += arr[i].calcArea();
        }
        return sum_;
    }
    public static void main(String[] args){
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합:"+ sumArea(arr));
    }
}