
public class Test {
	public static void main(String[] args) {
		ArrayList<Character> S = new ArrayList();
		S.add(0,'A');
		S.add(0,'B');
		S.get(1);
		System.out.println("Get : "+S.get(1));
		//S.set(2,'C');
		//System.out.println(S.set(2,'C'));
		System.out.println("Error");
		S.add(2,'C');
		//S.add(4,'D');
		//System.out.println(S.set(4,'D'));
		System.out.println("Error");
		System.out.println("Remove : "+S.remove(1));
		S.add(1,'D');
		S.add(1,'E');
		//S.get(4);
		System.out.println("Error");
		S.add(4,'F');
		System.out.println("Set : "+S.set(2, 'G'));
		S.set(2,'G');
		S.get(2);
		System.out.println("Get : "+S.get(2));
	}

}