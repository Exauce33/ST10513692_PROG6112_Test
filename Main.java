void main() {
    int [][] numberOfSales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100,1200}};
    String []cityOfSales = {"Cape Town", "Port Elizabeth", "Pretoria"};
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(                 "PS5                XBOX                    SWITCH" );
    for( int i = 0; i < numberOfSales.length; i++){
        System.out.println(cityOfSales[i] +  "\t" + numberOfSales[i]  [0] + "\t" + numberOfSales[i]   [1] + "\t" + numberOfSales[i][2]);
    }
    System.out.println("-----------------------------------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("-----------------------------------------------------------------------------------");

    for (int i = 0; i < numberOfSales.length; i++){
        int total;
        total = numberOfSales[i][0] + numberOfSales[i][1] + numberOfSales[i][2];
        System.out.println(cityOfSales[i] + total );
    }
    int maxTotal = 0;
    int maxIndex = 0;

    for (int i = 0; i< numberOfSales.length; i++){
        int total = numberOfSales[i][0] + numberOfSales[i][1] + numberOfSales[i][2];
        if (total> maxTotal){
            maxTotal = total;
            maxIndex=i;
        }
    }
    System.out.println("CITY WITH THE MOST SALES: " + maxIndex);
    System.out.println("----------------------------------------------------------------------------------");
}