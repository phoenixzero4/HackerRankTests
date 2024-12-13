package certification.basic;

// what will the outcome of the following code be?

public class A {
	
	int add(int i , int j) {
		return i + j;
	}
}
	public class B extends A{
		public static void main(String argv[]) {
			short s = 9;
			
			// a compilation error will occur when trying to access a non-static method in a static way
			System.out.println( add(s,6) );
		}
	}

