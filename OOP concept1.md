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


Adapter မွာ ၂မ်ိဳးရိွပါတယ္ Class Adapter နဲ. Object Adatper ဆုိၿပီးေတာ့။ အေပၚကၿပထားတဲ့ UML diagram ကေတာ့ Class Adapter ၿဖစ္ၿပီးေတာ့ ေအာက္ကေကာင္ကေတာ့ Object Adapter ပါပဲ။

## Object Adapter
Intent  
Module ေတြ Class ေတြၾကားထဲမွာ သံုးရမဲ့ code ေတြသည္ interface အားၿမင့္မတူဘူး ဒါေပမဲ့ ေခၚတဲ့ေကာင္ေတြကလဲ မၿပင္ႏုိင္ဘူးဆုိရင္ Adapter pattern ကိုသံုးရမွာပါ။

Framework ဆုိတဲ့ interface တခုရိွတယ္ သူ.ကုိ အားလံုးကလုိက္နာရတယ္ဆုိပါစို. ။ သူမွာ add(Integer item) ဆုိတဲ့ method တခုပါတယ္ဆုိပါစုိ. 
ဒါေပသိ Framework နဲ.တြဲသံုးခ်င္တဲ့ legacy class တခုက်ေတာ့ addItem(Integer item) ၿဖစ္ေနေရာ ဒါဆုိသူတုိ. ၂ခုတြဲလုပ္လို.မရဘူးေပါ့။ အဲ့ဒါဆုိရင္ Class Adapter သံုးၿပီးေၿဖရွင္းလုိ.ရပါတယ္။

    public interface Framework {  
    public void add(Integer item);  
    }

ဒါကေတာ့ interface ပါ သူ.ကုိ အားလုံးကလုိက္နာရပါမယ္ ေအာက္ကေကာင္ကေတာ့ Old legacy code ပါသူ.ကုိလဲ တၿခားေကာင္ေတြကသံုးေနေတာ့ ၿပင္ခြင့္မရိွဘူးဆုိပါစုိ.ဗ်ာ။
    public class OldAPI {  
    public void addItem(Integer item )  
    {  
    System.out.println("Old API addItem "+item);  
    }  
    }

 - interface Framework နဲ. OldAPI မွာ add method နဲ. addItem method က
   အဓိပၸာယ္သေဘာတရားခ်င္းတူေပမဲ့ interface method signature ကြာတဲ့အတြက္
   တြဲသံုးလို.အဆင္မေၿပပါဘူး ။
 - ဒါဆုိ ကြ်န္ေတာ္တုိ.က ClassAdapter လို.ေဆာက္ၿပီး OldAPI ကုိ extend
   လုပ္မယ္ Framework ကုိ implement လုပ္မယ္ ၿပီးေတာ့ framework method ကို
   override လုပ္မယ္ အဲ့ကေန OldAPI method addItem ကုိေခၚေပးလိုက္မယ္ဆုိရင္
   Class Adapater code ရပါၿပီ သူတုိ. ၂ ခုအလုပ္လုပ္ႏုိင္ပါၿပီ။

    public class ClassAdapter extends OldAPI implements Framework{  
    @Override  
    public void add(Integer item) {  
    this.addItem(item);//Here call to old API method  
    }
    
    }

Framework မွာ define လုပ္ထားတဲ့ add ဆုိတဲ့ method ကုိ သူ override လုပ္ေပးရမယ္ ဒါဆုိ framework အတုိင္းသူ အလုပ္လုပ္ႏုိ္င္သြားပါလိမ့္မယ္။ add method မွာ သူကဘာမွမလုပ္ပါဘူး။  

## OldAPI ရဲ. method အေဟာင္းၿဖစ္တဲ့ add ကိုလွမ္းေခၚလုိက္တာပါပဲ။ အဲ့ဒါသည္ adapter pattern ရဲ.အသက္ပါပဲ

    public ClientDemo {  
    public static void main(String[] args) {  
    Framework framework = new ClassAdpater();  
    framework.add(30);  
    }  
    }
အေပၚက ClientDemo example မွာ client သည္ OldAPI ကုိ တုိက္ရုိက္မသံုးဘူးဆုိတာပါပဲ.။ ဘာလုိ.လဲဆုိေတာ့ ရည္ရြယ္ခ်က္ကိုက OldAPI ကုိသံုးခ်င္တယ္ ဒါေပမဲ့ method အေဟာင္းအေနနဲ.မဟုတ္ပဲ Framework ကေနေပးထားတဲ့ method အတုိင္းသံုးခ်င္တာ။

