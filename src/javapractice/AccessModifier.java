package javapractice;

public class AccessModifier {

	private int a;
	int b;
	protected int c;
	public int d;

	public static void main(String[] args) {

		AccessModifier am = new AccessModifier();
		am.a = 100;
		am.b = 200;
		am.c = 300;
		am.d = 400;

	}

}
