package part7.task31;

class ParagraphTags {
    public static void replacement(String string) {
        System.out.println(string.replaceAll("<p(\\s+[^>]*)?>", "<p>"));
    }
}
