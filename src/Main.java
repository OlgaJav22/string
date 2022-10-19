public class Main {
    public static void main(String[] args) {

        System.out.println("\n" + "Задача 1" + "\n");

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("\n" + "Задача 2" + "\n");

        String fullNameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника, для заполнения отчета - " + fullNameBig);

        System.out.println("\n" +"Задача 3" +"\n");

        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println(fullName2);


    }
}