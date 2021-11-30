package laborator2;

import java.util.Random;
import java.util.Vector;
import java.lang.Math;
//import java.util.concurrent.ThreadLocalRandom;
//import java.util.*;

public class Problema3 {
	public int aparitii (Vector<Integer> v, int x) {
			int i;
			int count = 0;
			if (v != null) {
				for (i = 0; i < v.size(); i++) {
					/*if (v.get(i) == x) {
						count++;
						continue; 
					} */
					if (v.get(i) == x) {
						v.remove(i);
						count++;
					}
				} 
			}
			return count;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		Vector<Integer> v = new Vector<Integer>(20);
		for (int i = 0; i < 20; i++) {
			int nr = r.nextInt(11);
			v.add(Math.abs(nr));
		}
		for (int i = 0; i < 20; i++) {
			System.out.println (v.get(i));
		}
		Problema3 obj = new Problema3();
		int count = obj.aparitii(v, 2);
		System.out.println ("\n\n");
		//int count = v.aparitii (v, 1);
		for (int i = 0; i < v.size(); i++) {
			System.out.println (v.get(i));
		}
		int S = 0;
		int min = 11, minPoz = 0;
		int max = -1;
		for (int i = 0; i < v.size(); i++) {
			S += v.get(i);
			if (min > v.get(i)) {
				min = v.get(i);
				minPoz = i;
			}
			if (max < v.get(i))
				max = v.get(i);
		}
		double ma = S / 20;
		System.out.println (minPoz + " " + max + " " + ma);
		System.out.println (count);
	}
}
