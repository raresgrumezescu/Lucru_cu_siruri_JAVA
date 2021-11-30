package laborator2;

public class problema2_split {
	public int countSubstrings (String s1, String s2) {
		String[] vect_sir = s1.split(" ");
		int i;
		int count = 0;
		for (i = 0; i < vect_sir.length; i++)
			if (vect_sir[i].equals(s2))
				count++;
		return count;
	}
	
	public static void main(String[] args) {
		String s1 = "sir1 si sir2 sunt 2 siruri";
		String s2 = "sir";
		problema2_split obj = new problema2_split();
		int count = obj.countSubstrings(s1, s2);
		System.out.println(count);
	}
}
