## > Ref: https://www.facebook.com/groups/programmingchannel/permalink/1582689172026242/

## Object Oriented Design Pattern Series Part-5 Prototype Design Pattern

Prototype Pattern ကလဲနားလည္ရလြယ္တဲ့ pattern မ်ိုးပါပဲ။ Creational Pattern အမ်ိဳးအစားပါ။ 

##  သူကေတာ့ ရိွၿပီးသား Object တခုကေန ေနာက္ Object တခုေဆာက္တဲ့အခါမွာ new > မသံုးေတာ့ပဲနဲ. နဂုိရိွၿပီးသား Object ကေန property ေတြကို copy ကူးၿပီး > တည္ေဆာက္တာပါ။


Prototype pattern ကို Heavy Object ေတြကိုတည္ေဆာက္တဲ့အခါမွာ Object creation သည္ computation time အရ ဒါမွမဟုတ္ memory အရ အကုန္အက် မ်ားမယ္ costly ၿဖစ္မယ္ဆုိရင္ ေနာက္ထပ္ Object ေတြေဆာက္တဲ့အခါမွာ ခုနက computational time , memory အစရိွတာေတြကိုသက္သာေအာင္ ရိွၿပီးသား Object ေတြရဲ. မူရင္း property ေတြကိုပဲ copy ကူးၿပီး Object အသစ္ေဆာက္လိုက္တာေပါ့။

Prototype ဆုိတဲ့ interface သည္ clone ဆုိတာကို ေပးထားရပါမယ္။ Clone ဆုိတာဒီေနရာမွာ object မေဆာက္ပဲ property ေတြကိုပဲ copy ကူးၿပီး တည္ေဆာက္မယ္ဆုိတဲ့သေဘာပါ။ Java မွာေတာ့ java.lang.Object class မွာ clone method ပါလာပါတယ္။ ခုနကေၿပာတဲ့ property ေတြကို copy ကူးၿပီး object ေဆာက္ေပးပါတယ္။ အဲ့ဒီေတာ့ ခုနက java.lang.Object က clone method ကုိယူသံုးရင္ အဆင္ေၿပပါတယ္။ Code ကုိၾကည့္ရေအာင္။  

    public interface Prototype extends Cloneable{  
    Prototype reproducce();  
    }  

ဒါကေတာ့ Prototype interface ပါ. Java က Cloneable interface သည္ marker interface ပါ။ ဘာmethod မွမပါဘူး ဒါေပမဲ့ clone လုပ္လုိ.ရတယ္ဆုိတာကိုမွတ္ထား ဆုိတဲ့သေဘာနဲ. သံုးတဲ့အတြက္ marker interface လို.သံုးပါတယ္။
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTcxNDU2OTcyMSwxNDg3NTc5NjA1LDM4ND
I3NzM4OF19
-->