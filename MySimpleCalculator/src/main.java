

public class main {

	public static void main(String[] args) {
		simplecalculator myfirstcalculator = new simplecalculator();
		myfirstcalculator.setFirstNumber(10.0);
		myfirstcalculator.setSecondNumber(5.0);
		
		System.out.println("addition of first and second number = "+myfirstcalculator.getAdditionResult());
		System.out.println("the subtraction of secod number from first number = "+myfirstcalculator.getSubtractionResult());
		
		myfirstcalculator.setFirstNumber(5.0);
		myfirstcalculator.setSecondNumber(4.0);
		
		System.out.println("multiplication result = "+myfirstcalculator.getMultiplicationResult());
		System.out.println("Division result = "+myfirstcalculator.getDivisionResult());

	}

}


	}

}
