package Figures.Tetragon;

public class ConTetragon extends Tetragon{

//    конструкторы
      public ConTetragon() {super();}
      public ConTetragon(String name,boolean hasCorners) {
          super(name,hasCorners); }
      { this.setName("выпуклый четырёхугольник") ; }

//    setters  + getters
//  методы

    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+getNumbTangle()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
    }


