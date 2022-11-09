import java.util.Scanner;
public class Swapping {
        static int num1,num2,temp;
        Swapping(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
        }
        void swap(){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        public Swapping swap(int num1,int num2){
            temp=num1;
            num1=num2;
            num2=temp;
            Swapping S=new Swapping(num1,num2);
            return S;

        }
    }
    class swaping {
        public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
            System.out.println("Enter the first number num1");
            int n1 = s.nextInt();
            System.out.println("Enter the second number num2");
            int n2 = s.nextInt();

            Swapping S = new Swapping(n1, n2);
            S.swap();
            System.out.println("After swaping by using call by value method: num1=" + Swapping.num1 +"\t" +"num2=" + Swapping.num2+"\n");
            System.out.println("After swaping by using call by reference method: num1=" + S.num1 +"\t"+"num2=" + S.num2);
        }
    }

