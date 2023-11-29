
package DS.LAB1121BCE7863;

import java.util.Scanner;

import DS.LAB1121BCE7863.ExtendibleHashing.Elem;

class Bucket {

    private Elem e1 = new Elem();
    private Elem e2 = new Elem();
    private int localDepth = 2;

    public Bucket() {
    }
    public boolean isFull() {
        if (e1.getIsFull() && e2.getIsFull()) {
            return true;
        }

        else {
            return false;
        }
    }
    public boolean isEmpty() {
        if ((!e1.getIsFull()) && (!e2.getIsFull())) {
            return true;
        } else {
            return false;
        }
    }
    public void setElemOne(int val, boolean f) {
        e1.setValue(val);
        e1.setIsFull(f);
    }
    public Elem getElemOne() {
        return e1;
    }
    public void setElemTwo(int val, boolean f) {
        e2.setValue(val);
        e2.setIsFull(f);
    }
    public Elem getElemTwo() {
        return e2;
    }
    public int getLocalDepth() {
        return localDepth;
    }
    public void setLocalDepth(int val) {
        localDepth = val;
    }
}

public class ExtendibleHashing {

    public static int globalDepth = 2;
    class Functions {
        public static Bucket[] addElement(int value, Bucket[] bucks) {
            int position = value % ((int) Math.pow(2, (int) (globalDepth)));
            if (!bucks[position].isFull()) {
                if (!bucks[position].getElemOne().getIsFull()) {
                    bucks[position].getElemOne().setValue(value);
                    bucks[position].getElemOne().setIsFull(true);
                } else {
                    bucks[position].getElemTwo().setValue(value);
                    bucks[position].getElemTwo().setIsFull(true);
                }
            } else {
                bucks = collisionDetected(bucks, value, position);
            }
            return bucks;
        }
        public static Bucket[] collisionDetected(Bucket[] buckets, int value, int probBucket) {
            int position = value % ((int) Math.pow(2, (int) (globalDepth)));

            if (buckets[position].getLocalDepth() < globalDepth) {
                buckets = splitBucket(buckets, value, probBucket);
            } else {
                buckets = doubleDirectory(buckets);
                buckets = addElement(value, buckets);
            }
            return buckets;
        }

        public static Bucket[] doubleDirectory(Bucket[] buckets) {
            globalDepth = globalDepth + 1;
            int arrayLen = (int) Math.pow(2, globalDepth);
            Bucket[] newBuckets = new Bucket[arrayLen];

            for (int q = 0; q < arrayLen; q++) {
                if (q < ((int) Math.pow(2, (globalDepth - 1)))) {
                    newBuckets[q] = buckets[q];
                } else {
                    newBuckets[q] = new Bucket();
                    newBuckets[q].getElemOne().setIsFull(false);
                    newBuckets[q].getElemTwo().setIsFull(false);
                }
            }
            return newBuckets;
        }

        public static Bucket[] splitBucket(Bucket[] buckets, int value, int probBucket) {
            int temp1a = buckets[probBucket].getElemOne().getValue();
            int temp2a = buckets[probBucket].getElemTwo().getValue();
            buckets[probBucket].getElemOne().setIsFull(false);
            buckets[probBucket].getElemTwo().setIsFull(false);
            buckets = addElement(temp1a, buckets);
            buckets = addElement(temp2a, buckets);
            buckets = addElement(value, buckets);
            return buckets;
        }

        public static void printAllStoredData(int globalDepth, Bucket[] bucks) {
            int loopLen = (int) Math.pow(2, globalDepth);
            for (int i = 0; i < loopLen; i++) {
                if (bucks[i] != null) {
                    if (!bucks[i].isEmpty()) {
                        if (bucks[i].getElemOne().getIsFull()) {
                            System.out.println(
                                    "In bucket " + i + ", element one contains: " + bucks[i].getElemOne().getValue());
                        }
                        if (bucks[i].getElemTwo().getIsFull()) {
                            System.out.println(
                                    "In bucket " + i + ", element two contains: " + bucks[i].getElemTwo().getValue());
                        }

                    }
                }
            }
        }

    }

  static  class Elem {

        private int value = 0;
        private boolean isFull = false;

        public Elem() {
        }
        public void setValue(int val) {
            value = val;
        }
        public int getValue() {
            return value;
        }
        public void setIsFull(boolean val) {
            isFull = val;
        }
        public boolean getIsFull() {
            return isFull;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
        Bucket[] bucks = new Bucket[10];
        for (int q = 0; q < 10; q++) {
            bucks[q] = new Bucket();
        }
        switch(choice){
            case 1 : System.out.println("Enter the element you want to insert : ");
                      int value = sc.nextInt();
                      bucks = Functions.addElement(value, bucks);
            break;
            case 2 : System.out.println("\nHash table : ");
                    Functions.printAllStoredData(globalDepth, bucks);
                    break;
            default : 
                
        }
        

        Functions.printAllStoredData(globalDepth, bucks);
    }

}