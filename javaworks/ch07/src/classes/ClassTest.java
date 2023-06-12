package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//String 클래스의 여러 가지 정보
		Class class1 = Class.forName("java.lang.String");
		System.out.println(class1.getName());
		
		System.out.println("**** 생성자 정보 ****");
		Constructor<?>[] cons = class1.getConstructors();
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
		
		System.out.println("**** 필드 정보 ****");
		Field[] fields = class1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
		
		System.out.println("**** 매서드 정보 ****");
		Method[] methods = class1.getMethods();
		for(Method method : methods)
			System.out.println(method);
	}

}
