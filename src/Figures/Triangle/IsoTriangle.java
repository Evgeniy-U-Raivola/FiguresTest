package Figures.Triangle;

public class IsoTriangle extends Triangle{
    public IsoTriangle() {super();}
    public IsoTriangle(String name, boolean hasCorners) {
        super(name, hasCorners);
    }
    {  this.setName("равнобедренный треугольник"); }
// setters + getters
//   методы

@Override
    public void info() {
    System.out.println("фигура  " + getName() + "\n"+
            "количество углов ="+getNumbangle()+"\n"+
            "--    --    --    --    --    --    --    --    --    --    --"); }
}
