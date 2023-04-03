package part3.task11;

public class Houses {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 9;
        int d = 20;
        int e = 300;
        int f = 8;
        int x = Math.min(a, b);
        int y = Math.min(c, d);
        int z = Math.min(x, y);
        if (e * f <= a * b + c * d) {
            System.out.println("Дома не поместятся.");
        } else if (e < z || f < z) {
            System.out.println("Дома не поместятся.");
        } else {
            System.out.println("Дома поместятся.");
            // Для того, чтобы на участок можно было поместить два дома надо соблюсти 2 условия:
            // Площадь участка должна быть больше или равна сумме площадей домов.
            // Длина каждой из сторон участка должна быть не меньше любой из длин сторон домов (больше или равна длине самой короткой стороны домов).
        }
    }
}