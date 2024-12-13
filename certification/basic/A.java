package certification.basic;

// what will the outcome of the following code be?

public class A {
	
	int add(int i , int j) {
		return i + j;
	}
}
	 class B extends A{
		public static void main(String argv[]) {
			short s = 9;
			
			// a compilation error will occur when trying to access a non-static method in a static way
			// System.out.println( add(s,6) );
			
			/* 
			 * An instance of A or B must be instantiated to utilize the instance method of the class
			 * 
			 * B b = new B();
			 * System.out.println(b.add(s, 6));
			*/
		}
	}

