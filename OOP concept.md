

## Ref : https://www.facebook.com/notes/thet-khine/gentle-introduction-to-object-oriented-programming-part-1/10204990180393758/?fref=gs&dti=1500239026937924&hc_location=group


<h2>Gentle Introduction to Object Oriented Programming Part 1</h2>
<p>
Language တခုကိုေလ့လာတဲ့အခါမွာ element ၃ ခုကိုေလ့လာရပါတယ္။ Syntax, Semantic နဲ. Pragmatic တို.ၿဖစ္ပါတယ္။
<pre>
 <code>
Syntax => language basic component ေတြကို ဘယ္လုိေရးရတာလဲဆုိတဲ့ Grammar ပါ။ ဥပမာ for loop ပတ္ရင္ဘယ္လိုေရးရသလဲေပါ့။
Semantic => for loop ေရးထားရင္ for loop ကဘယ္လုိအလုပ္လုပ္မလဲဆုိတဲ့ တိက်တဲ့အဓိပၸာယ္ကို ဆုိခ်င္တာပါ။ ဥပမာ for initialization ရိွရင္ 
					run မယ္။ေနာက္ for conditional ရိွရင္စစ္မယ္ result က true ဆုိရင္ for body ကို execute မယ္။ ၿပီးရင္ 
					for increment ရိွခဲ့ရင္ သူ.ကို run မယ္ ေနာက္ loop အစကိုၿပန္တက္မယ္ condition ၿပန္စစ္မယ္ ေပါ့။
Pragmatic => language တခုရဲ. construct ေတြကို လက္ေတြ.က်က်ဘယ္လိုသံုးရမလဲဆုိတာပါ။ Programming language တခုကေပးထားတဲ့ 
					 feature ေတြ language construct ေတြကို သင့္ေတာ္မွန္ကန္စြာ အသံုးခ်ႏုိင္မွု.ပါ။ ဘာကိုဆုိခ်င္သလဲဆုိေတာ့ OO paradigm ကို 
					 support ေပးတဲ့ language မွာ OO program ေတြကို ဘယ္လိုေရးရသလဲ ။ ဥပမာ ဘယ္အခ်ိန္မွာ inheritance ကုိသံုးလဲ ရုိးရုိး class 
					 ကုိသံုးရမွာလား abstract class ကုိသံုးရမွာလား abstract class နဲ. interface usage ဘယ္လိုကြာလဲ ဘယ္ေနရာဘယ္သူ.ကိုသံုးရမွာ 
					 correct usage က ဘာေတြလဲ ဒါေတြကို ဆုိခ်င္တာပါ။ Pragmatic ကုိအဆင့္ထပ္ၿမွင့္ရင္ေတာ့ design pattern ေတြ ,principle ေတြ ပါ ပါလာမွာပါ။ 
</pre>

<h2>Evolution to OOP</h2>
<pre>
Assembly -> data structure နဲ. algorithm ေတြေရးလုိ.အဆင္ေၿပေအာင္ ထုတ္ထားတဲ့ Procedural Language(Fortan, Algo, C)
Procedural language -> fuction ေတြခြဲေရးမယ္, reusable ၿဖစ္ေအာင္လုပ္မယ္ -> ေနာက္က်ေတာ့ data abstraction ကိုထဲ့လာပါတယ္
</pre>

<h2>Data Abstraction</h2>
<p>
custom data type ေတြ create လုပ္ခြင့္ေပးထားတာကိုေၿပာတာပါ။ ဥပမာ Stack, LinkedList ဆုိတာမ်ိဳးကို data type တခုအေနနဲ.ကုိယ္ပုိင္ ဖန္တီးလို.ရမယ္။ ၿပန္သံုးလုိ.ရမယ္ ဒါကို data abstraction လို.ေၿပာလုိ.ရပါတယ္။
<pre>
	C => struct, enum, class
</pre>
Primitive type ေတြကေန custom data type ဖန္တီးလို.ရမယ္ အဲ့ data type ကို maniuplate လုပ္ဖုိ. function ေတြ create လုပ္လုိ.ရမယ္ဆုိရင္ အဲ့ဒီ language ကို data abstraction ေပးတယ္လို.ေၿပာရမွာပါ။
</p>
<h2>Inheritance</h2>
existing class တခုကေန code reuse or
base class ရဲ. source code ကိုမထိပဲ ၿပင္လို.ရႏုိင္ပါတယ္ (extend လုပ္ၿပီးေပါ့)

