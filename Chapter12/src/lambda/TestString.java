package lambda;

public class TestString {

	public static void main(String[] args) {

		StringConImpl impl = new StringConImpl();
		impl.makeString("A", "B");
		
		StringConcat concat = (x, y) -> System.out.println(x + ", " + y);
		concat.makeString("hello", "java");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "world");
		
	}

}
