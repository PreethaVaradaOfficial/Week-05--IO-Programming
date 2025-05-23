Map<String, String[]> map1 = Files.lines(Paths.get("students1.csv")).skip(1)
    .map(l -> l.split(",")).collect(Collectors.toMap(s -> s[0], s -> s));

Map<String, String[]> map2 = Files.lines(Paths.get("students2.csv")).skip(1)
    .map(l -> l.split(",")).collect(Collectors.toMap(s -> s[0], s -> s));

List<String> merged = new ArrayList<>();
merged.add("ID,Name,Age,Marks,Grade");

map1.forEach((id, s1) -> {
    if (map2.containsKey(id)) {
        String[] s2 = map2.get(id);
        merged.add(String.join(",", s1[0], s1[1], s1[2], s2[1], s2[2]));
    }
});
Files.write(Paths.get("merged.csv"), merged);