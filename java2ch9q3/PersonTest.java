package java2ch9q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PersonTest {
	public static void main(String[] args) {
		
		List<String> p1Address = new ArrayList<>(List.of("Ankara", "two", "three"));
		List<String> p2Address = new ArrayList<>(List.of("İzmir", "two", "three"));
		List<String> p3Address = new ArrayList<>(List.of("Antalya", "two", "three"));
		List<Integer> p1Phones = new ArrayList<>(List.of(987654));
		List<Integer> p2Phones = new ArrayList<>(List.of(987653));
		List<Integer> p3Phones = new ArrayList<>(List.of(987652));

		Person person1 = new Person("Fatma", "Barut", p1Address, p1Phones);
		Person person2 = new Person("Yeliz", "Acar", p2Address, p2Phones);
		Person person3 = new Person("Murat", "Yilmaz", p3Address, p3Phones);

		List<Person> personList = new ArrayList<>(List.of(person1, person2, person3));
		
		System.out.println("Person List");
		System.out.println(personList);
		System.out.println();
		System.out.println("Surname Sort");
		System.out.println();
		Comparator<Person> personLastName = (b1, b2) -> b1.getSurname().compareTo(b2.getSurname());
		Collections.sort(personList, personLastName);
		for (Person b : personList)
			System.out.println(b.getSurname());

		System.out.println();
		
		System.out.println("Key - Value ");
		System.out.println();
		Map<String, Person> map = new HashMap<>();
		map.put(person1.getName(), person1);
		map.put(person2.getName(), person2);
		map.put(person3.getName(), person3);

		map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

	}

}
