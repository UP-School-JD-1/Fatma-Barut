package ch13q1;

public class Reader {

	String name;
    int age;
    char sex;
    

    public Reader(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Reader is created.");
    }
    
    public Reader() {
		// TODO Auto-generated constructor stub
	}

	void read(Book book) {
        if (book.currentPage == 0) 
        	System.out.println(name + "started to read the book of" + book.title);
        else if (book.currentPage == book.page)
            System.out.println(name + "read the entire book of" + book.title);
        else
            System.out.println(name + "continues to read the book of" + book.title);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
    

}
