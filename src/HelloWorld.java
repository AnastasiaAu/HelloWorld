
public class HelloWorld {
    public static void main(String[] args) {
        QuadraticEquation QE = new QuadraticEquation();



       System.out.println("ДЗ №1");
        int d = 0;

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();

        System.out.print("Введите b: ");
        int b = in.nextInt();

        System.out.print("Введите c: ");
        int c = in.nextInt();

        d = b * b - 4 * a * c;

        if (d == 0) {
            System.out.println("D=0");
            QE.answer(a, b);
            if (a!=0) {
                System.out.println("x=" + QE.getX());
            }
            }


        if (d > 0) {
            System.out.println("D>0");
            QE.answer(a, b, c);
            System.out.println("x1=" + QE.getX1());
            System.out.println("x2=" + QE.getX2());
        }

        if (d < 0) {
            System.out.println("D<0. Действительных корней нет");
        }

        System.out.println("ДЗ №2");
        Ball ball = new Ball();
        ball.Square();
        ball.Volume();

        Cub cub1 = new Cub();
        cub1.Square();
        cub1.Volume();

        Parallelepiped par = new Parallelepiped();
        par.Square();
        par.Volume();

        System.out.println("ДЗ №3");
        System.out.println("Задача 1");
        //java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("введите строку: ");
        String str = in.next();
        boolean p =  new Polindrom().isPalindrome(str);
        if (p == true)
        {System.out.println("Строка " + str + " палиндром");}
        else {System.out.println("Строка " + str + " не палиндром");}
        System.out.println("Задача 2");
       String strlong = new LongestPalindrom().longestPalindromeString(str);
       System.out.println("в этой строке самый длинный полиндром " + strlong);
    }
}