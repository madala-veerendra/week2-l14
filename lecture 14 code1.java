import java.util.Scanner;
public class L14C1 {
    int n1,n2,result;
    Scanner sc = new Scanner(System.in);
    void calculate(){
        try {
        System.out.println("Enter first number");
        n1=sc.nextInt();
        System.out.println("Enter second number");
        n2=sc.nextInt();
        result=n1/n2;
        if (n2>=0){
            throw new ArithmeticException();
        }
        }
        catch(ArrayIndexOutOfBoundsException aiobe) {
	    aiobe.printStackTrace();
	}
        catch(ArithmeticException ae){
            System.out.println("AE Dtected");
        }
        catch(Exception e){
            System.out.println("Ouch! Exception Detected!"+e.getMessage());
            e.printStackTrace();
        }
        finally{
        System.out.println("The division is"+result);
        }
    }
    public static void main(String[] args){
        L14C1 obj = new L14C1();
        obj.calculate();
    }
}
