package lesson9.exercise_5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	// Use IntSummaryStatistics to output the top test score,
	// the lowest test score, and the average of all test scores
	public static void main(String[] args) {
		List<ExamData> data = new ArrayList<ExamData>() {
			{
				add(new ExamData("George", 91.3));
				add(new ExamData("Tom", 88.9));
				add(new ExamData("Rick", 80));
				add(new ExamData("Harold", 90.8));
				add(new ExamData("Ignatius", 60.9));
				add(new ExamData("Anna", 77));
				add(new ExamData("Susan", 87.3));
				add(new ExamData("Phil", 99.1));
				add(new ExamData("Alex", 84));
			}
		};

		// DoubleSummaryStatistics x = data.stream().collect((Collectors.toList())
		DoubleSummaryStatistics summary = data.stream()
				.collect(Collectors.summarizingDouble((ExamData d) -> d.getTestScore()));
		System.out.println("Top score: " + summary.getMax());
		System.out.println("Lowest score: " + summary.getMin());
		System.out.println("Average score: " + summary.getAverage());
	}

}