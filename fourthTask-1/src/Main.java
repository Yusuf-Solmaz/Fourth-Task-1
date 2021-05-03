import java.rmi.RemoteException;

public class Main {

	
	public static void main (String []args ) throws RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer("11111111111","YUSUF","SOLMAZ",2000));
	
		
	}
}
