package my.antonov;


import my.antonov.database.DataBase;
import my.antonov.database.DataBaseManager;

public class App
{
    public static void main( String[] args ) {

        DataBase dataBase = DataBaseManager.getDataBaseConnection();
        if(dataBase.registrateNewPlayer("2zloi.mikrob", "1111", "2zzz@mail.ru"))
            System.out.println("Insert true");
        else
            System.out.println("Insert false");

        if(dataBase.autorization("2zloi.mikrob", "1111"))
            System.out.println("autorized true");
        else
            System.out.println("autorized false");
    }
}
