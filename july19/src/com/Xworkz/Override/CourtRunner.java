package com.Xworkz.Override;

public class CourtRunner {
	public static void main(String[] args) {
	// for court
		Court ref= new Court();
	    ref.justice();
	    
	    System.out.println("   ");
	    
	    
	    // for SupremeCourt
	    SupremeCourt ref2=new SupremeCourt();
	    ref2.importantCase();
	    ref2.justice();
	    
	    Court ref3=new SupremeCourt();
	   SupremeCourt ref4=( SupremeCourt)ref3;
	   ref4.importantCase();
	   ref4.justice();
	   
	   System.out.println("   ");
	   
	   // for HighCourt
	   HighCourt ref5=new HighCourt();
	   ref5.criminalCase();
	   ref5.forgeryCase();
	   ref5.importantCase();
	   ref5.justice();
	   
	   SupremeCourt ref6=new HighCourt();
	   HighCourt ref7=(HighCourt)ref6;
	   ref7.criminalCase();
	   ref7.forgeryCase();
	   ref6.importantCase();
	   ref6.justice();
	   
	   Court ref8=new HighCourt();
	   HighCourt ref9=(HighCourt)ref8;
	   ref9.criminalCase();
	   ref9.forgeryCase();
	   ref9.importantCase();
	   ref9.justice();
	   
	   System.out.println("   ");
	   
	   // for CivilCourt
	   CivilCourt ref10= new CivilCourt();
	   ref10.propertyCase();
	   ref10.criminalCase();
	   ref10.forgeryCase();
	   ref10.importantCase();
	   ref10.justice();
	   
	   HighCourt ref11=new CivilCourt();
	   CivilCourt ref12=(CivilCourt)ref11;
	   ref12.propertyCase();
	   ref12.criminalCase();
	   ref12.forgeryCase();
	   ref12.importantCase();
	   ref12.justice();
	   
	   SupremeCourt ref13 = new CivilCourt();
	   CivilCourt ref14 = (CivilCourt)ref13;
	   ref14.propertyCase();
	   ref14.criminalCase();
	   ref14.forgeryCase();
	   ref14.importantCase();
	   ref14.justice();
	   
	  Court ref15 = new CivilCourt();
	   CivilCourt ref16= (CivilCourt)ref15;
	   ref16.propertyCase();
	   ref16.criminalCase();
	   ref16.forgeryCase();
	   ref16.importantCase();
	   ref16.justice();
	   
	   System.out.println("   ");
	   
	   
	   // for  FamilyCourt
	   
	   FamilyCourt ref17= new FamilyCourt();
	   ref17.divorceCase();
	   ref17.propertyCase();
	   ref17.criminalCase();
	   ref17.forgeryCase();
	   ref17.importantCase();
	   ref17.justice();
	   
	   CivilCourt ref18=new FamilyCourt();
	   FamilyCourt ref19= (FamilyCourt)ref18;
	   ref19.divorceCase();
	   ref19.propertyCase();
	   ref19.criminalCase();
	   ref19.forgeryCase();
	   ref19.importantCase();
	   ref19.justice();
	   
	   HighCourt ref20=new FamilyCourt();
	   FamilyCourt ref21=(FamilyCourt)ref20;
	   ref21.divorceCase();
	   ref21.propertyCase();
	   ref21.criminalCase();
	   ref21.forgeryCase();
	   ref21.importantCase();
	   ref21.justice();
	   
	   
	   SupremeCourt ref22=new FamilyCourt();
	   FamilyCourt ref23=(FamilyCourt)ref22;
	   ref23.divorceCase();
	   ref23.propertyCase();
	   ref23.criminalCase();
	   ref23.forgeryCase();
	   ref23.importantCase();
	   ref23.justice();
	   
	   Court ref24= new FamilyCourt();
	   FamilyCourt ref25=(FamilyCourt)ref24;
	   ref25.divorceCase();
	   ref25.propertyCase();
	   ref25.criminalCase();
	   ref25.forgeryCase();
	   ref25.importantCase();
	   ref25.justice();
	   
}
}
