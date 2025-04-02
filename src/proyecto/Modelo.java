/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

public class Modelo {

    int arrayNumbers[];//se da el primer paso para crear el vector
    int lenghtArray;//se crea el largo delvector

    public int getLenghtArray() {//metodo para obtener el largo del vector
        return lenghtArray;//devolver el largo
    }

    public void setLenghtArray(int lenghtArray) {//metodo para crear el largo del vector
        this.lenghtArray = lenghtArray;//sacamos el largo
    }

    public int[] getArrayNumbers() {//metodo para obtener los numeros del array
        return arrayNumbers;//obtenemos los numeros
    }

    public void setArrayNumbers(int[] arrayNumbers) {//metodo para colocar un numero en el vector o array
        this.arrayNumbers = arrayNumbers;//igualamos
    }

    public void createArray() {//metodo para crear el vector
        arrayNumbers = new int[lenghtArray];//definimos al vector
    }

    public void loadData(int pos, int data) {//cargar el dato en la pocicion que queremos
        arrayNumbers[pos] = data;//se carga el dato
    }

    public int getData(int pos) {//conseguir la informacion de la pocicion dada
        return arrayNumbers[pos];//obtenemos
    }
}
