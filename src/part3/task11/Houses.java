package part3.task11;

public class Houses {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 2;
        int f = 1;
        int x = Math.min(a, b);
        int y = Math.min(c, d);
        int z = Math.min(x, y);
        if (e * f < a * b + c * d) {
            System.out.println("Дома не поместятся.");
        } else if (e < z || f < z) {
            System.out.println("Дома не поместятся.");
        } else if (a < 1 || b < 1 || c < 1 || d < 1 || e < 1 || f < 1){
            System.out.println("Длина введена неверно.");
        } else {
            System.out.println("Дома поместятся.");
            // Для того, чтобы на участок можно было поместить два дома надо соблюсти 2 условия:
            // Площадь участка должна быть больше или равна сумме площадей домов.
            // Длина каждой из сторон участка должна быть не меньше любой из длин сторон домов (больше или равна длине самой короткой стороны домов).
        }
    }
}