
static final String HEADER = "Sorted List of entered Names:";

void main() {

    List<String> names = new ArrayList<>();

    try (Scanner input = new Scanner(System.in)) {
        IO.print("Enter a name (exit or quit) to finish: ");
        while (true) {
            var name = input.nextLine();
            if (name.equals("quit") || name.equals("exit")) break;
            names.add(name);
        }
        var sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        IO.println(HEADER);
        sortedNames.forEach(IO::println);
    }
}
