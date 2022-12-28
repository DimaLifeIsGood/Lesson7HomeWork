public class Main {
    public static void main(String[] args) {
        Okrong okr1=new Okrong(22,3);
        Okrong okr2=new Okrong(30,3);
        Treugolnik treugolnik1=new Treugolnik(5,6,7,8);
        Pramougolnik pramougolnik1=new Pramougolnik(4,5);
        Pramougolnik pramougolnik2= new Pramougolnik(3,9);

        Figure[] massiw = {okr1,okr2,treugolnik1,pramougolnik1,pramougolnik2};
        int areaSum = okr1.area()+ okr2.area()+ treugolnik1.area()+ pramougolnik1.area()+ pramougolnik2.area();
        System.out.println("Summa figur massiwa ="+areaSum);
        int perimetr = okr1.perimeter()+ okr2.perimeter()+ treugolnik1.perimeter()+ pramougolnik1.perimeter()+ pramougolnik2.perimeter();
        System.out.println("Summa perimetra massiwa = "+perimetr);
    }
}