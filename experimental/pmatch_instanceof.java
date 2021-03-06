///usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 16+

public class pmatch_instanceof {

    public static void main(String[] args) {
        Object obj = "A string";
        // Straightforward test
        if (obj instanceof String str) {
            System.out.println(str);
        }
        // Negated works too
        if (!(obj instanceof String str)) {
        } else {
            System.out.println(str);
        }
        // Even more complex conditions
        if (obj instanceof String str && str.length() > 0) {
            System.out.println(str);
        }
    }
}
