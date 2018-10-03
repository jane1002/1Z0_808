package ch03;

public class Q102 {

    public static void main(String args[]) {
        Alpha a = new Alpha(args);
        a.main();

    }
}

class Alpha {
    public String[] main = new String[2];

    public Alpha(String[] main) {
        for( int i = 0; i < main.length; i++) {
            this.main[i] = main[i] + 5;
        }
    }
    public void main() {
        System.out.println(main[0] + main[1]);
    }
}