Inheritance ရဲ. major usage က ၂ခု =>

 - Inheirtance as conceptual modelling   
 - Inheritance as incremental  program modification

(classification ဥပမာ လူဆုိတာ သတၱ၀ါ တိရစၦာန္ကလဲ သတၱ၀ါ) ၊ generalization (ဥပမာ car engine ကလဲစက္ motor engine ဆိုတာလဲ စက္)၊ grouping,composition အစရိွတာေတြနဲ.ေတြးေခၚၾကပါတယ္။ ခုနကေၿပာတဲ့ classification၊ generalization၊ specialization အစရွိတာေတြကုိ OO paradigm မွာ easiliy model လုပ္လုိ.ရပါတယ္။ classification ကို class contruct နဲ.လုပ္ၾကပါတယ္

 - Classification ကို => class contruct နဲ.လုပ္ၾကပါတယ္
 - Generalization နဲ. Specialization ကိုေတာ့ =>  inheritance နဲ. model
   လုပ္ၾကပါတယ္။
 - Grouping နဲ. composition ကုိေတာ့ => class ေတြမွာ တၿခား classes ေတြရဲ.   reference variable ေတြထဲ့သြင္းၿခင္းအားၿဖင့္ သံုးၾကပါတယ္။

## Inheritance as conceptual modelling
I

 - Inheritance ကို Generalization, Specialization အတြက္သံုးၿပီဆုိရင္ ဒါဟာ
   inheritance as coneptual modelling ပါ။
 - Base class or parent class ကို generalized classes လို.ေခၚၿပီးေတာ့   child class ကိုေတာ့ specialized class လို.ေခၚပါတယ္။
 - Conceptual modelling လုပ္မယ္ဆုိရင္ base class နဲ. drived class (child class) ဟာ taxonomy အရတူရမွာပါ
 - ဥပမာ Teacher, Doctor နဲ. Human ဆုိတာဟာ taxonomy အရတူပါတယ္။ Hierarchical relationship ရွိတာကိုေၿပာခ်င္တာပါ။ Teacher, Doctor သည္ is a kind of Human ပါပဲ။
 - Taxonomy အရ မတူဘူးဆုိရင္ Generalization Specialization မလုပ္သင့္ပါဘူ;
 -  ဥပမာ Bird နဲ. Aeroplane သည္ ပ်ံတာခ်င္းတူေပမဲ့ သူတုိ.ကို Inheritance နဲ.ခ်ိတ္လို.မရပါဘူ;
<code>
Inheritance လို conceptualization လုပ္ေပးႏုိင္တဲ့ေနာက္တခုက ေတာ့ Subtyping ပါ။Subtyping ဆိုတာ programming lanaugag ကေနေပးထားတဲ့ feature ေတြကုိသံုးၿပီး type တခု သည္ အၿခား type တခုရဲ. subtype ၿဖစ္ပါတယ္ဆုိၿပီးသံုးတာပါ။ Base type ေနရာမွာ based type ကုိအေၿခခံထားတဲ့ တၿခား type ကုိအစားထိုးၿပီးသံုးလို.ရပါတယ္။ Subtyping ကို type polymorphism လို.လဲသံုးၾကပါေသးတယ္။

 Java, C# တို.မွာဆုိရင္ interface construct ကိုထဲ့ေပးထားပါတယ္။ သူ.ကုိထဲ့ေပးထားရတဲ့အေၾကာင္းရင္းက conceptual modelling အရ taxonomy မတူတဲ့ေကာင္ေတြကုိ polymorphic လုပ္ခ်င္ရင္သံုးဖုိ.ပါ။
</code>

<h4>
Java programmer ေတာ္ေတာ္မ်ားမ်ား က abstract class နဲ. interface ဘာကြာလဲေမးလိုက္ရင္ ေရေရရာရာကဲြၿပားတဲ့အေၿဖကို မေၿဖႏိုင္ၾကပါဘူး။ 
</h4>

