public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog=8.0;
        System.out.println("Собака "+ dog);
        var cat=3.6;
        System.out.println("Кошка "+ cat);
        var paper=763789;
        System.out.println("Бумага "+ paper);

        dog=dog+4;
        System.out.println("Собака "+ dog);
        cat=cat+4;
        System.out.println("Кошка "+ cat);
        paper=paper+4;
        System.out.println("Бумага "+ paper);

        var resault1=dog-3.5;
        System.out.println("Собака "+ resault1);
        var resault2=cat-1.6;
        System.out.println("Кошка "+ resault2);
        var resault3=paper-7639;
        System.out.println("Бумага "+ resault3);

        var friend=19;
        System.out.println("Друг "+ friend);
        friend=friend+2;
        System.out.println("Друг "+ friend);
        friend=friend/7;
        System.out.println("Друг "+ friend);

        var frog=3.5;
        System.out.println("Лягушка "+ frog);
        frog=frog*10;
        System.out.println("Лягушка "+ frog);
        frog=frog/3.5;
        System.out.println("Лягушка "+ frog);
        frog=frog+4;
        System.out.println("Лягушка "+ frog);

        var boxer1=78.2;
        var boxer2=82.7;
        var totalWeight=boxer1+boxer2;
        System.out.println("Общая масса "+ totalWeight+"кг");
        var weightDifference=boxer2-boxer1;
        System.out.println("Разница в весе "+ weightDifference+"кг");
        var overWeight=boxer2%boxer1;
        System.out.println("Разница в весе "+overWeight+"кг");

        var hours=640;
        var workTime=8;
        var workers=hours/workTime;
        System.out.println("Всего работников в компании-"+workers+" человек" );

        var worker=workers+94;
        var hour=worker*workTime;
        System.out.println("Если в компании работает "+ worker+" человека, то всего "+hour+" часов работы может быть поделено между сотрудниками");








    }
}