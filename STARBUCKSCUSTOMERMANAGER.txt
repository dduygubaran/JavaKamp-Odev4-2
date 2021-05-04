package ödevDörtİki;
public class StarbucksCustomerManager extends BaseCustomerManager{

		CustomerCheckService customerCheckService;
		
		public StarbucksCustomerManager() {
			
		}
		
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			super();
			this.customerCheckService = customerCheckService;
		}

		@Override
		public void add(Customer customer) throws Exception  {
			
			if( customerCheckService.CheckIfRealPerson(customer)) {
				super.add
				(customer);
			}
			
			else {
				
			 throw new Exception();
			 
			}
			
		}
	

	

}
