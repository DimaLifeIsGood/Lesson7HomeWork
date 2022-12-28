public class Okrong implements Figure{
    int  radius;
    int pi;

    public Okrong(int radius, int pi) {
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    public int area() {
        return this.pi*this.radius*this.radius/2;
    }

    @Override
    public int perimeter() {
        return 2*this.pi*this.radius;
    }
}
