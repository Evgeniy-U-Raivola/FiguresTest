package Figures.Tetragon;

public class Rectangle extends Tetragon{
    //    конструкторы
    public Rectangle() {super();}
    public Rectangle(String name,boolean hasCorners) {
        super(name,hasCorners);  }
    { this.setName(" прямоугольник"); }

//    setters  + getters
//  методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbTangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}

