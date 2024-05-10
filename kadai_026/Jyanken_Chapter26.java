package kadai_026;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.round;

public class Jyanken_Chapter26 {

    public String getMyChoice() {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            String input = scanner.nextLine();


            if (!input.equals("s")&&!input.equals("r") && !input.equals("p") ) {
                System.out.println("もう一度自分のじゃんけん手を選れんでください。");
                continue;
            } else {

                System.out.println(input + "を選びました。");
            }

            return input;

        }
    }


    public String getRandom(){
        String [] hands = {"r","s","p"};

        String random = hands [(int) Math.floor(Math.random()*3)];
        return random;
    }

    public  void playGame(){
        HashMap<String,String> hashMap = new HashMap<>();
            {
                hashMap.put("r", "グ");
                hashMap.put("s", "チョキ");
                hashMap.put("p", "パー");
            }

            String myChoice = getMyChoice();
            String choice = getRandom();

        System.out.println(" 自分の手は" + myChoice + "対戦相手の手は" + choice);

            if (myChoice.equals(choice)){
                System.out.println("あいこです");
            }else if (myChoice.equals("r") && choice.equals("s") || myChoice.equals("s") && choice.equals("p")  ||
                    myChoice.equals("p") && choice.equals("r")){
                System.out.println("自分の勝ちです");
        } else {
                System.out.println("自分の負けです");
            }
    }

}
