
import java.util.Scanner;


public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public void getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = CustomerFactory.createCustomer("Regular");
                break;
            case "Mountain":
                customer = CustomerFactory.createCustomer("Mountain");
                break;
            case "Delinquent":
                customer = CustomerFactory.createCustomer("Delinquent");
                break;
        }
    }
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.getCustomerTypeFromUser("Regular");
                break;
            case 2:
                app.getCustomerTypeFromUser("Mountain");
                break;
            case 3:
                app.getCustomerTypeFromUser("Delinquent");
                break;
            
        }
        System.out.println(app.generateMail());        
    }
}
