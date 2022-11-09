public class MathFunction {

        public void multiply(int a, int b) {
            System.out.println(a * b);

        }

        public void multiply(float u, float v) {
            System.out.println(u * v);

        }

        public void multiply(int a, float v) {
            System.out.println(a * v);
        }

        public static void main(String[] args) {
            MathFunction m = new MathFunction();
            m.multiply(5, 7);
            m.multiply(1.2f,1.7f);
            m.multiply(5,1.7f);
        }
    }

