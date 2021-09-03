/**
 * Задача№ 2
 * Необходимо реализовать приложение на вход которого поступает текст, а на выходе выводится частотный словарь букв
 * латинского(английского) алфавита.
 */

public class FrequencyDictionaryOfLetters {
    public static void main (String [] args){
        String text = "Jane Austen\n" +
                "Pride and Prejudice\n" +
                "BOOK ONE\n" +
                "CHAPTER ONE\n" +
                "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.\n" +
                "However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered the rightful property of some one or other of their daughters.";

        frequencyDictionary(text);

    }

    public static void frequencyDictionary(String text){
        //т.к. текст может содержать строчные и заглавные буквы, то преобразуем его в нижний регистр (либо в верхний - по желанию)
        text = text.toLowerCase();

        //создадим массив символов, длина массива равна количеству букв английского алфавита
        int[] arrayChars = new int[26];

        //заполняем массив симвовали (буквами) из текста text
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                arrayChars[ch - 'a']++;
            }
        }
        //перебираем массив букв
        for(int i = 0; i < arrayChars.length; i++){
            System.out.println((char) (i + 'a') + " = " + arrayChars[i]);
        }
    }
}
