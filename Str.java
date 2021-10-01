public class Str 
{
	public static void main(String[] args) 
	{
		String reverse = "", original;
		int i,j;
		for (i = args.length - 1 ; i >= 0; i--)
		{
			original = args[i];
			for (j = original.length() - 1; j >= 0; j--)
				reverse = reverse + original.charAt(j);
			reverse = reverse + " ";
		}
		System.out.print("Original String: ");
		for (String z : args)
			System.out.print(" "+ z +" ");
		System.out.println();
		System.out.println("Reverse of original String: "+reverse);
	}
}
