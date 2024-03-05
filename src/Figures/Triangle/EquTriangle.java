package Figures.Triangle;

public class EquTriangle extends Triangle {
    //    учебный процесс
// конструкторы
       public EquTriangle() {super();}
       public EquTriangle(String name,boolean hasCorners) {
              super(name,hasCorners);}
       { this.setName(" равносторонний треугольник");}
//   getters + setters
//   методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }

}
