import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager{ 
	
	
	
	IcustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(IcustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	
	
	@Override
	public void save(Customer customer) throws RemoteException {
		
		
		if (customerCheckService.checkIfRealPerson(customer)) 
		{
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
		
		
		super.save(customer);
	}

	

	

 	
 	

}