<p>
 - အဓိက ကြာၿခားခ်က္က taxonomy တူမယ္ဆုိရင္ abstract class ကိုသံုးၿပီး
   inheritance နဲ.ေၿဖရွင္းမယ္
 - မတူဘူးဆုိရင္ subtyping ကုိ သံုးၿပီၤး interface နဲ. design လုပ္ရမွာပါ။
 
 - ဥပမာ work ဆုိတဲ့ method ကို polymorphic ၿဖစ္ေအာင္လုပ္ခ်င္တယ္ဆုိပါစုိ.
   Teacher မွာေရာ Doctor မွာေရာ လုပ္ခ်င္တာဆုိရင္ သူတုိ. ၂ခုဟာ taxonomy
   အရတူတဲ့အတြက္ abstract class ဒါမွမဟုတ္ ရိုးရိုး class သံုးၿပီး
   inheritance နဲ. model လုပ္ရမွာပါ။
 - Fly ဆုိတဲ့ method ကို Bird နဲ. Aeroplane အတြက္ polymorphism
   လုပ္ခ်င္တယ္ဆုိရင္ သူတုိ. ၂ ခုဟာ taxonomy မတူတဲ့အတြက္ Flyable ဆိုတဲ့
   interface တခုထားၿပီး model လုပ္ရမွာပါ။ Static type language ေတြမွာ
   polymorphic operation ေတြလုပ္ဖုို. subtype ေတြၿဖစ္မွ လုပ္လို.ရပါတယ္
   
Dynamic language ေတြမွာ duck typing ကိုေပးထားတဲ့အတြက္ အဲ့လိုေခၚလို.ရပါတယ္။
</p>

## Normal class နဲ. abstract class ဘယ္လို usage ခြဲမလဲေပါ့ ။

 - Parent ကေနပဲ child က code ေတြကို one direction ေခၚခ်င္ရင္ hook   အေနနဲ.ထားခ်င္ရင္ abstract class ကုိသံုးပါတယ္
 - မဟုတ္ရင္ both direction ေခၚခ်င္ရင္ေတာ့ normal class ကိုသံုးၿပီး model   လုပ္လုိ.ရပါတယ္။

### Inheritance as incremental program modification
base class ရဲ. source code ကုိမၿပင္ပဲနဲ. သူ.ကို implementation အရ ၿပင္ခ်င္တဲ့အခါမွာ extend လုပ္ၿပီးသံုးတာမ်ိဳးပါ။

## Favour inhertiance over composition

 1. code reuse လုပ္ခ်င္ယံုသက္သက္နဲ. inheritance ကုိသံုးၾကပါတယ္ ။
    taxonomy အရ မတူရင္ေသာ္လည္းေကာငး္ modifcation or added functionality
    မထဲ့ႏိုင္ရင္ေသာ္လည္းေကာင္း အဲ့လိုသံုးတာမွားပါတယ္။
 2. Code reuse လုပ္ခ်င္ရင္ composition ကုိသံုးပါ။
 
>  ဘာလုိ.လဲဆုိေတာ့ inheritance hierarchicy မ်ားလာတာနဲ.အမွ် classes ေတြဟာ
> dependency မ်ားလာပါတယ္။ Base class တခုကို ေၿပာင္းလုိက္တာနဲ. ေအာက္က
> child classes ေတြမွာပါ effect ၿဖစ္ႏိုင္ပါတယ္။ Composition ဆုိတာက
> ကိုသံုးလို.တဲ့ class ကုိ reference variable သံုးၿပီး ယူသံုးတာပါပဲ။

### Classical Inheritance Versus Prototype Inheritance
 - Child object တုိင္းမွာ base class ကရတဲ့ baseData နဲ. child class ရဲ.
   childData ဆုိၿပီး property 2 ခုရမွာပါ။
 - Child object တခုေဆာက္တုိင္း သီးၿခား baseData တခုစီရေနမွာပါ။
 - Parent က property ေတြကုိ child object အတြက္ seperate copy ေပးထားတဲ့သေဘာပါ။ **Inheritance with copy semantic** လို.ေၿပာလို.ရပါတယ္။

