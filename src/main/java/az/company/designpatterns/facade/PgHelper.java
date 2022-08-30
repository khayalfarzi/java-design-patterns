package az.company.designpatterns.facade;

import java.sql.Connection;

public class PgHelper {

    public static Connection getConnection() {
        // function for connect to postgresql database
        return null;
    }

    public void generateHtmlReport(String table, Connection connection) {
        System.out.printf("generate html report from %s table using postgresql db\n", table);
    }

    public void generatePdfReport(String table, Connection connection) {
        System.out.printf("generate pdf report from %s table using postgresql db\n", table);
    }
}
