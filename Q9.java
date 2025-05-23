class Student {
    String id, name;
    int age, marks;
    // constructor, toString
}
List<Student> students = Files.lines(Paths.get("students.csv"))
    .skip(1)
    .map(line -> {
        String[] s = line.split(",");
        return new Student(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]));
    }).collect(Collectors.toList());
students.forEach(System.out::println);