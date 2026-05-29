package WebDriver_Methods;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		int[] a = new int[5];
		a[0] = 10;
		a[1] = 30;
		a[2] = 50;
		a[3] = 70;
		a[4] = 90;

//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

		for (int i : a) {
			System.out.println(i);
		}

	}

}
