package gry.profil;

public class Main {

    public static void main(String[] args) {
        Human os1 = new Human();
            os1.firstName="Tomasz";
            os1.secondName= "Pielecki";
            os1.age= 34;
            os1.sex= "Male";
        System.out.println("Imie "+os1.firstName);
        System.out.println(os1);

        Characters ch1= new Characters();
        ch1.nickName="Manganis";
        ch1.lvl=80;
        ch1.skils="wind and earth power";

        System.out.println("How u had a lvl? "+ch1.lvl);
        System.out.println(ch1);

    }
}
