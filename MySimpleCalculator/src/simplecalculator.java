
public class simplecalculator {
	private double firstNumber;                                //(this ) class has 2 fields; instance variables
	private double secondNumber;

	public double getFirstNumber() {
		return firstNumber;
		
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setFirstNumber( double firstNumber) {
		this.firstNumber= firstNumber;
	}
	public void setSecondNumber (double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public double getAdditionResult() {
		double result = firstNumber + secondNumber;
		return result;
	}
	public double getSubtractionResult() {
		double answer = firstNumber - secondNumber;
		return answer;
	}
	public double getMultiplicationResult() {
		double x = firstNumber * secondNumber;
		return x;
	}
	public double getDivisionResult() {
		double y = firstNumber / secondNumber;
		if (secondNumber == 0) {
			return 0;
		}
		else {
			return y;
		}
	}

	}


