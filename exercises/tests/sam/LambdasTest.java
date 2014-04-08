package sam;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class LambdasTest {

	Person tom = new Person("Tom", 4);
	Person jerry = new Person("Jerry", 2);
	Person duffy = new Person("Duffy", 1);

	@Test
	public void sorting() {
		List<Person> persons = asList(tom, jerry, duffy);
		Lambdas.sort(persons);
		assertEquals(persons, asList(duffy, jerry, tom));
	}

	@Test
	public void forEach() {
		List<Person> persons = asList(tom, jerry, duffy);
		Lambdas.incrementAge(persons);
		List<Integer> result = persons.stream().map(Person::getAge).collect(Collectors.toList());
		assertThat(result, is(asList(5, 3, 2)));
	}
}
