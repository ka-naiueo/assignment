package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> writerMap = new HashMap<>();

        writerMap.put("はらぺこあおむし", "エリック＝カール　1969年");
        writerMap.put("こんとあき", "林明子　1989年");
        writerMap.put("わたしのワンピース", "西巻茅子　1969年");
        writerMap.put("ぐりとぐら", "作・中川李枝子/絵・山脇百合子　1963年");

        Scanner scanner = new Scanner(System.in);
        System.out.print("絵本のタイトルを入力してください。");
        String title = scanner.nextLine();
        if (writerMap.containsKey(title)) {
            System.out.println(writerMap.get(title));
        } else {
            System.out.println("入力されたタイトルに該当する作者は存在しません。");
        }
    }
}

