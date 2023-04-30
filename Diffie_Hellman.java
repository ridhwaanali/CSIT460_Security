
    import java.util.Scanner;
	import java.util.Random;

	public class Diffie_Hellman
	{
	 
		

		private static Scanner sc;
		private static int [] is;
		public static void main(String args[]) {
		{
			
			 
		    sc = new Scanner (System.in);
			Random rand= new Random();
			System.out.println("Enter Prime Number Value for Parameter(p)");
		    int p= sc.nextInt();
		    int a = rand.nextInt(31);
			int b = rand.nextInt(29);
			int g = (int)Math.pow(b,a)&p;
			int A = (int)Math.pow(g,a)&p;
			int B = (int)Math.pow(g,b)&p;
			int SA = (int)Math.pow(B,a)&p;
			int SB =(int)Math.pow(A,b)&p;	

			System.out.println("The value of p selected:"+rand.nextInt(p));
			System.out.println("The value of g selected:"+g);
			System.out.println("The value of a selected by Alice: "+a);
			System.out.println("The value of b selected by Bob: "+b);
			System.out.println("The value of A sent to Bob by Alice: "+A);
			System.out.println("The value of B sent to Alice by Bob: "+B);
			System.out.println("The value of shared key computed by Alice: "+SA);
			System.out.println("The value of shared key computed by Bob: "+SB);}
			
			
		}
		public static Scanner getSc() {
			return null;
		
		}
		public static void setSc(Scanner sc) {
		}
		public static int [] getIs() {
			return is;
		}
		public static int setIs(int [] is) {
			Diffie_Hellman.is = is;
			return 0;
		}	
	}

