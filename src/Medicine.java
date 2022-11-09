public class Medicine {
        public void displayLabel(){
            System.out.println("Name:Nithya Pharma");
            System.out.println("Address:Delhi");

        }
    }
    class Tablet extends Medicine{
        public void displayLabel(){

            System.out.println("Store in a cool dry place");
        }

    }
    class Syrup extends Medicine{
        @Override
        public void displayLabel() {
            super.displayLabel();

            System.out.println("Consumption as directed by the physician");
        }
    }
    class ointment extends Medicine{

        @Override
        public void displayLabel() {
            super.displayLabel();

            System.out.println("for external use only");
        }
    }
    class TestMedicine{
        public static void main(String[] args) {
            double i = Math.random() * 4;
            int a = (int) i;
            System.out.println(a);
            switch (a) {
                case 1:
                    Medicine c = new Medicine();
                    Tablet t = new Tablet();
                    c.displayLabel();
                    t.displayLabel();
                    break;
                case 2:
                    Medicine e = new Medicine();
                    Syrup S = new Syrup();;
                    S.displayLabel();
                    break;
                case 3:
                    Medicine d = new Medicine();
                    ointment o = new ointment();
                    o.displayLabel();
                    break;
            }
        }
    }

