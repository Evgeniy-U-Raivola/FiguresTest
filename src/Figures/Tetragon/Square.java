package Figures.Tetragon;

public class Square extends Tetragon{
    //    учебный процесс
    //    конструкторы
    public Square() {super();}
    public Square(String name,boolean hasCorners) {
        super(name,hasCorners);  }
    { this.setName(" квадрат "); }

//    setters  + getters
//  методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbTangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}
