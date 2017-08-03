package HerreraNoriega01TPA4;

import java.util.Scanner;

public class CompanyStores {

    Scanner input = new Scanner(System.in);
    Store[] myStores;
    int noOfStores;
    String companyName;


    public CompanyStores() {
    }


    public void start() {
        System.out.print("Do you want to track the sales performance of your store(s)? Enter 'Y' or 'N':  ");
        char answer = input.nextLine().charAt(0);
        if (Character.toUpperCase(answer) == 'Y') {
            processStoreInfo();
            displayStoreStats();
        } else
            System.out.print("Thank you! Exiting Program.");
    }


    public void processStoreInfo() {
        System.out.printf("%nWhat is the name of your company? ");
        this.companyName = input.next();
        System.out.printf("%nHow many stores do you have? ");
        noOfStores = input.nextInt();
        myStores = new Store[noOfStores];
        for (int i = 0; i < myStores.length; i++) {
            int num = i + 1;
            myStores[i] = new Store();
            myStores[i].setStoreLctn(num);
            myStores[i].setManager(num);
            myStores[i].setTotalQtrlySales(num);
            myStores[i].setProjectedAnnualSales(num);
        }
    }


    public void displayStoreStats() {
        double salesDifference;
        String message = "";
        String report = "%n%nSALES FOR TANDEM AT ALL LOCATIONS%n";
        for (Store detail : myStores) {
            salesDifference = detail.getTotalQtrlySales() - detail.getProjectedAnnualSales();
            if (salesDifference > 0) {
                message = "KEEP UP THE GOOD WORK! Your store is ahead of your annual sales "
                        + "projection are right on target.";
            } else {
                message = "WARNING! Your store sales are below annual projections.";
            }
            report += String.format(
                    "%nStore:  TANDEM @%s"
                            + "%nManger:  %s"
                            + "%nProjected Annual Sales:  $%,.2f"
                            + "%nTotal Quarterly Sales:  %,.2f"
                            + "%nDifference:  $%,.2f"
                            + "%nPerformance:  %s%n",
                    detail.getStoreLctn(), detail.getManager(), detail.getProjectedAnnualSales(), detail.getTotalQtrlySales(), salesDifference, message);

        }//END for
        System.out.printf(report);
    }//END displayStoreStats()
}