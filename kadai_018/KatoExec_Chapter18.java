package kadai_018;

abstract public class KatoExec_Chapter18 {
    public static void main(String[]args) {
        Kato_Chapter18 taro = new KatoTaro_Chapter18();
        Kato_Chapter18 hanako = new KatoHanako_Chapter18();
        Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();

        taro.familyName = "加藤";
        taro.address = "住所は東京都中野区〇×です";
        taro.givenName = "太郎";
        System.out.println("名前は" + taro.familyName + taro.givenName+ "です");
        System.out.println(taro.address);
        taro.eachIntroduce();

        ichiro.familyName = "加藤";
        ichiro.givenName = "一郎";
        ichiro.address = "住所は東京都中野区〇×です";
        System.out.println("名前は" + ichiro.familyName + ichiro.givenName+ "です");
        System.out.println(ichiro.address);
        ichiro.eachIntroduce();


        hanako.familyName =  "加藤";
        hanako.givenName =  "花子";
        hanako.address =  "住所は東京都中野区〇×です";
        System.out.println("名前は" + hanako.familyName + hanako.givenName+ "です");
        System.out.println(hanako.address);
        hanako.eachIntroduce();
    }
}
