package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {

        HashMap<String, String> fruitList = new HashMap<String, String>() {
                {
                        put("apple", "リンゴ");
                        put("peach", "桃");
                        put("banana", "バナナ");
                        put("lemon", "レモン");
                        put("pear", "梨");
                        put("kiwi", "キウイ");
                        put("strawberry", "イチゴ");
                        put("grape", "ぶどう");
                        put("muscat", "マスカット");
                        put("cherry", "サクランボ");
                }
        };

        public String containsKey(String key) {
                        if (fruitList.containsKey(key)) {
                                System.out.println(key + "の意味は" + fruitList.get(key));
                        } else {
                                System.out.println(key + "は辞書に存在しません");
                        }

                return key;
        }
}