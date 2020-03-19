package lgs.academy;

public class Exercise1 {

	public static void main(String[] args) {

//		int a = 2;
//		long b = 3;
//		
//		System.out.println("var a = " +a);
//		System.out.println("var a = " +b);

		// Приклад 1: Додавання і віднімання змінних

//		int d = 1;
//		int e = 2;
//		int res1 = d + e;
//		int res2 = d - e;
//		int res3 = d * e;
//		int res4 = d / e;
//		
//		System.out.println("res1 = " +res1);
//		System.out.println("res2 = " +res2);
//		System.out.println("res3 = " +res3);
//		System.out.println("res4 = " +res4);

		// Приклад 2: Який буде результат виведення на екран? (інкремент/декремент)

//		int a = 0;
//		int b = a++;
//		int c = a++;
//		
//		System.out.println("Приклад 2 = " + a + " " + b + " " + c + " ");

		// Приклад 3: Операції з присвоєнням

//		int f = 1;
//		int g = 2;
//		int h = 3;
//		
//		f += 5;
//		g *= 4;
//		h += f * g;
//		h %= 6;
//		
//		System.out.println("f = "+f);
//		System.out.println("g = "+g);
//		System.out.println("h = "+h);

		// Приклад 4: Тернарний оператор

//		int a = 2;
//		int r = a < 0? 1 : 0;
//		System.out.println("r = "+r);

		// Приклад 5: Логічні оператори

//		boolean j = true;
//		boolean k = false;
//		boolean l = j | k;
//		boolean m = j & k;
//		boolean n = (!j & k) | (j & !k);
//		boolean o = !j;
//		
//		System.out.println("j = "+j);
//		System.out.println("k = "+k);
//		System.out.println("l = "+l);
//		System.out.println("m = "+m);
//		System.out.println("n = "+n);
//		System.out.println("o = "+o);

		// Приклад 6: Операції рівності

//		int t = 5;
//		int u = 5;
//		String result1 = (t<u) ? "Yes" : "No";
//		String result2 = (t==u) ? "Yes" : "No";
//		String result3 = (t>=u) ? "Yes" : "No";
//		
//		System.out.println("result1 = "+result1);
//		System.out.println("result1 = "+result2);
//		System.out.println("result1 = "+result3);

		// Приклад 7: Конструкція if-else

//		int a1 = 2;
//		int b1 = 4;

//
//		if (a1 > b1) {
//			System.out.println("a1 > b1");
//		} else {
//			System.out.println("a1 < b1");
//		}

		// Приклад 7: Конструкція if-else -if

//		if (a1 * a1 == b1) {
//			System.out.println("1");
//		} else if (a1 * a1 < b1) {
//			System.out.println("2");
//		} else {
//			System.out.println("3");
//		}

		// Приклад 8: Конструкція switch

//		int k1 = 2;
//		
//		switch(k1) {
//		case 1: case 3: case 4:
//			System.out.println("1, 3, 4");break;
//		
//		case 2: System.out.println("2");break;
//		default :System.out.println("default");
//		}

		// Приклад 8: Цикл for

//		for(int i = 1; i <= 10; i++) {
//			System.out.println("i = "+i);
//		}

		// Приклад 9: Цикл while

//		int i = 1;
//		while (i<=10) {
//			System.out.println("i = "+i);
//			i++;
//			}

		// Приклад 10: Цикл do-while

//		do {
//			System.out.println("do i ="+i);
//			i++;
//		}while (i==10);

		// Приклад 11: Масиви

//		int[] array1 = new int[10];
//		double[] array2 = new double[10];
//		double[] array3 = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//
//		for (int i = 0; i < array1.length; i++) {
//			array1[i] = i;
//			array2[i] = i*i;
//		}
//
//		for (int i =0; i < array1.length; i++) {
//			System.out.println(array1[i] +" -> ");
//			System.out.println(array2[i]);
//		}
//		
//		for(int i = 0; i < array3.length; i++) {
//			System.out.println(array3[i]);
//		}

		// Приклад 12: Обгортки примітивів (Wrappers primitives)

		Byte a1 = 2;
		Short a2 = 2;
		Integer a3 = 2;
		Long a4 = 2L;
		
		int a5 = a1;
		a3 = a5;

		Double b = 2.2;
		Float b1 = 3.3F;
		
		int a =2;
	System.out.println("int max = " + Integer.MAX_VALUE);

	}

}