public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte malenkiyTip = 3;
        short tipPobolshe = 30000;
        int bolshoiTip = 300000;
        long vasheOgromniiTipZhest = 300000000L;
        float malenkiiTipSTochkoi = 1.5f;
        double tipSTochkoiPobolshe = 1.567651;
        System.out.println(malenkiyTip);
        System.out.println(tipPobolshe);
        System.out.println(bolshoiTip);
        System.out.println(vasheOgromniiTipZhest);
        System.out.println(malenkiiTipSTochkoi);
        System.out.println(tipSTochkoiPobolshe);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short totalPaper = 480;
        int totalPupil = firstTeacher + secondTeacher + thirdTeacher;
        System.out.println("На каждого ученика рассчитано " + totalPaper / totalPupil + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte inTwoMinutes = 16;
        int inOneMinute = inTwoMinutes / 2;
        System.out.println("За 20 минут машина произвела " + inOneMinute * 20 + " штук бутылок");
        int oneDay = 60 * 60 * 24;
        System.out.println("За 1 сутки машина произвела " + oneDay * inOneMinute + " штук бутылок");
        int threeDays = oneDay * 3;
        System.out.println("За 3 суток машина произвела " + threeDays * inOneMinute + " штук бутылок");
        long oneMonth = oneDay * 30;
        System.out.println("За 1 месяц машина произвела " + oneMonth * inOneMinute + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalJar = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int totalInOneClass = oneClassWhite + oneClassBrown;
        int totalClasses = totalJar / totalInOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalClasses * oneClassWhite + " банок белой краски и " + totalClasses * oneClassBrown + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        int totalBananas = bananaWeight * 5;
        int totalMilk = milkWeight * 2;
        int totalIceCream = iceCreamWeight * 2;
        int totalEggs = eggWeight * 4;

        int totalWeightInGr = totalBananas + totalMilk + totalIceCream + totalEggs;
        float totalWeightInKg = totalWeightInGr / 1000f;
        System.out.println("Общий вес завтрака " + totalWeightInGr + " грамм или " + totalWeightInKg + " килограмм");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte loseWeight = 7;
        int loseWeightInGr = loseWeight * 1000;
        short firstOption = 250;
        short secondOption = 500;
        System.out.println("Если худеть по 250 грамм в день, чтобы похудеть на 7 килограмм потребуется " + loseWeightInGr / firstOption + " дней");
        System.out.println("Если худеть по 500 грамм в день, чтобы похудеть на 7 килограмм потребуется " + loseWeightInGr / secondOption + " дней");
        System.out.println("В среднем на похудение на 7 килограмм потребуется " + (loseWeightInGr / firstOption + loseWeightInGr / secondOption) / 2 + " дней");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        float mashaPerMonth = 67760f;
        float denisPerMonth = 83690f;
        float kristinaPerMonth = 76230f;

        float mashaPerYear = mashaPerMonth * 12;
        float denisPerYear = denisPerMonth * 12;
        float kristinaPerYear = kristinaPerMonth * 12;

        float newMashaPerMonth = mashaPerMonth / 100 * 10 + mashaPerMonth;
        float newDenisPerMonth = denisPerMonth / 100 * 10 + denisPerMonth;
        float newKristinaPerMonth = kristinaPerMonth / 100 * 10 + kristinaPerMonth;

        float newMashaPerYear = mashaPerYear / 100 * 10 + mashaPerYear;
        float newDenisPerYear = denisPerYear / 100 * 10 + denisPerYear;
        float newKristinaPerYear = kristinaPerYear / 100 * 10 + kristinaPerYear;

        System.out.println("Маша теперь получает " + newMashaPerMonth + " рублей в месяц. Годовой доход вырос на " + (newMashaPerYear - mashaPerYear) + " рублей");
        System.out.println("Денис теперь получает " + newDenisPerMonth + " рублей в месяц. Годовой доход вырос на " + (newDenisPerYear - denisPerYear) + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaPerMonth + " рублей в месяц. Годовой доход вырос на " + (newKristinaPerYear - kristinaPerYear) + " рублей");

    }


}