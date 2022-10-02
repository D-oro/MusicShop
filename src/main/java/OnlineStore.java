import java.util.ArrayList;
public class OnlineStore {
    private Shop shop;
    private Customer customer;
    private ArrayList<Customer> customerList;

    public OnlineStore() {
        this.customerList = new ArrayList<Customer>();
    }
    public String findCustomerNumberByName(String name){
        Customer foundCustomer = null;
        ArrayList<String> foundNumbersList = new ArrayList<String>();
        for(Customer customer : customerList) {
            if (customer.getName() == name) {
                foundCustomer = customer;
                foundNumbersList.add(foundCustomer.getCustomerNumber());
            }
        }
        return foundNumbersList.toString();
    }

    public void addCustomerToCustomerList(Customer customer){
        customerList.add(customer);
    }
    public void removeCustomerFromCustomerList(Customer customer){
        customerList.remove(customer);
    }
    public int getNumberOfCustomersInCustomerList(){
        return customerList.size();
    }


}
