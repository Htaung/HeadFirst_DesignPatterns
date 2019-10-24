<h1> Head First Design Patterns </h1>
Base on GOLF
<pre>
<h1> Design Principles </h1>

<h2>1.Identify the aspects of your application that vary and 
	separate them from what stays the same. </h2>

<P>
Separating what changes from what stays the same
</P>


<h2>2. Program to an interface, not an implementation </h2>
<h3> Encapsulation နဲ. ပတ္သတ္တဲ့ OO Principle တခုရိွပါတယ္ အဲ့ဒါကေတာ့ Program to interface, not to implementation ပါ။</h3>
<p>
	 Program ေရးတဲ့အခါမွာ module ေတြ class ေတြဟာ သူမ်ားရဲ. implementation detail 
	 ကိုမသိသင့္ မထိသင့္သလိုု. ကုိ.ဟာကုိလဲ expose မလုပ္သင့္ပါဘူး။ အၿပင္ကသံုးမဲ့ ကုိနဲ.တကယ္ interact ေပးလုပ္မဲ့ေကာင္ေတြကုိပဲ 
	 public interface အေနနဲ.ထားေပးရမယ္ဆုိလုိတာပါ။ ဒါမွ maintenance ေကာင္းမွာပါ
</p>
<h3>Encapsulation နဲ.ပတ္သတ္တဲ့ တၿခား OO principle တခုကေတာ့ Open Close Principle ပါပဲ။ </h3>
<p>
	A module should be open for extension but closed for modification.
Module ေတြ classes ေတြဟာ သူတုိ.ကုိ accidentally modified မလုပ္ႏိုင္ေအာင္ထားသင့္ၿပီးေတာ့ extend လုပ္ႏိုင္ေအာင္ေတာ့ ထားေပးရမယ္ဆိုတာပါ။ 
Encapsulation ရဲ. central theme ကိုက close for modification ပါပဲ။
</p>
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
means the class declaring them doesn’t have to know about the actual object types!”

</p>
<code>
public class MallardDuck extends Duck{

	//2. Program to an interface, not an implementation
	//	 Should not program to an implementation, but 
	//	 making new instance of concrete Quack Implementation
	public MallardDuck() {
		super();
		this.quackBehaviour = new Quack(); // new instance of concrete Quack Implementation
		this.flyBehaviour = new FlyWithWings();
	}

</pre>
