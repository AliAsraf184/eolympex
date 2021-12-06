import java.util.Scanner;

public class Deyisikliklerex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
          int x= scan.nextInt();
          int n=0;
      
        while (x>1) {
                  if (x%2==0)
                  x=x/2;
                  else
                  x=x+1;
                  n++;


              }
           System.out.println(n);


          }
}
