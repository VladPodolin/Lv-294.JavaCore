package task1;

public class Main {

    public static void main(String[] args) {
        Bird[] bird = new Bird[4];
        bird[0] = new Eagle("black", 5);
        bird[1] = new Swallow("gray", 10);
        bird[2] = new Chicken("red", 30);
        bird[3] = new Penguin("black and white", 1);

        for (int i = 0; i < bird.length; i++) {
            System.out.println(bird[i].getClass().getSimpleName() + " feathers is "
                    + bird[i].getFeathers() + ", it produces " + bird[i].getLayEggs() +
                    " eggs. It can fly: " + bird[i].fly());
            System.out.println();
        }
    }
}
