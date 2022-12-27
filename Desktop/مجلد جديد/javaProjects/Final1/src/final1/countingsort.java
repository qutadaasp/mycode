///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package final1;
//
///**
// *
// * @author قتادة
// */
//public class countingsort {
//
//    void sort(int arr[]) {
//        int n = arr.length;
//
//        // The output character array that will have sorted arr 
//        int output[] = new int[n];
//
//        // Create a count array to store count of inidividul 
//        // characters and initialize count array as 0 
//        int min = arr[arr.length - 1], max = arr[arr.length - 1];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        int count[] = new int[max - min];
//
//        // store count of each character 
//        for (int i = 0; i < n; ++i) {
//            ++count[arr[i]];
//        }
//
//        // Change count[i] so that count[i] now contains actual 
//        // position of this character in output array 
//        for (int i = 1; i <= 255; ++i) {
//            count[i] += count[i - 1];
//        }
//
//        // Build the output character array 
//        // To make it stable we are operating in reverse order. 
//        for (int i = n - 1; i >= 0; i--) {
//            output[count[arr[i]] - 1] = arr[i];
//            --count[arr[i]];
//        }
//
//        // Copy the output array to arr, so that arr now 
//        // contains sorted characters 
//        for (int i = 0; i < n; ++i) {
//            arr[i] = output[i];
//        }
//    }
//
//    public static void main(String[] args) {
//        countingsort ob = new countingsort();
//        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
//            'r', 'g', 'e', 'e', 'k', 's'
//        };
//
//        ob.sort(arr);
//
//        System.out.print("Sorted character array is ");
//        for (int i = 0; i < arr.length; ++i) {
//            System.out.print(arr[i]);
//        }
//    }
//}
