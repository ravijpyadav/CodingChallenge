import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	private Stack<Character> stack = new Stack<>();
	private LinkedList<Character> queue = new LinkedList<>();
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		boolean isPalindrome = true;
		for (int i = 0; i < (A.length() / 2 + 1); i++) {
			if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
				System.out.println("No");
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Yes");
		}
	}

	public void pushCharacter(char ch) {
		stack.push(ch);
	}

	public void enqueueCharacter(char ch) {
		queue.offer(ch);
	}

	public char popCharacter() {
		return stack.pop();
	}

	public char dequeueCharacter() {
		return queue.poll();
	}
}