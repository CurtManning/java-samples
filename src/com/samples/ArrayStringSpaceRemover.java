package com.samples;

class ArrayStringSpaceRemover {
 public static void main(String[] arguments) {
     String myString = "Rudolph the Red-Nosed Reindeer";
     char[] mstr = myString.toCharArray();
     for (int dex = 0; dex < mstr.length; dex++) {
         char current = mstr[dex];
         if (current != ' ') {
             System.out.print(current);
         } else {
             System.out.print('.');
         }
     }
     System.out.println();
 }
}