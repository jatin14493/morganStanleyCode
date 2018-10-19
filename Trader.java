package MorganStanleyProject;

import java.util.Scanner;

public class Trader implements Runnable {



    public static void main(String[] args) throws InterruptedException {

        Scanner s = new Scanner(System.in);
        int numOfTraderRequest = s.nextInt();

        while(numOfTraderRequest-- > 0){

            Trader test = new Trader();
            DivisionHead divisionHead = new DivisionHead();
            Operations operations = new Operations();

            Thread t1 = new Thread(test);
            Thread t2 = new Thread(divisionHead);
            Thread t3 = new Thread(operations);


            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();

            System.out.println("6. Funds Released!!");


        }
    }

    public void run()
    {

        System.out.println("1. Trader Executes a request");

        FundManager fundManager = new FundManager();
        ResearchAnalyst researchAnalyst = new ResearchAnalyst();

        // creation of child thread
        Thread t1 = new Thread(fundManager);
        Thread t2 = new Thread(researchAnalyst);

        t1.start();
        t2.start();

    }
}
