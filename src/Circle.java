public class Circle {
    private int radius = 0;
    private int centerPoint = 0;

    public void setCenterPoint(int centerPoint) {
        this.centerPoint = centerPoint;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterPoint() {
        return centerPoint;
    }

    public int getRadius() {
        return radius;
    }

    public void computeArea() {
        double pI = 3.1415;
        double area;
        area = pI * (radius * radius);
        System.out.println("Area = " + area);
    }

}
