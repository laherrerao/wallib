package co.wallib.testtechnical;
import co.wallib.testtechnical.ShapeMaker;
public class FacadeDemo {

   ShapeMaker shapeMaker =new ShapeMaker(new Circle(),new Rectangle(),new Square());

   Circle circle = new Circle();

   public Circle getCircle() {
      return circle;
   }
}
