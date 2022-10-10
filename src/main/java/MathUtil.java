public class MathUtil {
    public String testTritangle(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
                return "Tam giác đều";
            } else if ((a == b || a == c || b == c)
                    && (a*a + b*b != c*c || a*a + c*c != b*b || b*b+c*c != a*a)){
                return "Tam giác cân";
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                return "Tam giác vuông";
            } else if (((a * a + b * b == c * c) && (a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                return "Tam giác vuông cân";
            } else {
                return "Tam giác thường";
            }
        } else {
            return "Đây không phải 3 cạnh của một tam giác";
        }
    }
}