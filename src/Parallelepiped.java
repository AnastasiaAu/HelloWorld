public class Parallelepiped extends Form {
    private int x=5;
    private int y=10;
    private int z=15;
    private double square;
    private double volume;

    @Override
    public void Square() {
        square = 2*(x*y+y*z+z*x);
        System.out.println("Площадь куба="+square);
    }

    @Override
    public void Volume() {
        volume=x*y*z;
        System.out.println("Объем куба="+volume);
    }
}
