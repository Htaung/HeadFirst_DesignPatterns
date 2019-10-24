<h1> Head First Design Patterns </h1>
Base on GOLF
<pre>
<h1> Design Principles </h1>

<h2>1. Identify the aspects of your application that vary and separate them 
	from what stays thesame. </h2>
<P>
Separating what changes from what stays the same
</P>

<h2>2. Program to an interface, not an implementation </h2>
<p> 
<code>	“Program to an interface” really means “Program to a supertype. </code>
like using a polymorphic type

Examples => Imagine an abstract class Animal, with two concrete implementations, Dog and Cat
<code>
Programming to an implementation would be:
Dog d = new Dog(); // a concrete implementation of Animal
d.bark();

Programming to an interface/supertype would be:
Animal animal = new Dog();
animal.makeSound();

Assign the concrete implementation object at
runtime:
a = getAnimal();
a.makeSound(); // We don’t know WHAT the actual animal subtype is... all we care about is that it knows
			   // how to respond to makeSound().
</code>

 
program to a supertype” as “the declared type of the variables should be a supertype,
usually an abstract class or interface, so that the objects assigned to those
variables can be of any concrete implementation of the supertype, which
means the class declaring them doesn’t have to know about the actual object
types!”

</p>


</pre>
