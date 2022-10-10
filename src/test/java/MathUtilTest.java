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
        assertEquals(util.testTritangle(1,1,3),"Đây không phải 3 cạnh của một tam giác");
    }
    @Test
    void test2(){
        assertEquals(util.testTritangle(1,3,1),"Đây không phải 3 cạnh của một tam giác");
    }

    @Test
    void test3(){
        assertEquals(util.testTritangle(3,1,1),"Đây không phải 3 cạnh của một tam giác");
    }
    @Test
    void test4(){
        assertEquals(util.testTritangle(-10.5, 10, 5.5), "Đây không phải 3 cạnh của một tam giác");
    }
    @Test
    void test5(){
        assertEquals(util.testTritangle(10, -10.5, 5.5), "Đây không phải 3 cạnh của một tam giác");
    }
    @Test
    void test6(){
        assertEquals(util.testTritangle(10, 5.5, -10.5), "Đây không phải 3 cạnh của một tam giác");
    }
    @Test
    void test7(){
        assertEquals(util.testTritangle(3, 4, 5), "Tam giác vuông");
    }
    @Test
    void test8(){
        assertEquals(util.testTritangle(4, 3, 5), "Tam giác vuông");
    }
    @Test
    void test9(){
        assertEquals(util.testTritangle(5, 3, 4), "Tam giác vuông");
    }
    @Test
    void test10(){
        assertEquals(util.testTritangle(4, 4, 4 * Math.sqrt(2)), "Tam giác vuông cân");
    }
    @Test
    void test11(){
        assertEquals(util.testTritangle(4, 4 * Math.sqrt(2), 4), "Tam giác vuông cân");
    }
    @Test
    void test12(){
        assertEquals(util.testTritangle(4 * Math.sqrt(2), 4, 4), "Tam giác vuông cân");
    }
    @Test
    void test13(){
        assertEquals(util.testTritangle(50, 20, 50), "Tam giác cân");
    }
    @Test
    void test14(){
        assertEquals(util.testTritangle(10, 20, 20), "Tam giác cân");
    }
    @Test
    void test15(){
        assertEquals(util.testTritangle(100.2, 100.2, 80), "Tam giác cân");
    }
    @Test
    void test16(){
        assertEquals(util.testTritangle(10.4, 10.4, 10.4), "Tam giác đều");
    }
    @Test
    void test17(){
        assertEquals(util.testTritangle(4.1, 5.1, 7.1), "Tam giác thường");
    }

    // các test của kiểm thử giá trị biên
    @Test
    void test19() {
        assertEquals(util.testTritangle(nom, nom, min), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test20() {
        assertEquals(util.testTritangle(nom, nom, minAdd), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test21() {
        assertEquals(util.testTritangle(nom, nom, max), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test22() {
        assertEquals(util.testTritangle(nom, nom, maxSub), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test23() {
        assertEquals(util.testTritangle(nom, min, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test24() {
        assertEquals(util.testTritangle(nom, minAdd, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test25() {
        assertEquals(util.testTritangle(nom, max, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test26() {
        assertEquals(util.testTritangle(nom, maxSub, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test27() {
        assertEquals(util.testTritangle(min, nom, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test28() {
        assertEquals(util.testTritangle(minAdd, nom, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test29() {
        assertEquals(util.testTritangle(max, nom, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test30() {
        assertEquals(util.testTritangle(maxSub, nom, nom), "Đây không phải 3 cạnh của một tam giác");

    }
    @Test
    void test31() {
        assertEquals(util.testTritangle(nom, nom, nom), "Đây không phải 3 cạnh của một tam giác");

    }


}