import Animals.*;

public class Main {
    public static void main(String[] args) {

        Car.Key audiKey = new Car.Key(true, true);
        Car.Key bmwKey = new Car.Key(true, true);
        Car.Key kiaKey = new Car.Key(false, true);
        Car.Key huyndaiKey = new Car.Key(true, false);



        Car audi = new Car("Audi",
                "A8",
                3.0,
                "черный",
                2020,
                250,
                "Германия",
                "седан",
                "автомат",
                "х000хх000",
                true,
                audiKey,
                "ЭлектроКар");

        Car bmw = new Car("Bmw",
                "Z8",
                3.0,
                "черный",
                2021,
                180,
                "Германия",
                "автомат",
                "седан",
                "х000хх000",
                true,
                bmwKey,
                "Бензин");

        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                190,
                "Южная Корея",
                "автомат",
                "кроссовер",
                "х000хх000",
                false,
                kiaKey,
                "Дизель");

        Car hyundai = new Car("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                200,
                "Южная Корея",
                "автомат",
                "седан",
                "х00хх000",
                true,
                huyndaiKey,
                "дизель");



        Train martin = new Train(
                "Ласточка",
                "В-901",
                2011,
                "Россия",
                null,
                301,
                3500,
                null,
                "Белорусский вокзал",
                "Минск",
                11,
                "Дизель");

        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                null,
                270,
                1700,
                null,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8,
                "Дизель");


        System.out.println(martin.toString());
        System.out.println(leningrad.toString());

        Bus paz = new Bus("ПАЗ", "32053", 2022, "Россия", "Белый", 90, "Бензин");
        System.out.println(paz.toString());
        Bus maz = new Bus("Маз", "203", 2019, "Россия", "Красный", 106, "Дизель");
        System.out.println(maz.toString());
        Bus nefaz = new Bus("Нефаз", "5299", 2016, "Россия", "Синий", 90, "Дизель");
        System.out.println(nefaz.toString());

        nefaz.reFill();
        audi.reFill();
        System.out.println(audi.toString());
        bmw.reFill();
        System.out.println(bmw.tires);
        System.out.println(bmw.changeTires());

        //травоядные

        Herbivores gazelle = new Herbivores("Газель", 3, "Африка", 50, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 5, "Африка", 60, "трава");
        Herbivores horse = new Herbivores("Лошадь", 4, "Степь", 88, "трава");
        System.out.println(gazelle.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());


        //хищники

        PredatoryAnimals hyena = new PredatoryAnimals("Гиена",2, "Африка", 64, "мясо");
        PredatoryAnimals tiger = new PredatoryAnimals("Тигр", 3, "Россия", 60, "мясо");
        PredatoryAnimals bear = new PredatoryAnimals("Медведь", 5, "Россия", 56, "мясо");
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());
        bear.hunt();
        tiger.hunt();

        //амфибии

        Amphibians frog = new Amphibians("Лягушка", 1, "Россия");
        Amphibians snake = new Amphibians("Уж пресноводный", 2, "Россия");
        frog.sleep();
        frog.hunt();

        //птицы нелетающие

        NotFlyBirds peacock = new NotFlyBirds("Павлин", 2, "Индия", "наземный");
        NotFlyBirds penguin = new NotFlyBirds("Пингвин", 3, "Антарктика", "наземный");
        NotFlyBirds dodo = new NotFlyBirds("Птица ДоДо", 1, "Маврикий", "наземный");
        dodo.move();
        //птицы летающие

        FlyBirds gull = new FlyBirds("Чайка", 1, "Россия", "Летающий");
        FlyBirds albatros = new FlyBirds("Альбатрос", 2, "Южный океан", "Летающий");
        FlyBirds falcon = new FlyBirds("Сокол", 3, "Тайга", "Летающий");



        System.out.println(hyundai.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println();
        hyundai.checkRegNumber();
        bmw.checkRegNumber();
        System.out.println(hyundai.getRegNumber());
        hyundai.reFill();


    }





}