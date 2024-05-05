package kadai_015;

public class Car_Chapter15 {
    private int gear = 0;
    private int speed = 0;

    public Car_Chapter15 (int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void gearChange(int afterGear){
        System.out.println("ギア" +gear+ "から" + afterGear + "切り替えました");
        this.gear = afterGear;
    }

    public void run(){
//        switch (this.gear) {
//            case 2:
//                System.out.println("速度は時速" + 20 + "kmです");
//                break;
//            case 3:
//                System.out.println("速度は時速" + 30 + "kmです");
//                break;
//            case 4:
//                System.out.println("速度は時速" + 40 + "kmです");
//                break;
//            case 5:
//                System.out.println("速度は時速" + 50 + "kmです");
//                break;
//            default:
//                System.out.println("速度は時速" + 100 + "kmです");
//                break;
//        }

        if (this.gear == 2){
            System.out.println("速度は時速" + 20 + "kmです");
        } else if (this.gear == 3) {
            System.out.println("速度は時速" + 30 + "kmです");
        }  else if (this.gear == 4) {
            System.out.println("速度は時速" + 40 + "kmです");
        } else if (this.gear == 5) {
            System.out.println("速度は時速" + 50 + "kmです");
        } else {
            System.out.println("速度は時速" + 100 + "kmです");
        }
    }
}
