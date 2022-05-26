//Weight in kg.
//Height in metres.
public class sample {
    public static void main (String[] args) {
        humanIMB humanIMB = new humanIMB(80,1.52);
        System.out.println(humanIMB.Result());
    }
}
class humanIMB {
    public double W; //Weight Human
    public double H; // Height Human
    private static double imb;
    public humanIMB(double w, double h) {
        W = w;
        H = h;
        imb = W / (H * H);
    }

    public static String Result() {
        String  string = null;
        if (imb >=18.5 & imb <25) {
            string ="Норма, ты в форме!";
        }
        if (imb >=25 & imb <30) {
            string ="Предожирение. Эй, поосторожнее с пирожными ";
        }
        if (imb >=30) {
            string ="Ожирение. SCHWEINE! Хватит жрать, иди на треню!";
        }
        if (imb <18.5) {
            string ="Дефицит массы тела. В модели решил переквалифицироваться?";
        }
        return string;
    }
}