package basics;
import java.util.*;

public class p5 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        String Str = "green";

        System.out.println(ls);
        System.out.println("Removing the nth Element:" + ls.remove(Str));
        System.out.println(ls);
    }
}