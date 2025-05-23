Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
Pattern phonePattern = Pattern.compile("^\\d{10}$");

Files.lines(Paths.get("data.csv"))
    .skip(1)
    .map(line -> line.split(","))
    .filter(data -> {
        boolean validEmail = emailPattern.matcher(data[2]).matches();
        boolean validPhone = phonePattern.matcher(data[3]).matches();
        if (!validEmail || !validPhone) {
            System.out.println("Invalid: " + Arrays.toString(data));
            return false;
        }
        return true;
    }).count();  // Forcing execution
