
class FindingFirstEx {

    public static void main(String[] args) {
        // Example code to demonstrate finding the first element in a stream
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");

        java.util.Optional<String> firstName = names.stream()
                .findFirst();

        firstName.ifPresent(System.out::println); // Output: Alice
    }

}