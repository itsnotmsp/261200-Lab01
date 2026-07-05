public class Main {
    public static void main(String[] args) {

        Turtle myUmbrella = new Turtle();
        myUmbrella.speed(5);

        myUmbrella.penColor("yellow");
        myUmbrella.width(3);

        myUmbrella.up();
        myUmbrella.setPosition(-120, 100);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.up();
        myUmbrella.setPosition(-80, 130);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.up();
        myUmbrella.setPosition(-40, 145);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.up();
        myUmbrella.setPosition(0, 150);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.up();
        myUmbrella.setPosition(40, 145);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.up();
        myUmbrella.setPosition(80, 130);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.up();
        myUmbrella.setPosition(120, 100);
        myUmbrella.down();
        myUmbrella.dot("yellow", 110);

        myUmbrella.penColor("yellow");
        myUmbrella.width(90);
        myUmbrella.up();
        myUmbrella.setPosition(-120, 90);
        myUmbrella.down();
        myUmbrella.forward(240);

        myUmbrella.penColor("black");
        myUmbrella.width(4);
        myUmbrella.up();
        myUmbrella.setPosition(-130, 45);
        myUmbrella.down();
        myUmbrella.forward(260);

        myUmbrella.up();
        myUmbrella.setPosition(0, 45);
        myUmbrella.right(90);
        myUmbrella.down();
        myUmbrella.forward(150);

        for (int i = 0; i < 18; i++) {
            myUmbrella.forward(5);
            myUmbrella.left(10);
        }
    }
}