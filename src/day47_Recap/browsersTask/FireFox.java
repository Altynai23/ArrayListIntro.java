package day47_Recap.browsersTask;

public final class FireFox extends Browser{ // FireFox Is A browser


    @Override
    public void open() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox browser");
    }
}
