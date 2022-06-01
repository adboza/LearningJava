package Programming.devdojo.javacore.Kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    STARTUP(3, "Startup");

    private int dbValue;
    private String reportValue;

    CustomerType(int dbValue, String reportValue){
        this.dbValue = dbValue;
        this.reportValue = reportValue;
    }

    public String getReportValue() {
        return reportValue;
    }

    public int getDbValue() {
        return dbValue;
    }

    public void setDbValue(int dbValue) {
        this.dbValue = dbValue;
    }
}
