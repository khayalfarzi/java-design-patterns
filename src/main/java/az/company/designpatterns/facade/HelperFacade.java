package az.company.designpatterns.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DbType dbType, ReportType reportType, String table) {

        Connection con;
        switch (dbType) {
            case PG:
                con = PgHelper.getConnection();
                PgHelper pgHelper = new PgHelper();
                switch (reportType) {
                    case HTML:
                        pgHelper.generateHtmlReport(table, con);
                        break;
                    case PDF:
                        pgHelper.generatePdfReport(table, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateHtmlReport(table, con);
                        break;
                    case PDF:
                        oracleHelper.generatePdfReport(table, con);
                        break;
                }
                break;
        }
    }
}
