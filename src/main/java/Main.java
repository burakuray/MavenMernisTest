import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

public class Main {

	public static void main(String[] args) throws MalformedURLException {

		String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
		URL url = URI.create(endpoint).toURL();
		KPSPublic service = new KPSPublic(url);
		KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
		//System.out.println(port.tcKimlikNoDogrula(XXXXXXXXXL, "BURAK", "URAY",XXXX));
	}

}
