package part4.task18;

public class Number {    //Понимаю, этот код - один большой костыль, но как сделать через циклы я не додумался :(
    public static void main(String[] args) {
        int i = -2000064000;
        int y, z, a, b, c, d;
        a = i % 1000;
        y = i % 1000000;
        z = i % 1000000000;
        b = y / 1000;
        c = z / 1000000;
        d = i / 1000000000;
        if (i > 0) {
            if (i < 1000) {
                System.out.println(i);
            }
            if (i < 1000000 && a > 100) {
                System.out.println(b + " " + a);
            } else if (i < 1000000 && a < 100 && a > 10) {
                System.out.println(b + " " + "0" + a);
            } else if (i < 1000000 && a < 10) {
                System.out.println(b + " " + "00" + a);
            } else if (i < 1000000000 && a > 100 && b > 100) {
                System.out.println(c + " " + b + " " + a);
            } else if (i < 1000000000 && a < 100 && a > 10 && b > 100) {
                System.out.println(c + " " + b + " 0" + a);
            } else if (i < 1000000000 && a < 10 && b > 100) {
                System.out.println(c + " " + b + " 00" + a);
            } else if (i < 1000000000 && a < 100 && a > 10 && b < 10) {
                System.out.println(c + " 00" + b + " 0" + a);
            } else if (i < 1000000000 && a < 100 && a > 10 && b < 100 && b > 10) {
                System.out.println(c + " 0" + b + " 0" + a);
            } else if (i < 1000000000 && a < 10 && b < 10) {
                System.out.println(c + " 00" + b + " 00" + a);
            } else if (i < 1000000000 && a < 10 && b < 100 && b > 10) {
                System.out.println(c + " 0" + b + " 00" + a);
            } else if (i < 1000000000 && a > 100 && b > 10 && b < 100) {
                System.out.println(c + " 0" + b + " " + a);
            } else if (i < 1000000000 && a > 100 && b < 10) {
                System.out.println(c + " 00" + b + " " + a);
            } else if (i > 1000000000 && a > 100 && b > 100 && c > 100) {
                System.out.println(d + " " + c + " " + b + " " + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b > 100 && c > 100) {
                System.out.println(d + " " + c + " " + b + " 0" + a);
            } else if (i > 1000000000 && a < 10 && b > 100 && c > 100) {
                System.out.println(d + " " + c + " " + b + " 00" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b < 10 && c > 100) {
                System.out.println(d + " " + c + " 00" + b + " 0" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b < 100 && b > 10 && c > 100) {
                System.out.println(d + " " + c + " 0" + b + " 0" + a);
            } else if (i > 1000000000 && a < 10 && b < 10 && c > 100) {
                System.out.println(d + " " + c + " 00" + b + " 00" + a);
            } else if (i > 1000000000 && a > 100 && b < 100 && b > 10 && c > 100) {
                System.out.println(d + " " + c + " 0" + b + " " + a);
            } else if (i > 1000000000 && a > 100 && b < 10 && c > 100) {
                System.out.println(d + " " + c + " 00" + b + " " + a);
            } else if (i > 1000000000 && a < 10 && b < 100 && b > 10 && c > 100) {
                System.out.println(d + " " + c + " 0" + b + " 00" + a);
            } else if (i > 1000000000 && a > 100 && b > 100 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " " + b + " " + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b > 100 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " " + b + " 0" + a);
            } else if (i > 1000000000 && a < 10 && b > 100 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " " + b + " 00" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b < 10 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " 00" + b + " 0" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b < 100 && b > 10 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " 0" + b + " 0" + a);
            } else if (i > 1000000000 && a < 10 && b < 10 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " 00" + b + " 00" + a);
            } else if (i > 1000000000 && a > 100 && b > 10 && b < 100 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " 0" + b + " " + a);
            } else if (i > 1000000000 && a < 10 && b > 10 && b < 100 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " 0" + b + " 00" + a);
            } else if (i > 1000000000 && a > 100 && b < 10 && c < 100 && c > 10) {
                System.out.println(d + " 0" + c + " 00" + b + " " + a);
            } else if (i > 1000000000 && a > 100 && b > 100 && c < 10) {
                System.out.println(d + " 00" + c + " " + b + " " + a);
            } else if (i > 1000000000 && a > 100 && b < 100 && b > 10 && c < 10) {
                System.out.println(d + " 00" + c + " 0" + b + " " + a);
            } else if (i > 1000000000 && a > 100 && b < 10 && c < 10) {
                System.out.println(d + " 00" + c + " 00" + b + " " + a);
            } else if (i > 1000000000 && a < 10 && b < 100 && b > 10 && c < 10) {
                System.out.println(d + " 00" + c + " 0" + b + " 00" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b > 100 && c < 10) {
                System.out.println(d + " 00" + c + " " + b + " 0" + a);
            } else if (i > 1000000000 && a < 10 && b > 100 && c < 10) {
                System.out.println(d + " 00" + c + " " + b + " 00" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b < 10 && c < 10) {
                System.out.println(d + " 00" + c + " 00" + b + " 0" + a);
            } else if (i > 1000000000 && a < 100 && a > 10 && b < 100 && b > 10 && c < 10) {
                System.out.println(d + " 00" + c + " 0" + b + " 0" + a);
            } else if (i > 1000000000 && a < 10 && b < 10 && c < 10) {
                System.out.println(d + " 00" + c + " 00" + b + " 00" + a);
            }
        }
        if (i < 0) {
            if (i > -1000) {
                System.out.println(i);
            } else if (i > -1000000 && i < -1000 && a < -100) {
                System.out.println(b + " " + -a);
            } else if (i > -1000000 && i < -1000 && a > -100 && a < -10) {
                System.out.println(b + " " + "0" + -a);
            } else if (i > -1000000 && i < -1000 && a > -10) {
                System.out.println(b + " " + "00" + -a);
            } else if (i > -1000000000 && i < -1000000 && a < -100 && b < -100) {
                System.out.println(c + " " + -b + " " + -a);
            } else if (i > -1000000000 && i < -1000000 && a > -100 && a < -10 && b < -100) {
                System.out.println(c + " " + -b + " 0" + -a);
            } else if (i > -1000000000 && i < -1000000 && a > -10 && b < -100) {
                System.out.println(c + " " + -b + " 00" + -a);
            } else if (i > -1000000000 && i < -1000000 && a > -100 && a < -10 && b > -10) {
                System.out.println(c + " 00" + -b + " 0" + -a);
            } else if (i > -1000000000 && i < -1000000 && a > -100 && a < -10 && b > -100 && b < -10) {
                System.out.println(c + " 0" + -b + " 0" + -a);
            } else if (i > -1000000000 && i < -1000000 && a > -10 && b > -10) {
                System.out.println(c + " 00" + -b + " 00" + -a);
            } else if (i > -1000000000 && a > -10 && b > -100 && b < -10) {
                System.out.println(c + " 0" + -b + " 00" + -a);
            } else if (i > -1000000000 && a < -100 && b < -10 && b > -100) {
                System.out.println(c + " 0" + -b + " " + -a);
            } else if (i > -1000000000 && a < -100 && b > -10) {
                System.out.println(c + " 00" + -b + " " + -a);
            } else if (i < -1000000000 && a < -100 && b < -100 && c < -100) {
                System.out.println(d + " " + -c + " " + -b + " " + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b < -100 && c < -100) {
                System.out.println(d + " " + -c + " " + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -10 && b < -100 && c < -100) {
                System.out.println(d + " " + -c + " " + -b + " 00" + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b > -10 && c < -100) {
                System.out.println(d + " " + -c + " 00" + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b > -100 && b < -10 && c < -100) {
                System.out.println(d + " " + -c + " 0" + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -10 && b > -10 && c < -100) {
                System.out.println(d + " " + -c + " 00" + -b + " 00" + -a);
            } else if (i < -1000000000 && a < -100 && b > -100 && b < -10 && c < -100) {
                System.out.println(d + " " + -c + " 0" + -b + " " + -a);
            } else if (i < -1000000000 && a < -100 && b > -10 && c < -100) {
                System.out.println(d + " " + -c + " 00" + -b + " " + -a);
            } else if (i < -1000000000 && a > -10 && b > -100 && b < -10 && c < -100) {
                System.out.println(d + " " + -c + " 0" + -b + " 00" + -a);
            } else if (i < -1000000000 && a < -100 && b < -100 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " " + -b + " " + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b < -100 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " " + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -10 && b < -100 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " " + -b + " 00" + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b > -10 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " 00" + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b > -100 && b < -10 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " 0" + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -10 && b > -10 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " 00" + -b + " 00" + -a);
            } else if (i < -1000000000 && a < -100 && b < -10 && b > -100 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " 0" + -b + " " + -a);
            } else if (i < -1000000000 && a > -10 && b < -10 && b > -100 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " 0" + -b + " 00" + -a);
            } else if (i < -1000000000 && a < -100 && b > -10 && c > -100 && c < -10) {
                System.out.println(d + " 0" + -c + " 00" + -b + " " + a);
            } else if (i < -1000000000 && a < -100 && b < -100 && c > -10) {
                System.out.println(d + " 00" + -c + " " + -b + " " + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b < -100 && c > -10) {
                System.out.println(d + " 00" + -c + " " + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -10 && b < -100 && c > -10) {
                System.out.println(d + " 00" + -c + " " + -b + " 00" + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b > -10 && c > -10) {
                System.out.println(d + " 00" + -c + " 00" + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -100 && a < -10 && b > -100 && b < -10 && c > -10) {
                System.out.println(d + " 00" + -c + " 0" + -b + " 0" + -a);
            } else if (i < -1000000000 && a > -10 && b > -10 && c > -10) {
                System.out.println(d + " 00" + -c + " 00" + -b + " 00" + -a);
            } else if (i < -1000000000 && a < -100 && b > -100 && b < -10 && c > -10) {
                System.out.println(d + " 00" + -c + " 0" + -b + " " + -a);
            } else if (i < -1000000000 && a < -100 && b > -10 && c > -10) {
                System.out.println(d + " 00" + -c + " 00" + -b + " " + -a);
            } else if (i < -1000000000 && a > -10 && b > -100 && b < -10 && c > -10) {
                System.out.println(d + " 00" + -c + " 0" + -b + " 00" + -a);
            }
        }
    }
}