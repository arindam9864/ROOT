public class predict {
    public static void main(String[] args) {
        boolean sunny = true;
        boolean hot = false;

        if (sunny) {
            if (hot) {
                System.out.println("Use cap & half sleeves");
            } else {
                System.out.println("Use half sleeves");
            }
        } else {
            System.out.println("Take a raincoat for safety");
        }
    }
}
