package Figures.Triangle;

public class RigTriangle extends Triangle{

// конструкторы
    public RigTriangle() {super();}
    public RigTriangle(String name,boolean hasCorners) {
        super(name, hasCorners); }
    {this.setName(" прямоугольный треугольник");
                 }
//   getters + setters
//   методы
    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}
