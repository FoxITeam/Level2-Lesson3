package ru.foxit.grayfox;

//        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив
//        (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создаем массив из 20 сотрудников, 14 уникальных сотрудников, 6 повторяющихся.
        ArrayList<String> worker = new ArrayList<>();
        // Заполняем массив
        worker.add("Захаров");
        worker.add("Володин");
        worker.add("Иванов");
        worker.add("Кукушкин");
        worker.add("Петрук");
        worker.add("Володин");
        worker.add("Лаптин");
        worker.add("Ларинов");
        worker.add("Авинкин");
        worker.add("Петрук");
        worker.add("Хиценко");
        worker.add("Курьянов");
        worker.add("Панов");
        worker.add("Кассиль");
        worker.add("Зотова");
        worker.add("Захаров");
        worker.add("Юрьев");
        worker.add("Володин");
        worker.add("Петрук");
        worker.add("Иванов");

        Map<String, Integer> map = countWords(worker);

        for (Map.Entry<String, Integer > pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue() + " раз(а)  встречается слово.");
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {

        HashMap<String, Integer> result = new HashMap<String, Integer>();

        // Проверка на уникальность слова
        for (String word : list) {
            result.put(word, result.containsKey(word) ? result.get(word) + 1 : 1);
        }
        return result;

    }
}