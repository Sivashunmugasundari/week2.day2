package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Calculator obj = new Calculator();
			int num1 = 2;
			int num2 = 3;
			int num3 = 4;
			int add = obj.add(num1, num2, num3);
			System.out.println("Addition:" + add);
			int sub = obj.sub(num1, num2);
			System.out.println("Subtraction :" + sub);
			float divide = obj.divide(num1, num2);
			System.out.println("Division: " + divide);
		}
	}


