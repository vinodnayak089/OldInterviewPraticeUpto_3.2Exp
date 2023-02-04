package com.pratice.interviews;

import java.util.*;
public class FindTargetNumberBySummingTwoNumbersFromArrayInSingleLoop{

     public static void main(String []args){
       int[] arr={1,4,6,8,9};
       int target=10;
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<arr.length;i++)
       {
           int compliment=target-arr[i];
           if(set.contains(compliment))
           {
               System.out.println("Pair number for sum 10 are :"+ compliment+"  and "+ arr[i]);
           }
           set.add(arr[i]);
       }
     }
}