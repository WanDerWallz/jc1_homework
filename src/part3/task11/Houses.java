package part3.task11;

public class Houses {
    public static void main(String[] args) {
    int a = 10;
    int b = 11;
    int c = 9;
    int d = 20;
    int e = 9;
    int f = 33;
    // Для того, чтобы на участок можно было поместить два дома надо соблюсти 2 условия:
        // Площадь участка больше или равна сумме площадей домов.
        // Длина каждой из сторон участка должна быть не меньше любой из длин сторон домов (больше или равна длине самой короткой стороны домов).
    if (e * f < a * b + c * d) {
        System.out.println("Дома не поместятся.");
    } else if ((a < b && a < c && a < d) && (e < a || f < a)) {
        System.out.println("Дома не поместятся.");
    } else if ((b < a && b < c && b < d) && (e < b || f < b)) {
        System.out.println("Дома не поместятся.");
    } else if ((c < a && c < b && c < d) && (e < c || f < c)) {
        System.out.println("Дома не поместятся.");
    } else if ((d < a && d < c && d < b) && (e < d || f < d)) {
        System.out.println("Дома не поместятся.");
    } else {
        System.out.println("Дома поместятся.");
    }
}
}
