public class Clothing {
    int buttonKol;
    int timeSew;
    int timeDarn;
    int toFix;

    public Clothing(int buttonKol, int timeSew, int timeDarn, int toFix) {
        this.buttonKol = buttonKol;
        this.timeSew = timeSew*buttonKol;
        this.timeDarn = timeDarn;
        this.toFix = toFix;
    }
}
