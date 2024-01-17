package Figures;

public class Circle extends Figure {

//   конструкторы
    public Circle() { super();}

    public Circle(String name, boolean hasCorners) {
        super(name, hasCorners);  }
//    методы

    @Override
    public void info() {
        System.out.println("фигура "+getName()+"\n"
                +"--    --    --    --    --    --    --    --    --    --    --"); }
}
