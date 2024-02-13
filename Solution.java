import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        int A[] = new int[5];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 3;
        A[4] = 6;

        Solution s = new Solution();
        int B[] = s.solution(A);
        System.out.println("Input  : "+Arrays.toString(A));
        System.out.println("Result : "+Arrays.toString(B));
    }

    public int[] solution(int[] A)
    {
        Set<Integer> setA = asSet(A);
        List<Set<Integer>> divisors = computeDivisors(A.length * 2);
        int occurrences[] = computeOccurrences(A);
        int nonDivisors[] = new int[A.length];
        for (int i=0; i<A.length; i++)
        {
            int value = A[i];
            Set<Integer> d = divisors.get(value);
            int totalOccurances = 0;
            for (Integer divisor : d)
            {
                if (setA.contains(divisor))
                {
                    totalOccurances += occurrences[divisor];
                }
            }
            nonDivisors[i] = A.length-totalOccurances;
        }
        return nonDivisors;
    }

    private static Set<Integer> asSet(int A[])
    {
        Set<Integer> result = new HashSet<Integer>();
        for (int value : A)
        {
            result.add(value);
        }
        return result;
    }

    private static List<Set<Integer>> computeDivisors(int maxValue)
    {
        List<Boolean> prime = new ArrayList<Boolean>();
        prime.addAll(Collections.nCopies(maxValue+1, Boolean.TRUE));
        List<Set<Integer>> divisors = new ArrayList<Set<Integer>>();
        for (int i = 0; i < maxValue + 1; i++)
        {
            Set<Integer> d = new HashSet<Integer>();
            d.add(1);
            d.add(i);
            divisors.add(d);
        }
        for (int i = 2; i <= maxValue; i++)
        {
            int next = i + i;
            while (next <= maxValue)
            {
                divisors.get(next).addAll(divisors.get(i));
                prime.set(next, Boolean.FALSE);
                next += i;
            }
        }
        return divisors;
    }

    private static int[] computeOccurrences(int A[])
    {
        int occurances[] = new int[A.length * 2 + 1];
        for (int i=0; i<A.length; i++)
        {
            int value = A[i];
            occurances[value]++;
        }
        return occurances;
    }
}