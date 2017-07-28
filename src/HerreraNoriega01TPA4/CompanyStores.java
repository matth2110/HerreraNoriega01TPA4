package HerreraNoriega01TPA4;

import java.io.IOException;
import java.util.Scanner;

public class CompanyStores {

    public Scanner input = new Scanner(System.in);
    public Store[] myStores;
    public Store locations = new Store();

    public CompanyStores() {

    }


    public void start() {
        System.out.print("Do you want to track the sales performance of your store(s)? Enter 'Y' or 'N':");
        try {
            char result = (char) System.in.read();
            System.out.println();
            if (result == 'Y' || result == 'y') {
                processStoreInfo();
                displayStoreStats();
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Thank you! Exiting Program.");
    }


    public void processStoreInfo() {
        System.out.print("What is the name of your company? ");
        String companyName = input.next();

        System.out.print("How many stores do you have? ");
        int noOfStores = input.nextInt();
        myStores = new Store[noOfStores];

    }


    public void displayStoreStats() {
        double SalesDifference = 0.00;
        String message = "";
        String report = "\n\nSALES FOR TANDEM AT ALL LOCATIONS";
        locations.setStoreLctn(myStores);
        locations.setManager(myStores);
        locations.setTotalQtrlySales(myStores);
        locations.setProjectedAnnualSales(myStores);
        for (int i=0; i < myStores.length; i++) System.out.println("Store: " + locations.getStoreLctn());

    }


}