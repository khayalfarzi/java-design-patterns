package az.company.designpatterns.facade;

import java.sql.Connection;

public class App {

    public static void main(String[] args) {

        String tableName = "Employee";

        //generating Postgresql HTML report and Oracle PDF report without using Facade
        Connection pg = PgHelper.getConnection();
        PgHelper pgHelper = new PgHelper();
        pgHelper.generatePdfReport(tableName, pg);

        Connection oracle = OracleHelper.getConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateHtmlReport(tableName, oracle);

        //generating Postgresql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(DbType.PG, ReportType.HTML, tableName);
        HelperFacade.generateReport(DbType.ORACLE, ReportType.PDF, tableName);
    }
}
