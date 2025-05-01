import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;


public class MoedaService {
	
	private static final String API_KEY = "dd8b6bfe2d1f5da3d0aea6ae";
	
	public double buscarTaxaCambio (String moedaOrigem, String moedaDestino) {
		
		try {
			String url_str = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", API_KEY, moedaOrigem, moedaDestino);
			
			URL url = new URL(url_str);
			HttpURLConnection request = (HttpURLConnection) url.openConnection();
			request.setRequestMethod("GET");
			request.connect();
			
			int responseCode = request.getResponseCode();
			
			if(responseCode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responseCode);
			} else {
				BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
				StringBuilder response = new StringBuilder();
				String inputLine;
				
				while((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				
				in.close();
				
				JSONObject obj = new JSONObject(response.toString());
				return obj.getDouble("conversion_rate");
			}
			
		
		} catch (Exception e) {
			
			System.out.println("Erro ao buscar taxa de cambio: " + e.getMessage());
			return -1;
			
			
		
		
	}

}
}
