import java.util.Scanner;

  import java.util.Scanner;

    public class SimpleReverse {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter String");
            String s=sc.next();
            int n=s.length();
            char c[]=new char[n];
            for(int i=n-1;i>=0;i--){
                c[i] =s.charAt(i);
                System.out.print(c[i]);
            }


        }
}