## Classical Inheritance

    class Base  
    {  
    int baseData;  
    }
    
    class Child extends Base  
    {  
    int childData;  
    }

### Prototypical Inheritance

JavaScript မွာေပးထားတဲ့ inheritance model က prorotypical inheritance ပါ။

    function Base()  
    {  
    this.baseData = [];  
    }  
    function Child()  
    {  
    this.childData = "childdata";  
    }  
    Child.prototype = new Base();//set up inheritance  
    var c1 = new Child();  
    var c2 = new Child();  
    c1.baseData.push(100);  
    console.log(c2.baseData);

 - child ရဲ. parent သည္ new Base() (Base object) child object c1 နဲ. c2
   ဟာ parent object တခုတည္းကို share လုပ္သံုးရပါတယ္။
 - ဒါေပမဲ့ c1 ေရာ c2 ေရာက same parent object တခုတည္းကုိ share
   သံုးရတဲ့အတြက္ c2.baseData ဆိုရင္လဲ [100] လို.ထြက္ပါတယ္။
 - Prototypical inheritance သည္ share semantic ၿဖစ္ပါတယ္။ Parent object
   ထဲကုိ attribute ေတြ ထပ္ထဲ့တာ ႏွုတ္တာ အားလံုးသည္ child အားလံုးမွာ
   effect ၿဖစ္ပါတယ္

### Dynamic Inheritance

Prototypical inheritance ေပးတဲ့ language ေတြမွာ parent object ကုိ dynamically ေၿပာင္းလို.ရပါတယ္။ ဒါကုိ dynamic inheritance လို.ေခၚပါတယ္။ state အေၿပာင္းအလဲေပၚမူတည္ၿပီး လုပ္ရတဲ့ code ေတြမွာဆုိ Dynamic Inheritance ဟာ အသံုး၀င္ပါတယ္။

<h1> Ref https://www.vneuron.com/2018/02/21/interface-oriented-programming </h1>

## Declaring an interface is like saying: 

    I want something that does `X`, `Y`and `Z`, I don’t care how.

## Class refers to a more concrete behavior:

     I want something that does `X` in this particular way.

## An interface is **abstract**, a class is **concrete**.

## A class **implements** an interface, meaning it give the prototype a body and shape so it can actually be used.

 - Generally speaking, writing to interfaces allows the code to be
   generic, reusable across various implementations.
 
 - Writing to classes kills these features as the code will be bound
          to this particular implementation.
          
