package kadai_018;

abstract  public class Kato_Chapter18 {
    String familyName;
    String givenName;
    String address;

    public void commonIntroduce(String familyName, String address){
//        System.out.println(familyName);
//        System.out.println(address);
          familyName = "加藤";
          address = "住所は東京都中野区〇×です";

    }

    abstract public void eachIntroduce();

    public void exeIntroduce(){

    }

    public void setGivenName(){

    }


}
