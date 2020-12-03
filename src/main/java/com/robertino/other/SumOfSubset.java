package com.robertino.other;

import java.util.Arrays;

public class SumOfSubset {

    int subsetCount = 0;
    static int operations = 0;

    public static void main(String[] args) {

        int[] weights = { 5, 10, 12, 13, 15, 18, 5 };
        int targetSum = 31;
        int result = new SumOfSubset().sumOfSubset(weights, targetSum);
        System.out.println("Number of solutions: " + result);
        System.out.println("Number of operations: " + operations);
        System.out.println(new SumOfSubset().isSubsetSum(weights, weights.length, targetSum));
    }

    public int sumOfSubset(int[] weights, int targetSum) {
        int sumAll = Arrays.stream(weights).sum();
        perform(weights, 0, 0, targetSum, sumAll);
        return subsetCount;
    }

    private void perform(int weights[], int sum, int startIdx, int targetSum, int sumAll)
    {
        ++operations;
        System.out.println(sum);
        if (targetSum == sum)
        {
            subsetCount++;
            if (startIdx < weights.length)
                perform(weights, sum - weights[startIdx - 1], startIdx, targetSum, sumAll);
        }
        else
        {
            for (int i = startIdx; i < weights.length; ++i)
            {
                if (sum + weights[i] <= targetSum) {
                    perform(weights, sum + weights[i], i + 1, targetSum, sumAll);
                }
            }
        }
    }

    private boolean isSubsetSum(int set[], int n, int sum) {
        if (sum == 0) {  return true; }
        if (n == 0 && sum != 0) { return false; }

        // If last element is greater than sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);

        /* else, check if sum can be obtained by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
}
