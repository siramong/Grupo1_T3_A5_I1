/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

public class Modelo {

    int arrayNumbers[];
    int lenghtArray;

    public int getLenghtArray() {
        return lenghtArray;
    }

    public void setLenghtArray(int lenghtArray) {
        this.lenghtArray = lenghtArray;
    }

    public int[] getArrayNumbers() {
        return arrayNumbers;
    }

    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    public int createArray() {
        arrayNumbers = new int[lenghtArray];
        return 400;
    }

    public void loadData(int pos, int data) {
        arrayNumbers[pos] = data;
    }

    public int getData(int pos) {
        return arrayNumbers[pos];
    }
}
