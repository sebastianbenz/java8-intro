package exercise1;

import java.util.Collection;
import java.util.List;

import domain.Person;

public class Lambdas {

	public static void sort(List<Person> persons) {
		throw new RuntimeException(
				"Implement me using Collections.sort(persons, ?)");
	}

	public static void incrementAge(Collection<Person> person) {
		throw new RuntimeException(
				"Define a generic method 'Lambdas#forEach' which applies an operation to all elements in a collection\n\nHint: define a SAM interface");
	}

}