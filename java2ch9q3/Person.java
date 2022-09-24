package java2ch9q3;

import java.util.List;
import java.util.Objects;

public final class Person implements Comparable<Object> {
	private final String name;
	private final String surname;
	private List<String> address;
	private List<Integer> phones;

	public Person(String name, String surname, List<String> address, List<Integer> phones) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phones = phones;

	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	public int compareTo(Object o) {
		Person person = (Person) o;
		return surname.compareTo(person.getSurname());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", address=" + address + ", phones=" + phones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, phones, surname);
	}

	
       
	
        
}
