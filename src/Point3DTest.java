public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.2f);
        System.out.println(point3D);
        point3D = new Point3D(3.2f, 3.4f, 5.3f);
        System.out.println(point3D);
    }
}
