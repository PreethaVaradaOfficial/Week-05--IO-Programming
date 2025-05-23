try (PrintWriter pw = new PrintWriter("employees.csv")) {
    pw.println("ID,Name,Department,Salary");
    pw.println("1,John,IT,5000");
    pw.println("2,Alice,HR,4500");
    // Add 3 more records similarly
}