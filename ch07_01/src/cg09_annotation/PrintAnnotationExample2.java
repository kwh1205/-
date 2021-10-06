package cg09_annotation;

//어노테이션 기능 - 문법체크,자동생성,자동실행 이것만알기 / 대상은 - 모든대상
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class PrintAnnotationExample2 {

	public static void main(String[] args) {
		// 메소드정보 얻기-reflection
		Method[] declareMethods = Service.class.getDeclaredMethods();
		Constructor[] cons = Service.class.getConstructors();
		Field[] field = Service.class.getFields();
		for (Method method : declareMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

			for (int i = 0; i < printAnnotation.number(); i++)
				System.out.print(printAnnotation.value());
			System.out.println();
		}

	}

}
