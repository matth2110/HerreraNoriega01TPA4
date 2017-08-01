package HerreraNoriega01TPA4;

import java.util.Scanner;


public class Store {

    Scanner input = new Scanner(System.in);
    private String location;
    private String manager;
    private double annualSales;
    private double totalQtrlySales;


    public void store() {
    }

    public void store(String location, String manager) {

    }


    public void setManager(int num) {
        System.out.printf("\nEnter the name of the manager for store %d:  ", num);
        manager = input.nextLine();
    }


    public void setTotalQtrlySales(int num) {
        System.out.printf("\nEnter the sales revenue for the 1st quarter of store %d:  ", num);
        totalQtrlySales = input.nextDouble();
        System.out.printf("\nEnter the sales revenue for the 2nd quarter of store %d:  ", num);
        totalQtrlySales += input.nextDouble();
        System.out.printf("\nEnter the sales revenue for the 3rd quarter of store %d:  ", num);
        totalQtrlySales += input.nextDouble();
        System.out.printf("\nEnter the sales revenue for the 4th quarter of store %d:  ", num);
        totalQtrlySales += input.nextDouble();
    }


    public void setProjectedAnnualSales(int num) {
        System.out.printf("\nWhat is the projected annual sales for store %d: ", num);
        annualSales = input.nextDouble();

    }


    public void setStoreLctn(int num) {
        System.out.printf("\nEnter the location for store %d:  ", num);
        location = input.nextLine();
    }


    public String getStoreLctn() {
        return location;
    }

    public double getProjectedAnnualSales() {
        return annualSales;
    }

    public double getTotalQtrlySales() {
        return totalQtrlySales;
    }

    public String getManager() {
        return manager;
    }
}