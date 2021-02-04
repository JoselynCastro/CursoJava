package maestroObjetos;

public class HumanTest {

	public static void main(String[] args) {
		Human Wizard= new Human();
		Human Samuray= new Human();
		Human Ninja= new Human();
		
		//ataques
		Wizard.attackHuman(Samuray);
		Wizard.attackHuman(Ninja);
		Wizard.attackHuman(Ninja);
		Ninja.attackHuman(Wizard);
		Ninja.attackHuman(Samuray);
		System.out.println("Health Wizard:"+ Wizard.getHealth());
		System.out.println("Health Ninja:"+Ninja.getHealth());
		System.out.println("Health Samuray:"+Samuray.getHealth());
		
		Ninja act= new Ninja();
		act.steal(Wizard);
		System.out.println("Ahoratu vida Wizard es :"+Wizard.getHealth());
		
		Wizard act1=new Wizard();
		act1.heal(Samuray);
		System.out.println("Health Samuray actual :"+Samuray.getHealth());
		
		
	}

}
