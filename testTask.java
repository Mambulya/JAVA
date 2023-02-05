import java.util.Scanner;


public class Main
{
    public static String calc(String input) throws Exception {
        
        String[] opers = input.split(" ");
        String num1 = opers[0];
        String num2 = opers[2];
        String oper = opers[1];
        
        int answer = 0;
        int NUM1 = 0;
        int NUM2 = 0;
        boolean isNUM1Digital = false;
        boolean isNUM2Digital = false;
        
        // Roman numerals case
        // fist numner check
        try{
            NUM1 = Integer.parseInt(num1);
            
        } catch (NumberFormatException e) {
            isNUM1Digital = true;
        }
        
        // second number check
        try{
            NUM2 = Integer.parseInt(num2);
            
        } catch (NumberFormatException e) {
            isNUM2Digital = true;
        }
        
        
        // is roman digit + usual digit example?
        if ((isNUM1Digital == true) && (isNUM2Digital == false)) {
            throw new Exception();
        }else if ((isNUM1Digital == false) && (isNUM2Digital == true)){
            throw new Exception();
        }
            
        // roman digit to usual digit
        if (isNUM1Digital) {
            switch (num1) {
                case "I":
                    NUM1 = 1;
                    break;
                case "II":
                    NUM1 = 2;
                    break;
                case "III":
                    NUM1 = 3;
                    break;
                case "IV":
                    NUM1 = 4;
                    break;
                case "V":
                    NUM1 = 5;
                    break;
                case "VI":
                    NUM1 = 6;
                    break;
                case "VII":
                    NUM1 = 7;
                    break;
                case "VIII":
                    NUM1 = 8;
                    break;
                case "IX":
                    NUM1 = 9;
                    break;
                case "X":
                    NUM1 = 10;
                    break;
                default:
                    throw new Exception();
            }
        }
        
        
        if (isNUM2Digital) {
            switch (num2) {
                case "I":
                    NUM2 = 1;
                    break;
                case "II":
                    NUM2 = 2;
                    break;
                case "III":
                    NUM2 = 3;
                    break;
                case "IV":
                    NUM2 = 4;
                    break;
                case "V":
                    NUM2 = 5;
                    break;
                case "VI":
                    NUM2 = 6;
                    break;
                case "VII":
                    NUM2 = 7;
                    break;
                case "VIII":
                    NUM2 = 8;
                    break;
                case "IX":
                    NUM2 = 9;
                    break;
                case "X":
                    NUM2 = 10;
                    break;
                default:
                    throw new Exception();
            }
        }
        
        
        // calculating
        
        switch (oper) {
            
            case "+":
                answer = NUM1 + NUM2;
                break;
                
            case "-":
                answer = NUM1 - NUM2;
                break;
                
            case "*":
                answer = NUM1 * NUM2;
                break;
                
            case "/":
                answer = NUM1 / NUM2;
                break;
        }
        
        // вывод римскими числами
        if (isNUM2Digital){
            if (answer < 0)
                throw new Exception();
                
            if (answer == 100)
                return "C";
                
            String[] digits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IV"};
            String[] decades = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            
            int units = answer % 10;
            int tens = answer / 10;
            
            return decades[tens] + digits[units];
            
        }
        
        return Integer.toString(answer);
    }
    
    
    
	public static void main(String[] args) throws Exception {
		System.out.println("начало работы");
		
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		System.out.println(calc(num));
		
		
	}
}
