package co.wallib.testtechnical.interfaz;

public interface Shape {

    public default void draw(){
        System.out.println("that shape is being drawn");
    }

}
