package Figures.Triangle;

import Figures.Figure;
public class Triangle extends Figure {
      static private int numbangle;
    {numbangle=3;}
//   конструкторы
         public Triangle() { super(); }
         public Triangle(String name, boolean hasCorners) {
             super(name, hasCorners); }
    {  this.setName("просто треугольник");
        this.setHasCorners(true);}
//   getters + setters

    public static int getNumbangle() {
        return numbangle;  }

    //  методы
    @Override
    public void info() {
        System.out.println("фигура  " + getName() + "\n"+
                "количество углов ="+numbangle+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --"); }
}

