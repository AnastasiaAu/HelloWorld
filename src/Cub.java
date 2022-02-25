
  public class Cub extends Form {
        private int x=5;
        private double square;
        private double volume;

        @Override
        public void Square() {
            square = 6*x*x;
            System.out.println("Площадь куба="+square);
        }

        @Override
        public void Volume() {
            volume=x*x*x;
            System.out.println("Объем куба="+volume);
        }
    }

