package laborator2;

import java.util.*;

public class Problema4 {
	public Vector<Integer> reunion (Vector<Integer> v1, Vector<Integer> v2) {
		int i;
		Vector<Integer> v3 = new Vector<Integer>(v1.size() + v2.size());
		for (i = 0; i < v1.size(); i++) {
			v3.add(v1.get(i));
		}
		
		for (i = 0; i < v2.size(); i++) {
			boolean ok = v1.contains(v2.get(i));
			if (ok == false) {
				v3.add(v2.get(i));
			}
		}
		return v3;
	}
	public Vector<Integer> intersection (Vector<Integer> v1, Vector<Integer> v2) {
		int i;
		Vector<Integer> v3 = new Vector<Integer>(v1.capacity() + v2.capacity());
		
		for (i = 0; i < v2.size(); i++) {
			boolean ok = v1.contains(v2.get(i));
			if (ok == true) {
				v3.add(v2.get(i));
			}
		}
		return v3;
	}
	public Vector<Integer> difference (Vector<Integer> v1, Vector<Integer> v2) {
		int i;
		Vector<Integer> v3 = new Vector<Integer>(v1.capacity() + v2.capacity());
		for (i = 0; i < v1.size(); i++) {
			boolean ok = v2.contains(v1.get(i));
			if (ok == false) {
				v3.add(v2.get(i));
			}
		}
		return v3;
	}
	public static void main(String[] args) {
		int i;
		Vector<Integer> v1 = new Vector<Integer>(10);
		Vector<Integer> v2 = new Vector<Integer>(10);
			v1.add(1);
			v1.add(2);
			v1.add(3);
			v1.add(4);
			v1.add(5);
			v1.add(6);
			v1.add(7);
			v1.add(8);
			v1.add(9);
			v1.add(10);
			v2.add(5);
			v2.add(6);
			v2.add(7);
			v2.add(8);
			v2.add(9);
			v2.add(10);
			v2.add(11);
			v2.add(12);
			v2.add(13);
			v2.add(14);
		for (i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		for (i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		Problema4 obj1 = new Problema4();
		Vector<Integer> vr = new Vector<Integer>(20);
		vr = obj1.reunion(v1, v2);
		for (i = 0; i < vr.size(); i++) { 
	           System.out.print(vr.get(i) + " ");
		}
		Problema4 obj2 = new Problema4();
		Vector<Integer> vi = new Vector<Integer>(20);
		vr = obj2.intersection(v1, v2);
		for (i = 0; i < vi.size(); i++) { 
	           System.out.print(vi.get(i) + " ");
		}
		Problema4 obj3 = new Problema4();
		Vector<Integer> vd = new Vector<Integer>(20);
		vd = obj3.difference(v1, v2);
		for (i = 0; i < vd.size(); i++) { 
	           System.out.print(vd.get(i) + " ");
		}
	}

}
