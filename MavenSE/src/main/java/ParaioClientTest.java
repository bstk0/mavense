import com.erudika.para.client.ParaClient;

public class ParaioClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ACCESS_KEY = "app:dbapp";
		final String SECRET_KEY = "sb7gzSnNtoYVOJ/93WPZ+gqAKtZRWJuz5WZ4c0gMswdxmkaVweQK1Q==";
		final String paraServerURL = "https://paraio.com"; ///v1/object1s";
		
		ParaClient pc = new ParaClient(ACCESS_KEY, SECRET_KEY);
		
		pc.setEndpoint(paraServerURL);
		// Set this to true if you want ParaClient to throw exceptions on HTTP errors
		pc.throwExceptionOnHTTPError(false);
		// send a test request - this should return a JSON object of type 'app'
		pc.me();

	}

}
