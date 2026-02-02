package JavaNotion.AnoymousClass;

interface Animal{
    void doShitNoiseThing();
}

public class AnonymousClass_Example {
    public static void main(String[] args){
        //Su dung anonymousClass de implement interface

        Animal animal = new Animal() {
            @Override
            public void doShitNoiseThing() {
                System.out.println("Jerking off");
            }
        };
        animal.doShitNoiseThing();
    }
}
