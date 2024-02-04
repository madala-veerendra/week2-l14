
public class L14C2 {
    int getNextNo(int n){
        try {
            if (n==5){
                return n+1;
        }
    }
        finally{
            System.out.println("This is important code");
        }
        return n-1;
    }
    public static void main(String[] args){
           L14C2 obj = new L14C2();
           System.out.println(obj.getNextNo(5));
    }
}
    
