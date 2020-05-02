package api;

public class StringAPI {
    public static void main(String[] args) {
         String beta = "Try this";
         String alpha = "Do not";
        System.out.println(beta.compareTo(alpha));
        System.out.println(beta.concat(alpha));
        System.out.println(alpha + " " + beta );
        System.out.println(beta.contains("a"));
        System.out.println(beta.length());
        System.out.println(alpha.indexOf(6));

        char data [] = {'x', 'y', 'z'};
        String lang = new String(data);
        System.out.println(lang);
    }

}
