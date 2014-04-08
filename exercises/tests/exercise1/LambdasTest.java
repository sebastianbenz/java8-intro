package exercise1;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import domain.Person;

public class LambdasTest {

	Person tom = new Person("Tom", 4);
	Person jerry = new Person("Jerry", 2);
	Person duffy = new Person("Duffy", 1);
		List<Person> persons = asList(tom, jerry, duffy);

	@Test
	public void sorting() {
		Lambdas.sort(persons);
		assertEquals(persons, asList(duffy, jerry, tom));
	}

	@Test
	public void forEach() {
		Lambdas.incrementAge(persons);
		List<Integer> result = persons.stream().map(Person::getAge).collect(Collectors.toList());
		assertThat(result, is(asList(5, 3, 2)));
	}
	
	@Test
	public void transferToArrayList() throws Exception {
		ArrayList<Person> result = Lambdas.transferPersonsToArrayList(new LinkedList<>(persons));
		assertEquals(result, persons);
	}

	@Test
	public void transferToHashSet() throws Exception {
		HashSet<Person> result = Lambdas.transferPersonsToHashSet(persons);
		assertEquals(result, new HashSet<>(persons));
	}

}
