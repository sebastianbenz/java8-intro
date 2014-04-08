package sam;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class LambdasTest {

	Person tom = new Person("Tom", 4);
	Person jerry = new Person("Jerry", 2);
	Person duffy = new Person("Duffy", 1);

	@Test
	public void aSimpleSam() {
		List<Person> persons = asList(tom, jerry);
		Lambdas.sort(persons);
		assertEquals(persons, asList(duffy, jerry, tom));
	}

}
