package lib;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TriangleTypeTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleType.triangleType(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleType.triangleType(3, 3, 4));
    }

    @Test
    public void testScaleneTriangle() {
    assertEquals("RightTriangle", TriangleType.triangleType(3, 4, 5));
}


    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", TriangleType.triangleType(1, 2, 5));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", TriangleType.triangleType(3, 4, 5));
    }
}
