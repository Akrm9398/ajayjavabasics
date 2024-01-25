public class Circle // circle is class
{
    int radius; // radius is field

    public Circle(int radius) { // this is constructor
        this.radius = radius;
    }


    public void area() {    // this is function 1
        double area = Math.PI * radius * radius;  //this is formulae for area
        System.out.println("the area is: " + area);
    }

    public void perimeter()  // this is funtion 2
    {
        double perimeter = 2 * Math.PI * radius; // this is formulae for perimeter
        System.out.println("the perimeter is: " + perimeter);
    }
}
