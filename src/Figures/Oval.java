package Figures;

public class Oval extends Figure{

//    конструкторы
    public Oval (){ super() ; }
    public Oval(String name, boolean hasCorners) {
        super(name, hasCorners); }
    //    методы
    @Override
    public void info() {
    System.out.println("фигура "+getName()+"\n"
            +"--    --    --    --    --    --    --    --    --    --    --");
    }
}
