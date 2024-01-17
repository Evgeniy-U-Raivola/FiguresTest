package Figures.Tetragon;

import Figures.Figure;

public class Tetragon extends Figure {

    static private int numbTangle;
    {numbTangle=4;}

//    контсрукторы
    public Tetragon() {super();}
    {this.setHasCorners(true);}
    public Tetragon(String name,boolean hasCorners) {
        super(name,hasCorners );  }
    {  this.setName("абстрактный черырёхугольник");
       this.setHasCorners(true);}

//   getters + setters
     public static int getNumbTangle() {
           return numbTangle; }
//    методы


    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+numbTangle+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}
