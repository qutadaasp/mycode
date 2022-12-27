/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 *
 * @author قتادة
 */
public class order1 implements Readable{

    private int temp = 0;
    private int[] arr;

    public order1(int[] arr) {
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    public void run() {
        synchronized (arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
        print();
    }

    private void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
