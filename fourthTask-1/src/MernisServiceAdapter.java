import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements  IcustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.id),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth);

		return result;
		
	}

}
