public class TestMyDate {
    public static void main(String[] args){


        Car a = new Car("Seat",148);
        Car b = new Car("Peugeot",116);
        Car c = new Car("Toyota",8);
        Car e = new Car("BMW",147);
        Car f = new Car("Honda",219);
        System.out.println(Car.carCount);


        MyDate d = new MyDate();
        d.setDay(3);
        d.setMonth(4);
        d.setYear(2021);
        System.out.println(d.toString());

        d.setDate(1,8,1928);
        System.out.println(d.toString());

        MyDate d2 = new MyDate();
        System.out.println(d2.toString());

    }
}


