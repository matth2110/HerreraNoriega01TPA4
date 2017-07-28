package HerreraNoriega01TPA4;
import java.util.Scanner;


public class Store {

    public Scanner input = new Scanner(System.in);
    public String location;
    public String manager;
    public double annualSales;
    public double totalQtrlySales;

    public void store() {

    }

    public void store(String location, String manager) {


    }





    public void setManager(Store[] myStores) {
        int size = myStores.length;
        String[] manager = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("\nEnter the name of the manager for store %d: ", i + 1);
            manager[i] = input.next();
        }
    }


    public void setTotalQtrlySales(Store[] myStores) {
        int size = myStores.length;
        double[] totalQtrlySales = new double[size];
        totalQtrlySales[0] = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("\nEnter the sales revenue for the 1st quarter of store %d: ", i + 1);
            totalQtrlySales[i] = input.nextDouble();
            totalQtrlySales[i] = totalQtrlySales[i] + totalQtrlySales[i];
            System.out.printf("\nEnter the sales revenue for the 2nd quarter of store %d: ", i + 1);
            totalQtrlySales[i] = input.nextDouble();
            totalQtrlySales[i] = totalQtrlySales[i] + totalQtrlySales[i];
            System.out.printf("\nEnter the sales revenue for the 3rd quarter of store %d: ", i + 1);
            totalQtrlySales[i] = input.nextDouble();
            totalQtrlySales[i] = totalQtrlySales[i] + totalQtrlySales[i];
            System.out.printf("\nEnter the sales revenue for the 4th quarter of store %d: ", i + 1);
            totalQtrlySales[i] = input.nextDouble();
            totalQtrlySales[i] = totalQtrlySales[i] + totalQtrlySales[i];
        }
    }


    public void setProjectedAnnualSales(Store[] myStores) {
        int size = myStores.length;
        double[] annualSales = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("\nWhat is the projected annual sales for store %d? ", i + 1);
            annualSales[i] = input.nextDouble();
        }
    }

    public void setStoreLctn(Store[] myStores) {
        int size = myStores.length;
        String[] location = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("\nEnter the location for store %d: ", i + 1);
            location[i] = input.next();
        }
    }

    public String getStoreLctn(){
        return location;
    }

    public double getProjectedAnnualSales(){
        return annualSales;
    }

    public double getTotalQtrlySales(){
        return totalQtrlySales;
    }

    public String getManager(){
        return manager;
    }
}