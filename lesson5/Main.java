package lesson5;

public class Main {
    public static void main(String[] args) {



    Person pers1 = new Person("Ivanov Ivan Ivanovich", 30, "manager", "man@mail.com", " +23897654321", 15000);
    Person pers2 = new Person("Petrov Petr Petrovich", 25, "engeneer", "help@info.ru", "+36987456321", 20000);
    Person pers3 = new Person("Sidorov Sergey Prtrovich", 52, "counter", "count@1.ru", "+86321789", 30000);
    Person pers4 = new Person("Perov Oleg Gennadievich", 48, "developer", "dev@op.ru", "456321789", 50000);
    Person pers5 = new Person("Tom Miller", 60, "general menager", "own@ip.ty", "7891236321", 100_000);

        Person[] persArr= new Person[]{pers1,pers2,pers3,pers4,pers5};
        for (Person x:persArr){
            if (x.getAge()>40){
                System.out.println(x);

        }



        }




}
}
