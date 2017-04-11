package providertest;

import java.lang.reflect.Field;

public class ZooKeeperTest {
	public static void main(String[] args) throws Exception {
		
		String fozu="                   _ooOoo_\n                  o8888888o\n                  88\" . \"88\n                  (| -_- |)\n                  O\\  =  /O\n               ____/`---'\\____\n             .'  \\\\|     |//  `.\n            /  \\\\|||  :  |||//  \\\n           /  _||||| -:- |||||-  \\\n           |   | \\\\\\  -  /// |   |\n           | \\_|  ''\\---/''  |   |\n           \\  .-\\__  `-`  ___/-. /\n         ___`. .'  /--.--\\  `. . __\n      .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n======`-.____`-.___\\_____/___.-`____.-'======\n                   `=---='\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n                 佛祖保佑       永无BUG";
		
		System.out.println(fozu);
		
		
		City city =new City("北京", "海淀");
		Field[] fields = city.getClass().getDeclaredFields();
		for(Field field : fields){
			field.setAccessible(true);
			if(field.getName().equals("cityName")){
				field.set(city, "太原");
			}
			System.out.println(field.getName() +"------"+ field.get(city)+"------"+field.getType());
		}
	}
}
