package Figures;

public class Hexagon extends Figure{
    //    учебный процесс
//   конструкторы
    public Hexagon() {  super();  }
    public Hexagon(String name, boolean hasCorners) {
        super(name, hasCorners);
    }
//   методы
    @Override
    public void info() {
    System.out.println("фигура "+getName()+"\n"
            +"--    --    --    --    --    --    --    --    --    --    --");
    }
}
