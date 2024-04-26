/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
//وظيفتها ترتب الاراي بطريقة الانسرشن 
    public static void InsertionSort(int a[]) {

        int i, j, k, temp;

        for (i = 1; i < a.length; i++) {
            temp = a[i];
            for (j = 0; j < i; j++) {

                if (a[j] > temp) {
                    break;
                }
            }

            for (k = i; k > j; k--) {
                a[k] = a[k - 1];
            }
            a[j] = temp;
        }
    }
    
//merge sort: من السلايدات
    public static void MergeSort(int[] a, int tmp[], int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            MergeSort(a, tmp, left, center);
            MergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }
    
// وظيفتها ترتب الاراي بطريقة المرج 
    public static void merge(int[] a, int[] tmpArray,
            int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        // Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] <= a[rightPos]) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }
        }
        while (leftPos <= leftEnd) // Copy rest of first half
        {
            tmpArray[tmpPos++] = a[leftPos++];
        }
        while (rightPos <= rightEnd) // Copy rest of right half
        {
            tmpArray[tmpPos++] = a[rightPos++];
        }
        // Copy tmpArray back
        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }

    @Override
    public String toString() {
        return day + " / " + month + " / " + year;
    }
}
