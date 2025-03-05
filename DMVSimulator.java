public class DMVSimulator {
	public static void main (String[] args) {
		System.out.println("Welcome to the DMV!");
		
		int number = (int) (Math.random() * 100) + 1;
        System.out.println("Your number is: " + number + ". Please wait until your number is called.");

		
		for (int i = number + 1; i <= 100; i++ ) {
			System.out.println("Now Serving: " + i);
		}
		for (int i = 1; i < number; i++) {
            System.out.println("Now serving: " + i);
        }
		

		System.out.println();
        System.out.println("Ha, what a loser. This blistering baffoon lacks the required credentials. Get out of my sight you worthless rat.");

	}
}
