package day47_Recap.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {
        IPhone iphone = new IPhone("12", "large", "Black", 1100);
        iphone.call(911);
        iphone.call(123456,911, 789456);
        iphone.text(123456789);
        iphone.faceTime(123456789);
        // iphone.freeze();

        System.out.println(iphone);
        System.out.println("-----------------------------------------------------");

        Samsung samsung = new Samsung("galaxy s6", "extra large", "White", 1000);
        samsung.call(123456789);
        samsung.text(123456);
        samsung.text(987456, 852369);
        samsung.text(741258, 963147, 852147);
        samsung.freeze();
        // samsung.faceTime(123456789);

        System.out.println(samsung);
        System.out.println("-------------------------------------------------------");

        Nokia nokia = new Nokia("Brick", "small", "Gray", 50);
        nokia.call(896523);
        nokia.text(8547126);
        nokia.selfDefense();
        nokia.breakTheFloor();
        //   nokia.freeze();
        //   nokia..faceTime(123456789);

        System.out.println(nokia);

        nokia.setPrice(75);
        nokia.setColor("Blue");
        System.out.println(nokia.getPrice());

        System.out.println(nokia);


    }



}
