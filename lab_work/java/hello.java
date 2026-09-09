class HelloWorld
{
	public static void main(String [ ] args){
	    System.out.println("Hello World");

		Student s1 = new Student();
		s1.display();
	} 
}

class Student
{
	public void display(){
		System.out.println("class Student");
    }
}
