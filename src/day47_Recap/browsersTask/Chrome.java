package day47_Recap.browsersTask;

public final class Chrome extends Browser{ // Chrome Is A browser

    /*
    public final String name; //"John"
                             //"David"

    public Chrome(String name){
        this.name = name;
    }
    */

    @Override
    public void open() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }
}
