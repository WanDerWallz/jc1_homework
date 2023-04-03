package lesson8;

public final class StringUtil {
    {
        System.out.println("Hello!");
    }
    static {
        System.out.println("Copyright: you are using StringUtil.");
    }
    private StringUtil() {}
    public static String multiplyString(String s, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }
}
