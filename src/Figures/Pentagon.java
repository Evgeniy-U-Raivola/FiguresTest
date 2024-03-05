package Figures;

public class Pentagon extends Figure{
    //    учебный процесс
//   конструкторы
     public Pentagon() { super();
     }
     public Pentagon(String name,boolean hasCorners) {
         super(name,hasCorners);
     }
//   setters   +    getters
//    методы
    @Override
    public void info(){
                System.out.println("фигура: "+getName()+"\n"
                +"--    --    --    --    --    --    --    --    --    --    --");
    }
}
