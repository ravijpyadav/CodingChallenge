import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnswerPercentage {

	public static void main(String[] args) {

		String[] T = { "test1a", "test2", "test1b", "test1c", "test3" };
		String[] R = { "Wrong answer", "OK", "OK", "Time limit exceeded", "OK" };
		System.out.println(new AnswerPercentage().solution(T, R));
	}

	public int solution(String[] T, String[] R) {

		Map<String, Boolean> testWithResult = new HashMap<>();
		for (int i = 0; i < T.length; i++) {
			String[] names = T[i].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

			String group = names[0] + names[1];
			String result = R[i];

			boolean pass = "OK".equals(result);

			if (!testWithResult.containsKey(group)) {
				testWithResult.put(group, pass);
			} else {
				if (testWithResult.get(group) && !pass) {
					testWithResult.put(group, false);
				}
			}
		}

		int passCount = 0;
		for (Entry<String, Boolean> entry : testWithResult.entrySet()) {

			if (entry.getValue()) {
				passCount++;
			}
		}

		return passCount * 100 / testWithResult.size();
	}

}
