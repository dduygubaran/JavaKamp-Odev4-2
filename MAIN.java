package ödevDörtİki;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.add(new Customer("1", "duygu", " baran",  "1995","12345678900"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager2.add(new Customer("2", "engin", " demiroğ",  "1985","28861499108"));
		
		
	}
}
