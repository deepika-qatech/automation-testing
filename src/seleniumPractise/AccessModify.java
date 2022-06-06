package seleniumPractise;

import javapractice.AccessModifier;

public class AccessModify extends AccessModifier {

	public static void main(String[] args) {

		AccessModify modify = new AccessModify();
		modify.c = 300;
		
		AccessModifier am = new AccessModifier();
		am.d = 400;

	}

}
