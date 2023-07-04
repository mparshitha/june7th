class BottleRunner{
public static void main(String[] things)
{
System.out.println("running main of BottleRunner class");
Bottle ref=new Bottle();
System.out.println(ref.height);
Bottle ref1=new Bottle(8); 
System.out.println(ref1.height);
System.out.println(ref1.size);
Bottle ref2=new Bottle(300);
System.out.println(ref2.price);
}
}