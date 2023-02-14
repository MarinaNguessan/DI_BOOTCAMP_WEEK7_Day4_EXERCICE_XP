package atos;

public class Exercice4Person {
	
	 private String firstName ;
	    private String lastName;
	    private int age;

	    public Exercice4Person(String firstName, String lastName, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastNameet(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String introduce(){
	        return "Hello my name is " + firstName+ " " + lastName + " and I am " + age + " years old";
	    }

	public static void main(String[] args) {
       
		Exercice4Person person1 = new Exercice4Person("Emmanuelle", "N'GUESSAN", 07);
	       System.out.println(person1.introduce());

	}

}
