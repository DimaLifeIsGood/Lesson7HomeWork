public class Treugolnik implements Figure{
    int stronaA;
    int stronaB;
    int stronaC;
    int wysota;

    public Treugolnik(int stronaA, int stronaB, int stronaC, int wysota) {
        this.stronaA = stronaA;
        this.stronaB = stronaB;
        this.stronaC = stronaC;
        this.wysota = wysota;
    }

    @Override
    public int area() {
        return this.stronaA*this.wysota/2;
    }

    @Override
    public int perimeter() {
        return this.stronaA+this.stronaB+this.stronaC;
    }
}
