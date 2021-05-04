package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class MernisServiceAdapter {

	public static void main(String[] args) throws RemoteException{
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("26515838952"), "DUYGU", "BARAN",1995);
		System.out.println("Doğrulama: " + (result ? "Başarılı" : "Başarısız"));
		
	}

}
