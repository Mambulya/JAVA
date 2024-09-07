import java.math.*;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger f = BigInteger.valueOf(1000);
        System.out.println("Тысячное число Фиббоначи: ");
        System.out.println(fibNum(f,0));
        System.out.println("Сумма: ");
        System.out.println(fibNum(f,1));
    }
    public static BigInteger fibNum(BigInteger num, int showSum) {
        BigInteger eins = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        temp = temp.add(num);
        BigInteger summa = BigInteger.ONE;

        if (num.compareTo(eins) == -1) { //  num <= 1
            return num;
        }
        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;
        BigInteger next = BigInteger.ZERO;
                                            // i != num + 1           i++
        for (BigInteger i = BigInteger.TWO; i.compareTo(temp) != 0; i = i.add(eins)) {
            next = prev.add(curr);
            prev = curr;
            curr = next;
            summa = summa.add(curr);
        }
        if (showSum == 0) {
            return curr;
        } else {
            return summa;
        }
    }
}
