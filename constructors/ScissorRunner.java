class ScissorRunner{
public static void main(String[] things)
{
System.out.println("running main of ScissorRunner class");
Scissor ref=new Scissor();
System.out.println(ref.brand);
Scissor ref1=new Scissor("ButterCut","Black"); 
System.out.println(ref1.brand);
System.out.println(ref1.color);
Scissor ref2=new Scissor();
System.out.println(ref2.type);
Scissor ref3=new Scissor("cutting various thin materials");
System.out.println(ref3.usage);
System.out.println(ref3.size);
Scissor ref4=new Scissor();
System.out.println(ref4.price);
System.out.println(ref4.type);
Scissor ref5=new Scissor("carbon steel");
System.out.println(ref5.material);
System.out.println(ref5.price);
Scissor ref6=new Scissor("ButterCut","Black",8);
System.out.println(ref6.brand);
System.out.println(ref6.color);
System.out.println(ref6.price);
}
}