### Polymorphism
Greek ဘာသာစကား Poly (မ်ားစြာေသာ) Morph( ပံုသ႑ာန္ေၿပာင္းၿခင္း)
> same method with different implementation
> Polymorphism is the ability to present the same interface for
> differing underlying forms (data types).
> တူညီတဲ့ interface (public method or method) ေပၚမွာ contextual object 
> သုိ.မဟုတ္ data type အေပၚမူတည္ၿပီး ေၿပာင္းလဲႏုိင္မွု.ကိုေၿပာတာပါ

    Human > work
    Teacher extends Human > work
    Doctor extends Human > work
    Human h = new Teacher();  
    h.work();
    h = new Doctor();  
    h.work();
    
 - h.work() သည္ Teacher object ရဲ. work ကုိလွမ္းေခၚမွာၿဖစ္ပါတယ္။ 
 - ဘာလုိ.လဲဆုိေတာ့ java method ေတြက static မေၾကၿငာထားရင္ `auto virtual` ၿဖစ္လို.ပါ။ Human ရဲ. work ကိုေခၚမဲ့အစား h ထဲမွာတကယ္ရိွတဲ့ object Teacher ကုိေခၚပါလိမ့္မယ္။ဒါဟာ polymorphism ပါပဲ။
 - (execute လုပ္မွာသည္ Teacher ရဲ. work လား Doctor work လား)ကုိေတာ့ h ထဲမွာ ေရာက္ေနတဲ့ object ေပၚမူတည္ၿပီး ဆံုးၿဖတ္မွာပါ။ ဒါေၾကာင့္ Polymorphism သည္ same method with different implementation လုိ.လဲဆုိၾကပါတယ္

 - static language (Java,C#,C++)မွာ polymorphism သည္ virtual method
   မွာပဲအလုပ္လုပ္ပါတယ္။ Java မွာေတာဘာမွမေရးရေပမဲ့ C++ မွာ virtual
   လို.ေရးရၿပီး pointer နဲ.သံုးရပါတယ္။

 - C# မွာေတာ့ parent class method မွာ virtual လို.ေရးရၿပီး child class
   method မွာေတာ့ override ဆုိတဲ့ keyword ကိုထဲ့ေပးရပါတယ္။

## ဘာေၾကာင့္ polymorphism ကုိသံုးရတာလဲ

 - ဥပမာ object က Teacher ဆို teacher work ကိုေခၚပါဆုိၿပီး
   လိုက္ေရးစရာမလိုပါဘူး Extensibility ေကာင္းတယ္ လို.ေၿပာရမွာပါ။
 - Programmer က MySQL ကေန Oracle ကိုေၿပာင္းမယ္ဆုိရင္ hibernate
   မွာလြယ္ပါတယ္ connection string ေၿပာင္းယံုပါပဲ
 - ဘယ္ DB ကုိ connect လုပ္မယ္ဆိုတာ ေျပာစရာ မလိုပဲ connect လို့
   သုံးရင္ရျပီ
 - Java , C# တို.မွာလဲ ဒီလိုသေဘာတရားသံုးၿပီး JDBC , ADO.NET API
   ေတြကိုေဆာက္ထားတာပါ။
 - ခုကြ်န္ေတာ္ေၿပာသြားတဲ့ Polymorhpism အမ်ိဳးအစားကုိ dynamic
   polymorphism လို.ေခၚပါတယ္။ ဘာလို.လဲဆုိေတာ့ ဘယ္ method ရဲ. code
   (implementation ) run မယ္ဆုိတာကို run time (dynamic ) ေရာက္မွ
   ဆံုးၿဖတ္လို.ပါပဲ။

### Subtyping vs Duck Typing

 - Static language(C++,Java,C#) ေတြမွာ dynamic polymorphism ကိုပံုေဖာ္ခ်င္ရင္
   အနည္းဆံုး subtyping ၿဖစ္ေအာင္လုပ္ရပါတယ္
 - Inheritance နဲ. interface inheritance(Java မွာေတာ့ interface ကုိ
   implements လို.သံုးတာပါ) နည္းနဲ. subtyping ကုိလုပ္လုိ.ရပါတယ္။
ဥပမာ static language ေတြမွာ object တခုမွာ work ဆုိတာရိွလဲ subtyping (type အရ assignable )ၿဖစ္မွသာေခၚလုိ.ရမွာပါ။

  

 - Dynamic language ေတြမွာေတာ့ type ေတြ သည္ dynanmic (variable တခုရဲ.
   type သည္ ပံုေသမဟုတ္ run time မွာ ေၿပာင္းလဲႏုိင္သည္) ၿဖစ္တဲ့အတြက္
   subyting မလိုပါဘူး   ဒါကို က်ေတာ့ duck typing လို.ေခၚပါတယ္
 - Dynamic language မွာေတာ့ method ရိွတာနဲ.တင္ေခၚလုိ.ရပါၿပီ။ ေခၚတဲ့
   object သည္ ဘာ type ၿဖစ္ရမယ္ ဆုိတဲ့ ကန္.သတ္ခ်က္မရိွပါဘူး

### Static Polymorphism

 - method overloading ကုိေၿပာခ်င္တာပါ
 - method ေတြကို နာမည္တူရမယ္ ၊ return type (sub type ဆိုလဲရ) တူရမယ္
   ဒါေပမဲ့ protocol မတူပဲ ေရးရင္
 - Method protocol ဆုိတာ ဒီေနရာမွာ method တခုရဲ. parameter အေရအတြက္ ၊
   parameter type ၊ parameter order အားလံုးကိုေၿပာတာပါ။

## static polymorphism လို.ေခၚရၿခင္းကေတာ့ method overloading မွာ ဘယ္ metod ကုိေခၚမယ္ဆုိတာကို compile time မွာ ဆံုးၿဖတ္လို.ပါ

 

## Dynamic language ေတြၿဖစ္တဲ့ Ruby, Python, JavaScript နဲ. PHP တုိ.မွာ method overloadig မရိွပါဘူး။



### Parametric Polymorphism

 - C++ မွာဆုိ template, Java, C# မွာဆုိရင္ generic လို.ေခၚပါတယ္
 - Parametric polymorphism သည္ dynamic language ေတြမွာမရိွပါဘူး။ Static
   language ေတြမွာပဲရိွတာပါ။
 - ဥပမာ Stack တို. LinkList တုိ.ဆုိတာ ဘံုသံုးပါ integer ေတြထဲ့မဲ့ stack
   ရိွႏို္င္သလို string ေတြထဲ့မဲ့ stack လဲရိွႏဳိင္ပါတယ္။
 - Integer အတြက္ stack တခု string အတြက္ stack တခုေရးမယ္ဆုိရင္ code
   ေတြေဖာင္းပြကုန္ပါတယ္။ ဒါေၾကာင့္ template, generic code ေတြေရးၿပီး
   တကယ္သံုးေတာ့မွ data type ကုိ parameter အေနနဲ.ပို.လိုက္တာပါ။
 - အဲ့ေတာ့ compiler, runtime system ကေနၿပီး ဆုိင္ရာ stack (integer
   ေပးလုိက္ရင္ integer stack ေပါ့ဗ်ာ) ထုတ္ေပးပါတယ္။
 - အဲ့ေတာ့ code သည္ reusable ၿဖစ္တယ္။ type safe ၿဖစ္တယ္ေပါ့ဗ်ာ။

## Object Oriented Design Pattern Series Part-4 Builder Pattern

 - Builder pattern ကေတာ့ Creational pattern ေတြထဲကတခုပါပဲ။
 - သူ.ကို ဘယ္ေနရာမွာသံုးလဲဆိုေတာ့ Complex Object ေတြေဆာက္ဖုိ. Object
   creation အတြက္လုိအပ္တဲ့ parameter ေတြမ်ားေနမယ္ဆုိရင္ Builder pattern
   ကုိသံုးပါတယ္။
 - ဥပမာ ကြ်န္ေတာ္တုိ.ေဆာက္မဲ့ Object သည္ paramter ၅ ခု ၆
   ခုေလာက္လိုမယ္ဆုိပါေတာ့ ။ ဒါေပမဲ့တခ်ိန္တည္းမွာလဲ parameter
   အားလံုးသံုးခ်င္မွလဲသံုးမယ္ မသံုးပဲ ၃
   ခုေလာက္ေပးၿပီးေတာ့ပဲေဆာက္ခ်င္လဲေဆာက္မယ္။
 - ဒါဆုိရင္ Constructor နဲ.ေရးဖုိ.ကေတာ္ေတာ္ခက္သြားပါၿပီ။

## သူ.ရဲ.ရည္ရြယ္ခ်က္က Complex Object ေတြကိုတည္ေဆာက္တဲ့အခါမွာ Object က parameter အမ်ားၾကီးကို object creation stage မွာလက္ခံတယ္။

 - parameter အားလံုးကိုလဲ သံုးခ်င္မွသံုးမယ္။
 - အဓိက ကေတာ့ complex set of parameter in object creation ပါပဲ။
 - Object creation မွာ parameter ေတြမ်ားလာရင္ builder pattern နဲ. solve
   လုပ္ရပါလိမ့္မယ္။


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTM4MzY3MjUzLDIxNDU0NTM4NTgsNjIyOT
EyNzgsLTE0NDk0ODAzOCwyOTIyMjEyNDMsMTk0MzQ1NDU5Miwx
NzcyNzkyOTIsNjIwNjEzMTU1LDE2NjM4MjcxNDcsLTQ1Mzc4ND
MwNiwtNDcxODYxNTM2LC0xNzkxNjc2NTM4LC0xOTM1MzM3OTg4
LDM1MjQ2OTM4NCwxMjIwNzgzMjg4LDM2NjkxMTAwMywxMzk5OT
UyMzgsNDUyNjE3MTY4LDgzNjAyODE0MSwtMTc3NDI2NDM0MV19

-->