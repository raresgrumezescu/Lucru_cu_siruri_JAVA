package laborator2;

import java.util.*;

public class Problema2_StringTokenizer {
	public int countSubstrings (String s1, String s2) {
		StringTokenizer s = new StringTokenizer (s1, ":,.-?");
		int k = 0;
		int count = 0;
		String[] str = new String[100];
		while (s.hasMoreTokens()) {
			str[k++] = s.nextToken();
		}
		int i;
		for (i = 0; i < k; i++)
			if (str[i].equals(s2))
				count++;
		return count;
	}
	
	public static void main(String[] args) {
		String s1 = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
		String s2 = "pe";
		Problema2_StringTokenizer obj = new Problema2_StringTokenizer();
		int count = obj.countSubstrings(s1, s2);
		System.out.println (count);
	}
}
