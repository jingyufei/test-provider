package providertest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.jing.entity.User;
import com.jing.httpUtil.HttpCallerUtils;
import com.jing.util.FastJsonConvert;
import com.jing.util.HttpProxy;


public class HttpTest2 {
	
	@Test
	public void testGetUser() throws IOException{
		Map<String, String> map = new HashMap<String, String>();
		String str = HttpCallerUtils.get("http://localhost:9002/provider/userInfo/getUser", map);
		System.out.println(str);
	}
/*	
	@Test
	public void testSaveUser() throws IOException{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "小明");
		map.put("age", 20);
		HttpPostUtils.httpPost("http://localhost:9002/provider/userInfo/saveUser", headerMap, map);
	}*/
	
	@Test
	public void testSaveUser() throws IOException{
		User user = new User(2, "小明", 20);
 		String responseStr = HttpProxy.postJson("http://localhost:9002/provider/userInfo/saveUser",FastJsonConvert.convertObjectToJSON(user));
 		System.out.println(responseStr);
	}
}
