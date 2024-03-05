package Figures.Tetragon;

public class Paralellogram extends Tetragon{
//    учебный процесс
//    конструкторы
      public Paralellogram() {super();}
      public Paralellogram(String name,boolean hasCorners) {
          super(name,hasCorners);  }
    { this.setName(" паралеллограм"); }

//    setters  + getters
//  методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbTangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}
