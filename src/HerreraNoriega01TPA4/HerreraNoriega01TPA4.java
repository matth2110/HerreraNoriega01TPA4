package HerreraNoriega01TPA4;

public class HerreraNoriega01TPA4 {


    public static void main(String...args){
        CompanyStores company = new CompanyStores();
        company.start();
        Store store = new Store();
        store.getStoreLctn();
        store.getManager();
        store.getProjectedAnnualSales();
        store.getTotalQtrlySales();
        company.myStores[0] = store;company;
        company.displayStoreStats();


    }


}