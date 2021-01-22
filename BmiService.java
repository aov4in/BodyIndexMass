public class BmiService {
        public double calculate(double mass, double height) {
            double bodyIndexMass = mass / (height * height / 100 / 100);
            return bodyIndexMass;
        }
}