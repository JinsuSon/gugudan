package gugudan;

public class Gugudan{
	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			for (int times = 1; times <= 9; times++) {
				System.out.println(Integer.toString(dan) + "X" + Integer.toString(times) + "=" + Integer.toString(dan*times));
			}
		}
	}
}
