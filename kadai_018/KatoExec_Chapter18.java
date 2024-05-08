package kadai_018;

abstract public class KatoExec_Chapter18 {
    public static void main(String[]args) {
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();

        taro.setGivenName();
        taro.exeIntroduce();

        System.out.println();

        hanako.setGivenName();
        hanako.exeIntroduce();

        System.out.println();

        ichiro.setGivenName();
        ichiro.exeIntroduce();

    }
}
