try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
    String line;
    while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        System.out.printf("ID: %s, Name: %s, Age: %s, Marks: %s%n", values[0], values[1], values[2], values[3]);
    }
}