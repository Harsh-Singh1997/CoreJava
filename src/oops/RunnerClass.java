package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee E1 = new Employee();
		
		E1.name = "Harsh";
		E1.EmpId = 1000;
		E1.Department = "HR";
		
		System.out.println(E1.name);
		System.out.println(E1.EmpId);
		System.out.println(E1.Department);
		
		Employee E2 = new Employee("Jack",1001,"Finance");
		E2.display();
		
		Bank B = new Bank();
		
		B.DisplayBalance();
		int Bal = B.GetBalance();
		
		System.out.println("The Balance is " + Bal);
		System.out.println("The Balance is " + B.GetBalance());
		
		OverloadingExample Area = new OverloadingExample();
		int RecArea = Area.GetArea(5, 6);
		int SquareArea = Area.GetArea(5);
		System.out.println("Area of Rectangle is " + RecArea);
		System.out.println("Area of Square is " + SquareArea);
		
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Ch.CloseBrowser();
		
		Firefox Fx = new Firefox();
		Fx.OpenBrowser();
		Fx.CloseBrowser();
		
		Browser Br = new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		CarInterface Car1 = new HondaCar();
		HondaCar Car2 = new HondaCar();
		
		Car2.Stop();
		Car2.Start();
		
		EncapsulationEx En  = new EncapsulationEx();
		
		En.setBalance(3000);
		En.setName("Harsh");
		En.setAddress("Prayagraj");
		
		System.out.println(En.getBalance());
		System.out.println(En.getName());
		System.out.println(En.getAddress());
		
		
		
		
		
	}

}