## Object Adapter

 - Object Adapter ကေတာ့ ဘာကြာမလဲဆုိေတာ့ class adapter လို inheritance
   ကိုမသံုးပဲ object composition ကုိသံုးၿပီး အလုပ္လုပ္တာေလးပါပဲ။
 ေအာက္က code ကုိၾကည့္ပါ။

    public class ObjectAdpater implements Framework{  
    OldAPI oldAPI = new OldAPI();//Here is object composition  
    @Override  
    public void add(Integer item) {  
    oldAPI.addItem(item);//Here call to old API method  
    }  
    }

 - Object Adapter က inheirtance မသံုးပဲ Object composition သံုးၿပီး
   oldAPI object ကုိေဆာက္ပါတယ္ ၿပီးေတာ့ အဲ့ကေနတဆင့္ OldAPI ရဲ. method
   addItem ကုိေခၚပါတယ္။

 - Client ကေနသံုးရင္ ClassAdapter အစား ObjectAdapter
   ေလးေၿပာင္းသံုးရံုပါပဲ။

 - Adapter ကဘာေကာင္းလဲဆုိရင္ေတာ့ Legacy code ေတြမွာ interface
   နဲ.မကိုက္လုိ. အဆင္မေၿပဘူး ေခၚလုိ.မရဘူးဆုိရင္ ၾကားခံ Glue Code
   အေနနဲ.သံုးလုိ.ရေအာင္ ေၿပာင္းလုိက္လုိ.ရပါတယ္။

 - ဒါေပမဲ့ Design အရ မွားေနတဲ့ class ဆုိရင္ေတာ့ ဆုိခ်င္တာက OldAPI class
   ကုိ ထိလုိ.ရမယ္ဆုိရင္ Adapter မသံုးပဲေၿဖရွင္းတာပိုေကာင္းပါတယ္။

## Object Oriented Design Pattern Series Part-7 Bridge Design Pattern

Bridge Design Pattern ကေတာ့ Structural Patternထဲမွာပါတဲ့ pattern ပါ။

##  Decouple an abstraction from its implementation so that the two can > vary independently.

Decouple လုပ္တယ္ဆုိတာ တခုနဲ.တခု ကိုအေသခ်ိတ္ထားတာဲ (class တခုမွာ ေနာက္ class တခုကုိပဲသံုးထားတယ္ 

## abstract,interface ကိုမသံုးဘူး ဒါဆုိေနာင္တခ်ိန္မွာ အစားထုိးသံုးလို.မရဘူး။ extend လုပ္ဖုိ.ခက္မယ္,

## abstract,interface ကိုသာသံုးထားရင္ သူတုိ.က ဆင္းလာတဲ့ေကာင္ေတြနဲ.သံုးလုိ.ရလို. extend ရတာလြယ္မယ္).


## Abstraction ဆုိတာေတာ့ implementation detail ကုိ hide လုပ္ထားတာကို ေၿပာခ်င္တာပါ။

## Implementation detail ဆုိတာကေတာ့ ဒီ code ကုိ implment လုပ္ဖုိ.အတြက္ ဘယ္ class ဘယ္ method ဆုိတာကို ေခၚတဲ့သူက သိေနရမယ္ ဒီလိုဆုိခ်င္တာပါ။

**Polymorphism** လိုပုံစံမ်ိ္ဳး မွာ 

    Shape s = new CanvasRectangle();  
    s = new SVGRectangle();

client က သူသံုးရမဲ့ implemnetation (Canvas လား SVG လားေၿပာၿပီး concrete class) နဲ. create လုပ္ေနရတယ္

**OO Programming မွာ program to interface not to implementation**

implementation class ေတြကို တုိက္ရုိက္ေခၚေနရေတာ့ ေနာင္တခ်ိန္ **3D Drawing API** လိုတခုခုေဆာက္မယ္ဆိုရင္ client က သပ္သပ္သိေနရဦးမယ္ ဘယ္ Object ေဆာက္ဆုိတာကို။ 

## client က implementation ကိုမသိပဲေပးေဆာက္ခ်င္ရင္ Bridge Pattern ကုိသံုးလုိ.ရတယ္။

## ဥပမာ ဒီေနရာမွာ implementation ကို interface တခုအေနနဲ.ထားၿပီး class Diagram ကိုဒီလိုၿပန္ေဆာက္လိုက္မယ္ဆုိရင္ implementation ကို runtime မွာပါခ်ိန္းလို.ရမွာပါ။

Client ကေတာ့ Circle, Rectangle ဆုိတဲ့ abstraction ေတြနဲ.အလုပ္လုပ္သြားႏုိင္မွာပါ။ ဘယ္ specific implementation ဆုိတာကိုသိစရာမလိုေတာ့ပါဘူး။

အရင္ပံုဆုိရင္ SVG drawing အတြက္ဆုိရင္ ရိွသမွ် class ေတြလိုက္ၾကည့္ရမယ္) ခုက်ေတာ့ SVGAPI ေအာက္မွာၾကည့္လိုက္တာနဲ.အကုန္ရပါၿပီ။ ဒါကို SRP (Single Responsibility Principle) လို.ေခၚပါတယ္။

