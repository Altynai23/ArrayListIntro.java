package day47_Recap.phoneTask;

public class IPhone extends Phone{

    public IPhone(String brand, String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void call(long phoneNumber){
        System.out.println("Apple iphone is calling "+phoneNumber);
    }

    public void call(long phone1, long phone2){
        call(phone1);
        call(phone2);
    }

    public void call(long phone1, long phone2, long phone3){
        call(phone1, phone2);
        call(phone3);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Apple' iphone is texting to "+phoneNumber);
    }

public void faceTime(long phoneNumber){
    System.out.println("Apple's iphone is face timing with "+phoneNumber);
}

}
