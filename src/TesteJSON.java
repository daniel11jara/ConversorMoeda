import org.json.JSONObject;

public class TesteJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
		obj.put("chave", "valor");
		System.out.println(obj.toString());

	}

}
