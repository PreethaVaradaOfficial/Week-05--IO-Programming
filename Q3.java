long count = Files.lines(Paths.get("students.csv")).skip(1).count();
System.out.println("Total Records: " + count);