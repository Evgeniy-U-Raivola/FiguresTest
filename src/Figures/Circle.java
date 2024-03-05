package Figures;

public class Circle extends Figure {
    //    учебный процесс
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
