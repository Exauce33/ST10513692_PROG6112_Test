public abstract class Console implements IConsole{
    private String consoleType;
    private String store;
    private int totalSales;
    public void Consoles(String consoleType, String store, int totalSales){
        this.consoleType = consoleType;
        this.store =store;
        this.totalSales = totalSales;
    }
    @Override
    public String getConsoleType() {
        return getConsoleType();
    }

    @Override
    public String getStore() {
        return null;
    }


    @Override
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}
