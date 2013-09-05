class Warmup {
	public static void main(String[] args) {

		System.out.println(sum(5));
		System.out.println(fact(5));
		System.out.println(xToTheN(2,5));

	}

	public static int sum (int n){

		int sum = 0;

		for (int i = n; i > 0 ; i--) {
			sum = sum + i;
			
		}

		return sum;

	}

	public static int fact (int n){
		int sum = 1;
		for (int i = n; i > 0; i-- ) {
			sum = sum * i;
			
		}

		return sum;
	}

	public static int xToTheN(int x, int n){
		int sum = 1;
		for (int i = n; i > 0; i--) {

			sum = sum * x;
		}
		return sum;
	}
	
	
}