import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathUtilTest {
    MathUtil util = new MathUtil();
    double min = -3.4028235 * Math.pow(10, 38);
    double minAdd = -3.4028235 * Math.pow(10, 38) + 1;
    double max = 3.4028235 * Math.pow(10, 38);
    double maxSub = 3.4028235 * Math.pow(10, 38) - 1;
    double nom = 0;
    // Các test của bảng quyết định
    @Test
    void test1(){
        assertEquals("Đây không phải 3 cạnh của một tam giác",util.testTritangle(1,1,3));
    }
    @Test
    void test2(){
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(1,3,1));
    }

    @Test
    void test3(){
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(3,1,1));
    }
    @Test
    void test4(){
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(-10.5, 10, 5.5) );
    }
    @Test
    void test5(){
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(10, -10.5, 5.5) );
    }
    @Test
    void test6(){
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(10, 5.5, -10.5));
    }
    @Test
    void test7(){
        assertEquals("Tam giác vuông", util.testTritangle(3, 4, 5));
    }
    @Test
    void test8(){
        assertEquals("Tam giác vuông",util.testTritangle(4, 3, 5));
    }
    @Test
    void test9(){
        assertEquals("Tam giác vuông", util.testTritangle(5, 3, 4));
    }
    @Test
    void test10(){
        assertEquals( "Tam giác vuông cân", util.testTritangle(4, 4, 4 * Math.sqrt(2)));
    }
    @Test
    void test11(){
        assertEquals("Tam giác vuông cân", util.testTritangle(4, 4 * Math.sqrt(2), 4));
    }
    @Test
    void test12(){
        assertEquals("Tam giác vuông cân", util.testTritangle(4 * Math.sqrt(2), 4, 4));
    }
    @Test
    void test13(){
        assertEquals("Tam giác cân", util.testTritangle(50, 20, 50));
    }
    @Test
    void test14(){
        assertEquals("Tam giác cân", util.testTritangle(10, 20, 20));
    }
    @Test
    void test15(){
        assertEquals("Tam giác cân", util.testTritangle(100.2, 100.2, 80));
    }
    @Test
    void test16(){
        assertEquals("Tam giác đều", util.testTritangle(10.4, 10.4, 10.4));
    }
    @Test
    void test17(){
        assertEquals("Tam giác thường", util.testTritangle(4.1, 5.1, 7.1));
    }

    // các test của kiểm thử giá trị biên
    @Test
    void test19() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, nom, min));

    }
    @Test
    void test20() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, nom, minAdd));

    }
    @Test
    void test21() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, nom, max));

    }
    @Test
    void test22() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, nom, maxSub));

    }
    @Test
    void test23() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, min, nom));

    }
    @Test
    void test24() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, minAdd, nom));

    }
    @Test
    void test25() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, max, nom));

    }
    @Test
    void test26() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, maxSub, nom));

    }
    @Test
    void test27() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(min, nom, nom));

    }
    @Test
    void test28() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(minAdd, nom, nom));

    }
    @Test
    void test29() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(max, nom, nom));

    }
    @Test
    void test30() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(maxSub, nom, nom));

    }
    @Test
    void test31() {
        assertEquals("Đây không phải 3 cạnh của một tam giác", util.testTritangle(nom, nom, nom));

    }


}