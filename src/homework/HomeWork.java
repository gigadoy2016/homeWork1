package homework;
public class HomeWork {
    double meterToFoot(double length) {
        return length * 3.2808399;
    }
    
    double footToMeter(double length) {
        return length * 0.3048;
    }
    
    double areaOfRectangle(double width, double height) {
        return width * height;
    }
    
    double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    
    double volume(double radius) {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
    public static void main(String[] args) {
        HomeWork obj1 = new HomeWork();
        
        double feets = obj1.meterToFoot(10);
        double meter = obj1.footToMeter(10);
        double area = obj1.areaOfRectangle(3, 6);
        double vol = obj1.volume(3);
        
        System.out.println("10 meters :" + feets +"ft.");
        System.out.println("10 feets :" + meter +"m.");
        System.out.println("3 x 6  area :" + area +".");
        System.out.println("circle :" + vol +".");
    }
    
}
