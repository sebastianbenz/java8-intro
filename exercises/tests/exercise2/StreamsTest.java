package exercise2;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import domain.Person;

public class StreamsTest {

	Person tom = new Person("Tom", 4);
	Person jerry = new Person("Jerry", 2);
	Person duffy = new Person("Duffy", 1);
	
	@Test
	public void forEach() {
		List<Person> persons = asList(tom, jerry, duffy);
		Streams.incrementAge(persons);
		List<Integer> result = persons.stream().map(Person::getAge).collect(Collectors.toList());
		assertThat(result, is(asList(5, 3, 2)));
	}

}
