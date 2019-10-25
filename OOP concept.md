

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
 - > same method with different implementation
   > Polymorphism is the ability to present the same interface for
   > differing underlying forms (data types).
   > တူညီတဲ့ interface (public method or method) ေပၚမွာ contextual object သုိ.မဟုတ္ data type အေပၚမူတည္ၿပီး
   ေၿပာင္းလဲႏုိင္မွု.ကိုေၿပာတာပါ

    Human > work
    Teacher extends Human > work
    Doctor extends Human > work
    Human h = new Teacher();  
    h.work();
    h = new Doctor();  
    h.work();


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTEyOTU1NTQxNDgsLTQ1Mzc4NDMwNiwtND
cxODYxNTM2LC0xNzkxNjc2NTM4LC0xOTM1MzM3OTg4LDM1MjQ2
OTM4NCwxMjIwNzgzMjg4LDM2NjkxMTAwMywxMzk5OTUyMzgsND
UyNjE3MTY4LDgzNjAyODE0MSwtMTc3NDI2NDM0MSwtMTI0MDkz
NzQ3NiwxMzU4NjcxNTYzLDM1NjMyODM5OSwtMTExNjI2MzI2OF
19
-->