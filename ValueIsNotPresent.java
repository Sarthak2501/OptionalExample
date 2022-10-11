import java.util.Optional;

public class ValueIsNotPresent {
    public static void main(String[] args) {

        String [] str = new String[10];

        Optional<String> checkNull = Optional.ofNullable(str[5]);

        if (checkNull.isPresent()) {
            String lowercaseString = str[5].toLowerCase();

            System.out.println(lowercaseString);
        }else {
            System.out.println("String is not present");
        }
    }
}
