Files.lines(Paths.get("students.csv"))
    .skip(1)
    .map(line -> line.split(","))
    .filter(data -> Integer.parseInt(data[3]) > 80)
    .forEach(data -> System.out.println(Arrays.toString(data)));