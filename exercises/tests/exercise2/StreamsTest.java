package exercise2;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import domain.Person;

public class StreamsTest {

	Person tom = new Person("Tom", 4);
	Person jerry = new Person("Jerry", 2);
	Person duffy = new Person("Duffy", 1);
		List<Person> persons = asList(tom, jerry, duffy);
	
	@Test
	public void forEach() {
		Streams.incrementAge(persons);
		List<Integer> result = persons.stream().map(Person::getAge).collect(Collectors.toList());
		assertThat(result, is(asList(5, 3, 2)));
	}

	
	@Test
	public void methodReferences() throws Exception {
		List<String> result = Streams.collectNames(persons);
		assertThat(result, is(asList(tom.getName(), jerry.getName(), duffy.getName())));
	}
	
	@Test
	public void calculateOverallAge() throws Exception {
		int result = Streams.overallAge(persons);
		assertThat(result, is(tom.getAge() + jerry.getAge() + duffy.getAge()));
	}

    @Test
	public void olderThan() throws Exception {
		List<Person> result = Streams.olderThan(persons, 1);
		assertThat(result, is(asList(tom, jerry)));
	}

}
