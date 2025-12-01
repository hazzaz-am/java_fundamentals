package OOP.Principles;

public class Box {
    double l;
    double w;
    double h;


    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void printValue() {
        System.out.println(this.l + this.w + this.h);
    }
}