Set<String> seen = new HashSet<>();
Files.lines(Paths.get("students.csv"))
    .skip(1)
    .map(l -> l.split(","))
    .filter(s -> !seen.add(s[0]))
    .forEach(d -> System.out.println("Duplicate: " + Arrays.toString(d)));