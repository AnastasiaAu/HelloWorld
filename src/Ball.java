public class Ball extends Form {
        private int r=5;
        private double square;
        private double volume;

        @Override
        public void Square() {
            square = 4* Math.PI*r*r;
            System.out.println("Площадь шара="+square);
        }

        @Override
        public void Volume() {
            volume=(4/3)*Math.PI*r*r*r;
            System.out.println("Объем шара="+volume);
        }
}


