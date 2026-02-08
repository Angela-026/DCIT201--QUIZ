public class ClassAverage {
    // Version 1: two scores
    public static double calculateClassAverage(double a, double b) {
        return (a + b) / 2;
    }

    // Version 2: three scores
    public static double calculateClassAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Version 3: array of scores
    public static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) sum += score;
        return sum / scores.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateClassAverage(1000, 6000));        // Version 1
        System.out.println(calculateClassAverage(50, 90, 200));   // Version 2
        System.out.println(calculateClassAverage(new double[]{80, 90, 85, 95})); // Version 3
    }
}