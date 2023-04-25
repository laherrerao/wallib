package co.wallib.testtechnical;

import co.wallib.testtechnical.interfaz.Shape;

public class ShapeMaker implements Shape {

  Circle circle=new Circle();
  Rectangle rectangle =new Rectangle();
  Square square= new Square();


    public void drawCircle(){
        System.out.println("draw  Circle");
        System.out.println(circle);
    }

    public void drawReactangle(){

        System.out.println("draw Rectangle");
        System.out.println(rectangle);
    }

    public  void drawSquare(){
        System.out.println("draw Square");
        System.out.println(square);
    }

    public ShapeMaker() {
    }

    public ShapeMaker(Circle circle, Rectangle rectangle, Square square) {
        this.circle = circle;
        this.rectangle = rectangle;
        this.square = square;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
