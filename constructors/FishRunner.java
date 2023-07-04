class FishRunner{
public static void main(String[] things)
{
System.out.println("running main of FishRunner class");
Fish ref=new Fish();
System.out.println(ref.name);
Fish ref1=new Fish("bonyfish","osteichthyes"); 
System.out.println(ref1.name);
System.out.println(ref1.type);
Fish ref2=new Fish();
System.out.println(ref2.price);
Fish ref3=new Fish();
System.out.println(ref3.location);
Fish ref4=new Fish("bonyfish");
System.out.println(ref4.name);
System.out.println(ref4.price);
}
}