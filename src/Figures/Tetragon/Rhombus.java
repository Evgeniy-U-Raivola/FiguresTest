package Figures.Tetragon;

public class Rhombus extends Tetragon{
    //    учебный процесс
    //    конструкторы
    public Rhombus() {super();}
    public Rhombus(String name,boolean hasCorners) {
        super(name,hasCorners);  }
    { this.setName(" ромб"); }

//    setters  + getters
//  методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbTangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}

