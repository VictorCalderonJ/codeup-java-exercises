package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return this.length * this.length;
    }
    public double getPerimeter() {
        return this.length * 4;
    }

    public void setLength(double side){
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side){
        this.length = side;
        this.width = side;
    }


}
