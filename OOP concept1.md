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

## reprdouce ကလုပ္မွာသည္ clone လုပ္တဲ့ copy ပြားတဲ့ operation ပါပဲ

    public class HeavyObject implements Prototype{  
    String propertyGetFromDB;  
    String computationalHungryProperty;  
    static String getPropertyFromDB() {  
    return "PropertyFromDb"; //Here assume call to db to simulate costly memory  
    }  
    static String getCompuationalHungryProperty() {  
    return "ComputationHungryProperty";//Here assume call to costly computation time  
    }  
    public HeavyObject() {  
    this.propertyGetFromDB = HeavyObject.getPropertyFromDB();  
    this.computationalHungryProperty = HeavyObject.getCompuationalHungryProperty();  
    }  
    @Override  
    public HeavyObject reproducce() {  
    try {  
    Prototype cop = (Prototype)super.clone();//Here call lang.lang.Object.clone  
    HeavyObject newObject = (HeavyObject)cop;  
    return newObject;  
    } catch (CloneNotSupportedException ex) {  
    ex.printStackTrace();  
    }  
    return null;  
    }  
    @Override  
    public String toString() {  
    return "HeavyObject{" + "propertyGetFromDB=" + propertyGetFromDB + ", computationalHungryProperty=" + computationalHungryProperty + '}';  
    }  
    }
rototype interface သည္ Cloneable ကို extends လုပ္ထားတဲ့အတြက္ Java runtime က clone operation ကုိခြင့္ေပးမွာပါ ။မဟုတ္ရင္ CloneNotSupportedException  
တက္ပါလိမ့္မယ္။ ေအာက္မွာေပးထားတာကေတာ့ Client code ပါ။

    public class PrototypeDemo {  
    public static void main(String[] args) {  
    HeavyObject firstObj = new HeavyObject();  
    HeavyObject another = firstObj.reproducce();  
    System.out.println(another);  
    }  
    }
Client ကသံုးတဲ့ေနရာမွာ firstObject တခုကုိပဲ new operator သံုးၿပီး constructor နဲ.ေခၚပါတယ္ ပထဆံုးအၾကိမ္မွာေတာ့ heay computation နဲ.costly operation ၿဖစ္မွာပါ။ ေနာက္ object ေတြၿဖစ္တဲ့ another object ကုိက်ေတာ့ reproduce ကုိသံုးၿပီး clone လုပ္ၿပီး Object ေဆာက္ပါတယ္။ ဒါေၾကာင့္ခုနက constructor ကိုမၿဖတ္ရေတာ့ပါဘူး ။ ဒါေၾကာင့္ heavy computation+memory cost ကုိေက်ာ္ႏုိင္ပါၿပီ။  
Prototype pattern ရဲ.အားသာခ်က္ကေတာ့ Heavy ၿဖစ္တဲ့ Object ေတြေဆာက္တဲ့ေနရာမွာ ခနခန ထပ္ေဆာက္မေနပဲ ဘံုတူတဲ့ property ေတြကို copy ကူးၿပီးသံုးတဲ့ အတြက္ computational time+memory သက္သာတာပါပဲ။ ဒါကေတာ့သူ. ေကာင္းတဲ့အခ်က္ပါပဲ။


## Object Oriented Design Pattern Series Part-6 Adapter Design Pattern

Adapter pattern ကေတာ့ Structural pattern ေတြထဲကတခုပါ။ သူကဘာလုပ္ေပးလဲဆုိေတာ့ interface မတူတဲ့ module ဒါမွမဟုတ္ code ၂ခုၾကားမွာ အလုပ္လုပ္လုိ.ရေအာင္ glue code ဒါမွမဟုတ္ bridge လုပ္ေပးတာပါ။

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTAyODg5ODUxNCwtNTE2MjYwMTQsMTcxND
U2OTcyMSwxNDg3NTc5NjA1LDM4NDI3NzM4OF19
-->