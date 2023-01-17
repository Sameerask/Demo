package gradledemo;

public class Calculator
{

	public float calculateIntrest(float principal,float rate,float time) {

	return (principal*rate*time)/100;

	}

	 

	public static void main(String[] args) 
	{

	// TODO Auto-generated method stub

	Calculator obj = new Calculator();

	System.out.println(obj.calculateIntrest(50,6,7));

	 

	}

	
	}

