package Figures.Tetragon;

public class Trapezoid extends Tetragon {
    //    конструкторы
    public Trapezoid() {super();}
    public Trapezoid(String name,boolean hasCorners) {
        super(name,hasCorners);  }
    { this.setName(" трапеция "); }

//    setters  + getters
//  методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbTangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}

