package Figures;

public abstract class Figure {
    //    учебный процесс
    private String name;
    private boolean hasCorners;
    {name="абстрактная фигура";}
// конструкторы
    public Figure(){};
    public Figure(String name,boolean hasCorners){
        this.name=name;
        this.hasCorners=hasCorners;
    }
//  setters + getters

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name; }
    public boolean isHasCorners() {
        return hasCorners; }
    public void setHasCorners(boolean hasCorners) {
        this.hasCorners = hasCorners; }

    // методы
     public abstract void info();
}
