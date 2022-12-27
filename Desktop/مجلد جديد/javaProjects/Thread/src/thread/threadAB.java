///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package thread;
//
///**
// *
// * @author قتادة
// */
//public class threadAB extends Thread {
//
//    @Override
//    public void run() {
//        synchronized(lock1){
//            try {
//            for (int i = 0; i < 50; i++) {
//                System.out.print("B");
//                sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        }
//        
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        threadAB a = new threadAB();
//        a.start();
//        for (int i = 0; i < 50; i++) {
//            Thread.sleep(1000);
//            System.out.print("A");
//        }
//
//    }
//    class lock1{
//        int flag;
//
//        public lock1(int flag) {
//            this.flag = flag;
//        }
//        
//    }
//}
