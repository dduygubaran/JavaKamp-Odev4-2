package ödevDörtİki;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) throws Exception  {
		System.out.println("Veri tabanına kaydedildi: "+ customer.getFirstName() + customer.getLastName());
		
	}
}
