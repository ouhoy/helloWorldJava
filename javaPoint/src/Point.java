import java.util.Arrays;
import java.util.Comparator;

public class Point {

    double x = Math.random() * 100;
    double y = Math.random() * 100;
    double z = Math.random() * 100;
    public Point(){}

    public String toString() {
        return "X: " + x + " Y : "+ y + " Z: " + z;
    }

    public static void main(String[] args) {

        Point[] points = new Point[10];

        for(int i = 0; i < points.length; i ++) {

            points[i] = new Point();

        }

        System.out.println(Arrays.toString(points));


        Comparator<Point> xComparator = Comparator.comparingDouble(point -> point.x);
        Point[] sortedPoints = Arrays.sort(points,xComparator);


    }
}