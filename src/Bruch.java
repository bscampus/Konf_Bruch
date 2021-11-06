public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        double decimal = ((double) this.numerator / (double) this.denominator);
       //double rest = this.numerator%this.denominator;
        return decimal;
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        String bruch = "Bruch: " + numerator+ "/" +denominator;
        //System.out.println("Bruch: " + numerator+ "/" +denominator);
        return bruch;
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */

        Bruch b = new Bruch(this.numerator *b2.getNumerator(),
                this.denominator *b2.getDenominator());
        return b;

    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        Bruch b = new Bruch(this.numerator *b2.getNumerator() * b3.getNumerator(),
                this.denominator *b2.getDenominator()* b3.getDenominator());
        return b;
    }
}
