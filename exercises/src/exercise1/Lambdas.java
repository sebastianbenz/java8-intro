package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;

import domain.Person;

public class Lambdas {

	public static void sort(List<Person> persons) {
		throw new RuntimeException(
				"Implement me using Collections.sort(persons, ?)");
	}

	public static void incrementAge(Collection<Person> person) {
		throw new RuntimeException(
				"Implement me using forEach(Consumer)");
	}
	
	public static ArrayList<Person> transferPersonsToArrayList(Collection<Person> person){
		throw new RuntimeException(
				"Implement me using a lambda and Lambdas#transferElements");
	}
	
	public static HashSet<Person> transferPersonsToHashSet(Collection<Person> person){
		throw new RuntimeException(
				"Implement me using a lambda and a constructor reference");
	}

	public static <E, C extends Collection<E>> C transferElements(Collection<E> elements, Supplier<C> collectionFactory){
		C result = collectionFactory.get();
		for (E t : elements) {
			result.add(t);
		}
		return result;
	}

}