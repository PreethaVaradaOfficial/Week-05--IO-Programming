String searchName = "Alice";
Files.lines(Paths.get("employees.csv"))
    .skip(1)
    .map(line -> line.split(","))
    .filter(data -> data[1].equalsIgnoreCase(searchName))
    .forEach(data -> System.out.println("Dept: " + data[2] + ", Salary: " + data[3]));