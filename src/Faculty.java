import java.util.Scanner;

public class Faculty {
        private  int Faculty_id;
        private float salary;

    }
    class FullTimeFaculty extends Faculty{
        float basic;
        float allowance;
        FullTimeFaculty(float basic,float allowance){
            this.basic=basic;
            this.allowance=allowance;

        }
        float salaryFull(){
            float salary1;
            salary1=(basic+allowance);
            return salary1;
        }
        void display1(){

            System.out.println("Salary of FullTimeFaculty:"+salaryFull());
        }
    }
    class PartTimeFaculty extends Faculty{
        int hour;
        float rate;
        PartTimeFaculty(int hour,float rate){
            this.hour=hour;
            this.rate=rate;
        }
        float salaryPart(){
            float salary2;
            salary2=(hour*rate);
            return salary2;
        }
        void display2(){
            System.out.println("salary of PartTimeFaculty:"+salaryPart());
        }
    }
    class Driverclass{
        public static void main(String[] args){
   Scanner s1=new Scanner(System.in);

            System.out.println("Enter basic and Allowance  of FullTimeFaculty 1 Here:");
            FullTimeFaculty full1=new FullTimeFaculty(s1.nextFloat(),s1.nextFloat());
            full1.display1();


            System.out.println("Enter hour and rate of PartTimeFaculty1 Here:");
            PartTimeFaculty Part1=new PartTimeFaculty(s1.nextInt(),s1.nextFloat());
            Part1.display2();


            System.out.println("Enter basic and Allowance  of FullTimeFaculty 2 Here:");
            FullTimeFaculty full2=new FullTimeFaculty(s1.nextFloat(),s1.nextFloat());
            full2.display1();



            System.out.println("Enter hour and rate of PartTimeFaculty 2 Here:");
            PartTimeFaculty Part2=new PartTimeFaculty(s1.nextInt(),s1.nextFloat());
            Part2.display2();



        }
    }


