//Разобраться с паттерном Immutable и написать свой Immutable объект.
//За основу взять объект с полями: примитивы, Стринга, объект, массив примитивов, массив объектов.

package com.alex.jwd;
import java.util.Date;

public final class Immutable {

    private final int number;
    private final String word;
    private final Date date;
    private final int[] primitiveArr;
    private final Date[] objectArr;

    public Immutable(int number, String word, Date date, int[] primitiveArr, Date[] objectArr) {
        this.number = number;
        this.word = word;
        this.date = date;
        this.primitiveArr = primitiveArr;
        this.objectArr = objectArr;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    public Date getDate() {
        return (Date)date.clone();
    }

    public int[] getPrimitiveArr() {
        int[] copyArr = primitiveArr.clone();
        return copyArr;
    }

    public Date[] getObjectArr() {
        Date[] copyArr = objectArr.clone();
        return copyArr;
    }
}
