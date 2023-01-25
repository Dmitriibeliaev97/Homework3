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
        int paperForOnePupil = totalPaper / totalPupil;
        System.out.println("На каждого ученика рассчитано " + paperForOnePupil + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte inTwoMinutes = 16;
        byte minutes = 2;
        int inOneMinute = inTwoMinutes / minutes;
        int twelveMinute = inOneMinute * 20;
        int oneHour = twelveMinute * 3;
        int oneDay = oneHour * 24;
        int threeDays = oneDay * 3;
        int oneMonth = threeDays * 10;
        System.out.println("За 20 минут машина произвела " + twelveMinute + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + threeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalJar = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int totalInOneClass = oneClassWhite + oneClassBrown;
        int totalClasses = totalJar / totalInOneClass;
        int needWhite = totalClasses * oneClassWhite;
        int needBrown = totalClasses * oneClassBrown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + needWhite + " банок белой краски и " + needBrown + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;

        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        int totalWeightInGr = bananas * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + eggs * eggWeight;
        float totalWeightInKg = totalWeightInGr / 1000f;
        System.out.println("Общий вес завтрака " + totalWeightInGr + " грамм или " + totalWeightInKg + " килограмм");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte loseWeight = 7;
        int loseWeightInGr = loseWeight * 1000;
        short firstOption = 250;
        short secondOption = 500;
        double lose250PerDay = (double) loseWeightInGr / firstOption;
        double lose500PerDay = (double) loseWeightInGr / secondOption;
        double loseWeightPerDayMiddle = (double) (firstOption + secondOption) / 2;
        double middleLose = (double) loseWeightInGr / loseWeightPerDayMiddle;
        System.out.println("Если худеть по 250 грамм в день, чтобы похудеть на 7 килограмм потребуется " + lose250PerDay + " дней");
        System.out.println("Если худеть по 500 грамм в день, чтобы похудеть на 7 килограмм потребуется " + lose500PerDay + " дней");
        System.out.println("В среднем на похудение на 7 килограмм потребуется " + middleLose + " дней");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaPerMonth = 67760;
        int denisPerMonth = 83690;
        int kristinaPerMonth = 76230;

        double indexPercent = 1.1;

        double mashaPerYear = mashaPerMonth * 12;
        double denisPerYear = denisPerMonth * 12;
        double kristinaPerYear = kristinaPerMonth * 12;

        double newMashaPerMonth = mashaPerMonth * indexPercent;
        double newDenisPerMonth = denisPerMonth * indexPercent;
        double newKristinaPerMonth = kristinaPerMonth * indexPercent;

        double newMashaPerYear = mashaPerYear * indexPercent;
        double newDenisPerYear = denisPerYear * indexPercent;
        double newKristinaPerYear = kristinaPerYear * indexPercent;



        System.out.println("Маша теперь получает " + newMashaPerMonth + " рублей в месяц. Годовой доход вырос на " + (newMashaPerYear - mashaPerYear) + " рублей");
        System.out.println("Денис теперь получает " + newDenisPerMonth + " рублей в месяц. Годовой доход вырос на " + (newDenisPerYear - denisPerYear) + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaPerMonth + " рублей в месяц. Годовой доход вырос на " + (newKristinaPerYear - kristinaPerYear) + " рублей");

    }


}