package simple.automation;

public class Main {

    public static void main(String[] args) {
        User instance = new User();

        for (String str : instance.users) {
            if (str.toLowerCase().contains("simple")) {
                System.out.println(str);
            }
        }
    }
}