## အဲ့ေတာ့ ခုပံုစံအရဆုိရင္ Abstraction ၿဖစ္တဲ့ Rectangle ,Circle နဲ. implementation ၿဖစ္တဲ့ SVGAPI နဲ. CanvasAPI ကုိခြဲထုတ္လုိ.ရပါၿပီ။

## Coupling မၿဖစ္ေတာ့ဘူ

း အဲ့ေတာ့ ေနာက္ထပ္ API တခုထပ္ထဲ့မယ္ဆုိရင္ class hierarchy ေတြမမ်ားပဲ class တခုပဲထဲ့လို.အဆင္ေၿပပါၿပီ။  
ေအာက္ကေတာ့ GoF မွာေပးထားတဲ့ Bridge ရဲ. class diagram ပါ။  
Code ကေတာ့ရွင္းပါတယ္။

public interface DrawingAPI {  
void drawCircle();  
void drawRectangle();  
}

ဒါကေတာ့ DrawingAPI interface ပါ။ သူ.မွာ drawing method ေတြအကုန္ထဲ့ထားပါတယ္။ Different Implementation ေတြကသူ.ကို implement လုပ္ယံုပါပဲ။ ဒီမွာဆုိ SVGApi နဲ. CanvasApi ပါ။

    public class SVGApi implements DrawingAPI{  
    @Override  
    public void drawCircle() {  
    System.out.println("Draw SVG Circle");  
    }  
    @Override  
    public void drawRectangle() {  
    System.out.println("Draw SVG Rectangle");  
    }  
    }  
    public class CanvasAPI implements DrawingAPI{  
    @Override  
    public void drawCircle() {  
    System.out.println("Draw Canvas Circle");  
    }  
    @Override  
    public void drawRectangle() {  
    System.out.println("Draw Canvas Rectangle");  
    }  
    }  
    SVGApi နဲ. CanvasAPI ၂ခုဟာ DrawingAPI ရဲ. different implementation ေတြပါ။ ဒါကေတာ့ implementation class ေတြပါ။ Abstraction class ေတြကေတာ့ဒီလိုပါ။
    
    abstract class Shape {  
    DrawingAPI api; //Here just use interface class  
    Shape(DrawingAPI api)  
    {  
    this.api = api;  
    }  
    abstract void draw();  
    }

## Shape class က DrawingAPI ကိုသံုးပါမယ္ ဒါေပမဲ့ ဘယ္ implementation ဆုိတာကုိမေၿပာပဲ DrawingAPI interface ကိုပဲ api ဆုိၿပီးထဲ့ထားတဲ့အတြက္ ၾကိဳက္တဲ့ implementation ကိုသံုးလို.ရမွာပါ။

 ဒါကေနာက္ပိုင္း DrawingAPI ကေန တၿခား different implementation ေတြ 

## ဥပမာThreeDAPI ထပ္ထဲ့ရင္လဲ အဆင္ေၿပပါတယ္။ Shape constructor မွာ ဘယ္ api နဲ.ဆြဲမလဲဆုိတာကိုလက္ခံံပါတယ္။

ေအာက္က Circle နဲ. Rectangle ပါ။

public class Circle extends Shape{  
public Circle(DrawingAPI api) {  
super(api); // call parent constructor  
}  
@Override  
void draw() {  
api.drawCircle();  
}  
}  
public class Rectangle extends Shape{  
public Rectangle(DrawingAPI api) {  
super(api);  
}  
@Override  
void draw() {  
api.drawRectangle();  
}  
}  
Circle ရဲ. draw ရဲ. Rectangle ရဲ. draw မွာသက္ဆုိင္ရာ API ရဲ. drawCircle ,drawRectanlge ကိုေခၚပါတယ္ဒါေပမဲ့ ဒီမွာသတိထားရမွာက ဘယ္ API ဆုိတာမပါပါဘူး ဒါသည္ loose coupling ၿဖစ္ေအာင္လုပ္ထားတာလို.ဆုိရမွာပါ။ ၾကိဳက္တဲ့ API နဲ.တြဲသံုးလုိ.ရတယ္ေပါ့ဗ်ာ။ ေအာက္ကေတာ့ Client code ပါ။  
public class BridgeDemo {  
public static void main(String[] args) {  
DrawingAPI api = new SVGApi();  
Shape s = new Rectangle(api);  
s.draw();

api = new CanvasAPI();  
s = new Circle(api);  
s.draw();  
}  
}
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTc0OTYxNjYzMiw4NjU4NDMzNTIsNTgxMD
M1Mzc2LDEwMzEyMjE5MDgsMTMzNDQwNzEzNiwtNzgwOTc2OTY2
LDQ3OTAwNzcwNSwxMDY3NjcxMjQ1LC0yMDU1MDkwMDMxLDEwMj
g4OTg1MTQsLTUxNjI2MDE0LDE3MTQ1Njk3MjEsMTQ4NzU3OTYw
NSwzODQyNzczODhdfQ==
-->