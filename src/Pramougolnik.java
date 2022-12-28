public class Pramougolnik implements Figure{
    int stronaA;
    int stronaB;

    public Pramougolnik(int stronaA, int stronaB) {
        this.stronaA = stronaA;
        this.stronaB = stronaB;
    }

    @Override
    public int area() {
        return this.stronaA*this.stronaB;
    }

    @Override
    public int perimeter() {
        return this.stronaA*2+this.stronaB*2;
    }
}
