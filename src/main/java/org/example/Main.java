package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> writerMap = new HashMap<>();

        writerMap.put("The very Hungry Caterpillar", "Eric Carle　1969");
        writerMap.put("Amy and Ken Visit Grandma", "Akiko Hayashi　1989");
        writerMap.put("My new dress", "Kayako Nisimaki　1969");
        writerMap.put("Guri and Gura", "Rieko Nakagawa and Yuriko Yamakawa　1963");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the title of the picture book");
        String title = scanner.nextLine();
        if (writerMap.containsKey(title)) {
            System.out.println(writerMap.get(title));
        } else {
            System.out.println("Not found");
        }
    }
}

