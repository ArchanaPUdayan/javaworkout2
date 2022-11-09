import java.util.Scanner;

public class oneBHK {

        private double roomArea;
        private double hallArea;
        private double price;
        oneBHK(){
            roomArea=0;
            hallArea=0;
            price=0;
        }
        oneBHK(double roomArea,double hallArea,double price){
            this.roomArea=roomArea;
            this.hallArea=hallArea;
            this.price=price;
        }
        void show(){
            System.out.println("\nRoomArea:"+roomArea+"\nHallArea:"+hallArea+"\nPrice:"+price);

        }

    }
    class TwoBHK extends oneBHK{
        private double room2Area;
        TwoBHK(double roomArea,double hallArea,double price,double room2Area){
            super(roomArea,hallArea,price);
            this.room2Area=room2Area;
        }

        @Override
        void show() {
            super.show();
            System.out.println("Room 2 Area:"+room2Area);
        }
    }
    class DriverClass1{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            TwoBHK obj1=new TwoBHK(10,20,1000,30);
            TwoBHK obj2=new TwoBHK(12,17,1000,30);
            TwoBHK obj3=new TwoBHK(18,19,1000,15);
            obj1.show();
            obj2.show();
            obj3.show();
        }
    }

