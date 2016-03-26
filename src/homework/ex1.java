package homeWork;
import java.util.*;

public class ex1 {
	public static void main(String[] args) {
		ex1 obj1 = new ex1();
		double feets = obj1.meterToFoot(10);
        double meter = obj1.footToMeter(10);
        double area = obj1.areaOfRectangle(3, 6);
        double vol = obj1.volume(3);
        
        //System.out.println("10 meters :" + feets +"ft.");
        //System.out.println("10 feets :" + meter +"m.");
        //System.out.println("3 x 6  area :" + area +".");
        //System.out.println("circle :" + vol +".");
        System.out.println("sumOdd :" + obj1.sumOdd(2) +".");
        System.out.println("gcd :" + obj1.gcd(30,15) +".");
        System.out.println("lcm :" + obj1.lcm(30,15) +".");
        System.out.println("thaiToEnglishMonth :" + obj1.thaiToEnglishMonth("เมษายน") +".");
        System.out.println("isPrime :" + obj1.isPrime(20) +".");
        double[] num1 = {10,10,10,10};
        System.out.println("average :" + obj1.average(num1) +".");
        List<Integer> ans1 = obj1.divider(24);
        System.out.println("divider :" + ans1.toString() +".");
        System.out.println("sum :" + obj1.sum(new int[] {1, 4, 5, 2}, 3) +".");
        
        

	}
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
    int sumOdd(int n) {
    	int sum =0;
    	for(int i=0;i <=n;i++ ){
    		if((i%2) >0){
    	    	sum += i;
        	}
    	}
    	return sum;
    }
	
    int gcd(int a, int b) {
    	while(b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
    	return a;
    }
    int lcm(int a, int b) {
    	return (a*b)/gcd(a,b);
    }
    String thaiToEnglishMonth(String m) {
    	String month = "";
    	switch (m) {
    	case "มกราคม":
    		month = "Jan";
    		break;
    	case "กุมภาพันธ์":
    		month = "Feb";
    		break;
    	case "มีนาคม":
    		month = "Mar";
    		break;
    	case "เมษายน":
    		month = "Apr";
    		break;
    	case "พฤษภาคม":
    		month = "May";
    		break;
    	case "มิถุนายน":
    		month = "Jun";
    		break;
    	case "กรกฎาคม":
    		month = "Jul";
    		break;
    	case "สิงหาคม":
    		month = "Aug";
    		break;
    	case "กันยายน":
    		month = "Sep";
    		break;
    	case "ตุลาคม":
    		month = "Oct";
    		break;
    	case "พฤศจิกายน":
    		month = "Nov";
    		break;
    	case "ธันวาคม":
    		month = "Dec";
    		break;
    	default:
    		month = "Error";
            break;
    	}
    	return month;
    }
    
    boolean isPrime(int n) {
    	for(int k=2;k<(n-1);k++){
    		if(n%k ==0){
    			return false;
    		}
    	}
    	return true;
    }
    
    double total(double [] a) {
    	double ans=0;
    	for(int i=0;i<a.length;i++){
    		ans += a[i];
    	}
    	return ans;
    }
    
    double average(double [] a) {
    	return total(a)/a.length;
    }
    
    ArrayList divider(int n) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
    	//int ans[]= new int[10];
    	int i=0;
    	for(int k=1;k<(n);k++){
    		if(n%k ==0){
    			ans.add(k);
    			i++;
    		}
    	}
    	return ans;

    }
    
    boolean sum(int [] a, int x) {
        for(int i=0; i < a.length ; i++){
            for(int j =1; j < a.length ; j++){
                if(a[i]+a[j] == x){
                    return true;
                }
            }
        }
        return false;
    }
}