
interface Shape {
    double calculateArea();
    void displayInfo();
}


class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("круг с радиусом " + radius + ", площадью " + calculateArea());
    }
}


class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("прямоугольник с шириной " + width + ", высота " + height + ", площадь " + calculateArea());
    }
}


class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("треугольник с основой " + base + ", высота " + height + ", площадь " + calculateArea());
    }
}
