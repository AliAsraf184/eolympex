import java.util.Scanner;

public class Deyisikliklerex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
          int x= scan.nextInt();
          int n=0;
          int x1=0;
              for (int i = 0; x<=1; i++) {
                  if (x%2==0)
                  x1=x/2;
                  else
                  x=x+1;
                  n++;

              }
                  System.out.println(n);


          }
}