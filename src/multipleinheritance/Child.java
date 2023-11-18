package multipleinheritance;

import java.security.DomainCombiner;

public class Child implements parent1,parent2,parent3{
	
	
public void myname() {
	System.out.println("hi hello i am hear");
}

 
	@Override
	public void myparent() {
		System.out.println("he is my father");
		
	}

	@Override
	public void myparentage() {

System.out.println("he was 40 yers old guy");
		
	}

	@Override
	public void mygfather() {
		System.out.println("he is my gfather");
		
	}

	@Override
	public void mygrandfatherage() {
		System.out.println("he was 55 yers old guy");
		
	}

	@Override
	public void myggfather() {
		System.out.println("he is my ggfather");		
	}

	@Override
	public void myggfatherage() {
		// TODO Auto-generated method stub
		System.out.println("he was 70 yers old guy");
		
		
	
	}
	public static void main(String[] args) {
		
		parent1 p1=new Child();
		p1.myparent();
		p1.myparentage();
		parent2 p2=new Child();
		p2.mygfather();
		p2.mygrandfatherage();
		parent3 p3=new Child();
		p3.myggfather();
		p3.myggfatherage();
		Child cc= new Child();
		cc.myname();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
