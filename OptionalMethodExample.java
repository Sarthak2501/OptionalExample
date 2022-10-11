import java.util.Optional;

public class OptionalMethodExample {
    public static void main(String[] args) {
        String [] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> value = Optional.of(str[5]);
        System.out.println(value);

        // If value is present, it returns an Optional otherwise returns an empty Optional
        System.out.println("Filtered Value : " + value.filter((s) -> s.equals("Abc")));
        System.out.println("Filtered Value : " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));


        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        System.out.println("Getting Value : " + value.get());
        System.out.println("Getting HashCode : " + value.hashCode());

        // It returns true if value is present, otherwise false
        System.out.println("Is Value Present : " + value.isPresent());
        System.out.println("Is Value Present : " + empty.isPresent());


        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional : " + Optional.ofNullable(str[5]));


        // It returns value if available, otherwise returns specified value,
        System.out.println("orElse : " + value.orElse("Value is not present"));
        System.out.println("orElse : " + empty.orElse("Value is not present"));


        value.ifPresent(System.out::println);
    }
}
