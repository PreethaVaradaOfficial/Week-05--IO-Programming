try (BufferedReader br = Files.newBufferedReader(Paths.get("large.csv"))) {
    List<String> batch = new ArrayList<>();
    String line;
    int count = 0;
    while ((line = br.readLine()) != null) {
        batch.add(line);
        if (batch.size() == 100) {
            count += batch.size();
            System.out.println("Processed: " + count);
            batch.clear();
        }
    }
    if (!batch.isEmpty()) {
        count += batch.size();
        System.out.println("Processed: " + count);
    }
}