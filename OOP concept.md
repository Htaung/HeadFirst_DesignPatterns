

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

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTI0NDA2Mzk1MCwtMTI0MDkzNzQ3NiwxMz
U4NjcxNTYzLDM1NjMyODM5OSwtMTExNjI2MzI2OF19
-->