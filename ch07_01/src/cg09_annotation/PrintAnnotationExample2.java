package cg09_annotation;

//������̼� ��� - ����üũ,�ڵ�����,�ڵ����� �̰͸��˱� / ����� - �����
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class PrintAnnotationExample2 {

	public static void main(String[] args) {
		// �޼ҵ����� ���-reflection
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
