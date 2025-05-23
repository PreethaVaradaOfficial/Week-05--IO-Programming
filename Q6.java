List<String> updated = Files.lines(Paths.get("employees.csv"))
    .map(line -> {
        String[] d = line.split(",");
        if (!d[0].equals("ID") && d[2].equals("IT")) {
            d[3] = String.valueOf(Double.parseDouble(d[3]) * 1.1);
        }
        return String.join(",", d);
    }).collect(Collectors.toList());
Files.write(Paths.get("updated_employees.csv"), updated);