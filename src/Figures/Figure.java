package Figures;

public abstract class Figure {
    private String name;
    private boolean hasCorners;
    {name="абстрактная фигура";}
// конструкторы
    Figure(){};
    Figure(String name,boolean hasCorners){
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
     public void info() {};
}
