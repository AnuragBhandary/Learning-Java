class Dog {

	String name;

	public static void main(String[] args) {
		// make a new Dog object and access it
		Dog dog1 = new Dog();
		dog1.name = "Bolt";
		dog1.bark();

		// now make a Dog array
		Dog[] myDogs = new Dog[3];
		// put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1; // no need to declare since dog1 is already declared.

		// now access the dogs using the array
		// references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.println("The last dog's name is " + myDogs[2].name);

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x+1;
		}
	}

	public void bark() {
		System.out.println(name + " says Ruff!");
	}

	public void eat() {
		System.out.println(name + " is eating.");
	}

	public void chaseCat() {
		System.out.println(name + " is chasing the cat!");
	}

}
