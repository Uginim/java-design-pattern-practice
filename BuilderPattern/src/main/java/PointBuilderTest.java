public class PointBuilderTest {


    public static void main(String[] args) {
        Point.PointBuilder pointBuilder = Point.builder();
        Point point = pointBuilder.x(0.3f).y(0.4f).z(0.5f).build();
    }
}
