package javapractice;

public class StaticFinal {

	static int stat;
	int nstat;
	final int fin = 5000; 
	
	public static void main(String[] args) {

		StaticFinal sf1 = new StaticFinal();
		sf1.stat = 100;
		sf1.nstat = 10;
		System.out.println(stat);
		System.out.println(sf1.nstat);
		StaticFinal sf2 = new StaticFinal();
		sf2.stat = 200;
		sf2.nstat = 20;
		System.out.println(stat);
		System.out.println(sf2.nstat);
		stat = 600;
		System.out.println(stat);
		System.out.println(sf1.stat);
		System.out.println(sf2.stat);
		System.out.println(sf1.fin);
		

	}

}
