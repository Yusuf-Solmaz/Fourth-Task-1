import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) throws RemoteException {
		
		System.out.println("Saved to database: "+ customer.firstName);
	}

}
