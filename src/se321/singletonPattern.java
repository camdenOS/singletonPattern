package se321;

public class singletonPattern {
    private static singletonPattern instance;
    private void singletonPattern(){

    }

    public static singletonPattern getInstanceNum(){

        if (instance ==null){
            instance= new singletonPattern();
        }
        return instance;
    }


}
