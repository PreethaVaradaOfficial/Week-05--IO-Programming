Files.lines(Paths.get("employees.csv"))
    .skip(1)
    .map(line -> line.split(","))
    .sorted((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])))
    .limit(5)
    .forEach(e -> System.out.println(Arrays.toString(e)));