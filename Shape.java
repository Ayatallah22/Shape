package shape;

abstract  class Shape implements Measurable{
    protected String name;


    public Shape(String name){

        this.name=name;
    }

    public Shape() {
    }


    public String getName(){
        return name;

    }
    public abstract  double getArea();
    public abstract  double getPerimeter();
}
