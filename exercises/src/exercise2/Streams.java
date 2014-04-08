package exercise2;

import java.util.List;

import domain.Person;

public class Streams {

	public static void incrementAge(List<Person> person) {
		throw new RuntimeException("Implement me using streams");
	}

	public static List<String> collectNames(List<Person> person) {
		throw new RuntimeException("Implement me using method references");
	}

	public static List<Person> olderThan(List<Person> person, int limit) {
		throw new RuntimeException("Implement me using a filter predicate");
	}

	public static int overallAge(List<Person> persons) {
		throw new RuntimeException("Implement me using map reduce with lambdas");
	}

}
