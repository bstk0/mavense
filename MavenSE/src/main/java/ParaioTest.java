import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ParaioTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://paraio.com/v1/object1s")
				  .method("GET", null)
				  .addHeader("Authorization", "AWS4-HMAC-SHA256 Credential=app:dbapp/20200107/us-east-1/para/aws4_request, SignedHeaders=host;x-amz-date, Signature=452028d0abf6a2a161a86d0769c0481842a52d101cb01a9abf19962ea4521f67")
				  .build();
				Response response = client.newCall(request).execute();
				System.out.println(response.toString());
	}

}
