
package entertainmentproduction;

public class ProductionCompany {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ProductionCompany() {
        
    }
    
    public ProductionCompany(String companyName) {
        this.companyName = companyName;
    }
    
    public void stopProduction(){
        System.out.println("Production has been stopped");
    }
    
    public void productionInfo(){
        System.out.println("Company Name is: "+companyName);
    }
    
}
