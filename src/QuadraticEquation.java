public class QuadraticEquation {

    public float x = 0;
    public float x1 = 0;
    public float x2 = 0;




    public QuadraticEquation() {

    }

    public QuadraticEquation(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public void answer(int a, int b) {
               try{ x = -b / (2 * a);
               }
               catch (ArithmeticException e)
               {    System.out.println("a=0");
               };
            }

    public void answer(int a, int b, int c) {
            float d = (float) java.lang.Math.sqrt(b * b - 4 * a * c);
            x1 = (-b + d / (2 * a));
            x2 = (-b - d / (2 * a));
        }



        }

