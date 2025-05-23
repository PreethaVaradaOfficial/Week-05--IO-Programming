ResultSet rs = stmt.executeQuery("SELECT id, name, dept, salary FROM employees");
try (PrintWriter pw = new PrintWriter("db_export.csv")) {
    pw.println("ID,Name,Department,Salary");
    while (rs.next()) {
        pw.printf("%s,%s,%s,%s%n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
    }
}