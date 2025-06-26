import java.util.Scanner;

public class evcChecking {
    public static void main(String[] args) {
        int pin = 2580;
        int balance = 23;
        int bankbalance = 230;
        int bankpin = 2552;
        String keednumber = "";
        String fariin = "[-EVCPlus] waxaad udirtay numberka ";
        String fariinlacag = " lacag dhan ";
        System.out.println("welcome to evc plus macmiil!#");
        System.out.println("");
        Scanner firstinput = new Scanner(System.in);
        String checkinput = firstinput.nextLine();

        //conditions
        if (checkinput.startsWith("*770") && checkinput.endsWith("#")){
            System.out.println("[-EVC-PlUS]");
            System.out.println("fadlan gali Pin-kaaga!");
            Scanner evcpin = new Scanner(System.in);
            int pinevc = evcpin.nextInt();

            if (pinevc == pin){
                System.out.println("EVC-PLUS");
                System.out.println("1. Balance Query");
                System.out.println("2. E-voucher");
                System.out.println("3. Bill Payment");
                System.out.println("4. Send Money");
                System.out.println("5. Mini statment");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Manage Account  ");
                System.out.println("8. Bill Payment");
                System.out.println("");
                Scanner inputop = new Scanner(System.in);
                int inputnum = inputop.nextInt();

                switch (inputnum){
                    case 1 :
                        System.out.println("[-EVC-Plus] haraagagu waa " + balance +"$");
                        break;
                    case 2:
                        System.out.println("E-voucher");
                        System.out.println("1. Self Airtime");
                        System.out.println("2. Friend Airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. self Data Reachange");
                        System.out.println("5. InternalNetwork Airtime");
                        System.out.println("");
                        Scanner E_voucherinout = new Scanner(System.in);
                        int e_vouinput = E_voucherinout.nextInt();
                        switch (e_vouinput){
                            case 1:
                                System.out.println("plz enter amount!");
                                Scanner vouinput = new Scanner(System.in);
                                double inputvou = vouinput.nextDouble();
                                if (inputvou > 0 && inputvou <balance){
                                    System.out.println("ma hubta inad ku shubanesid " + inputvou + " to undefined ?");
                                    System.out.println("1. yes");
                                    System.out.println("2. No");
                                    System.out.println("");
                                    Scanner selfinput = new Scanner(System.in);
                                    int inputself = selfinput.nextInt();
                                    switch (inputself){
                                        case 1:
                                            double airtimeresult = inputvou / 0.005;
                                            System.out.println("waxaad heshay " + inputvou + " ku hadal dhan " + airtimeresult + " daqiiqado" );
                                            break;
                                        case 2:
                                            System.out.println("mahadsanid!");
                                    }
                                }
                                else if (inputvou > balance) {
                                    System.out.println("haragagu kguma filna");
                                }
                                else {
                                    System.out.println("invalid input");
                                }
                                break;
                            case 2:
                                System.out.println("plz enter amount!");
                                Scanner frininput = new Scanner(System.in);
                                double inputfrind = frininput.nextDouble();
                                if (inputfrind > 0 && inputfrind < balance){
                                    System.out.println("enter friend number!");
                                    Scanner frnuminput = new Scanner(System.in);
                                    String inputnumfr = frnuminput.nextLine();
                                    if (inputnumfr.length() >= 6 && (inputnumfr.length() < 11)){
                                         keednumber = inputnumfr;
                                        System.out.println("ma hubta inad ku shubanesid " + inputnumfr + " to undefined ?");
                                        System.out.println("1. yes");
                                        System.out.println("2. No");
                                        System.out.println("");
                                        Scanner ckfrinput = new Scanner(System.in);
                                        int inputckfr = ckfrinput.nextInt();
                                        switch (inputckfr){
                                            case 1:
                                                System.out.println("-EVCPlus-] " + inputfrind + "$ waxaad ugu shubtay numberka " + inputnumfr );
                                                break;
                                            case 2:
                                                System.out.println("thanks!");
                                        }

                                    }

                                }

                                break;
                            default:
                                System.out.println("invalid menu");
                        }
                        break;

                    case 3:
                        System.out.println("Bill Payment");
                        System.out.println("1. Post Paid");
                        System.out.println("2. Pay Bill");
                        System.out.println("");
                        Scanner payinput = new Scanner(System.in);
                        int inputpay = payinput.nextInt();
                        switch (inputpay){
                            case 1:
                                System.out.println("Post Paid");
                                System.out.println("1. Query Bill Payment");
                                System.out.println("2. Pay Post Paid Bill");
                                System.out.println("3. Pay Friend Post Paid Bill");
                                System.out.println("");
                                Scanner post = new Scanner(System.in);
                                int postpaid = post.nextInt();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("plz enter mobile number");
                        System.out.println("");
                        Scanner moneyinpu = new Scanner(System.in);
                        String inputmoney = moneyinpu.nextLine();
                        if (inputmoney.length() >= 7 && inputmoney.length() <= 9){
                            System.out.println("plz enter amount");
                            System.out.println("");
                            Scanner amountinput = new Scanner(System.in);
                            double inputamount = amountinput.nextDouble();
                            if (inputamount > 0){
                                System.out.println("are you sure to send " + inputamount + " to " + inputmoney);
                                System.out.println("1. Yes ");
                                System.out.println("2. No ");
                                System.out.println("");
                                Scanner chooseinput = new Scanner(System.in);
                                int inputchoose = chooseinput.nextInt();
                                switch (inputchoose){
                                    case 1:
                                        double result1money = balance - inputamount;
                                        System.out.println(fariin + inputmoney + fariinlacag + inputamount+"$" +
                                                " haragagu waa " + result1money);
                                        break;
                                    case 2:
                                        System.out.println("mahadsanid!");
                                        break;
                                }
                            }
                            else if (inputamount < 0) {
                                System.out.println("invalid money! ");
                            }
                        }
                        else {
                            System.out.println("not exist number");

                        }
                        break;
                    case 5:
                        System.out.println("Mini statment");
                        System.out.println("1. Last Action");
                        System.out.println("2. Last Transfer");
                        System.out.println("3. Last Payment");
                        System.out.println("4. Last 3 transactions");
                        System.out.println("5. Email Me My Activity");
                        System.out.println("");
                        Scanner miniinput = new Scanner(System.in);
                        int inputmini = miniinput.nextInt();
                        switch (inputmini){
                            case 1:
                                int lastaction ;
                                System.out.println(fariin  + keednumber + fariinlacag );
                                break;
                            case 2:
                                System.out.println("statment of:");
                                System.out.println("1. Sent");
                                System.out.println("2. Received");
                                System.out.println("");
                                Scanner inpuState = new Scanner(System.in);
                                int stateinput = inpuState.nextInt();
                                switch (stateinput){
                                    case 1:
                                        System.out.println("plz enter the number phone");
                                        System.out.println("");
                                        Scanner sentinput = new Scanner(System.in);
                                        int inputsent = sentinput.nextInt();
                                        break;
                                    case 2:
                                        System.out.println("plz enter the number phone");
                                        System.out.println("" );
                                        break;
                                }
                                break;
                            default:
                                System.out.println("invalid input");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("salaam Bank");
                        System.out.println("1. My Balance");
                        System.out.println("2. Move to Bank");
                        System.out.println("3. Move from Bank");
                        System.out.println("4. Transfer from EVCplus");
                        System.out.println("");
                        Scanner bankinput = new Scanner(System.in);
                        int inputbank = bankinput.nextInt();
                        switch (inputbank){
                            case 1:
                                System.out.println("your bank balance is: " + bankbalance + "$");
                                break;
                            case 2:
                                System.out.println("My Bank account");
                                System.out.println("1. deposit money");
                                System.out.println("2. Withdrawal money");
                                System.out.println("3. Transfer money");
                                System.out.println("4. Statementes");
                                System.out.println("");
                                Scanner bankaccinpu = new Scanner(System.in);
                                int inputbankacc = bankaccinpu.nextInt();
                                switch (inputbankacc){
                                    case 1:
                                        System.out.println("deposit");
                                        System.out.println("enter you money deposit!");
                                        Scanner depinput = new Scanner(System.in);
                                        int inputdep = depinput.nextInt();
                                        if (inputdep >0){
                                            double depresult = bankbalance + inputdep;
                                            System.out.println("your new balance bank account is: " + depresult + "$");
                                        }
                                        else {
                                            System.out.println("invalid amount");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Withdrawal");
                                        System.out.println("how many amount you withdraw");
                                        Scanner withinput = new Scanner(System.in);
                                        int inputwidth = withinput.nextInt();
                                        if (inputwidth > 0 && inputwidth <bankbalance){
                                            double withresult = bankbalance - inputwidth;
                                            System.out.println("you wthdraw amount + " + inputwidth+"$ " +
                                            " you balance acc now is: " + withresult);
                                        }
                                        else if (inputwidth > bankbalance) {
                                            System.out.println("your bank balance is not enougth");
                                        }
                                        else {
                                            System.out.println("invalid amount");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Transfer");
                                        System.out.println("enter th bank acc number");
                                        System.out.println("");
                                        Scanner traninput = new Scanner(System.in);
                                        String inputtran = traninput.nextLine();
                                        if (inputtran.length() == 10 || inputtran.length() == 15){
                                            System.out.println("enter the amount");
                                            Scanner tranamountinpt = new Scanner(System.in);
                                            double inputranamount = tranamountinpt.nextDouble();
                                            if (inputranamount > 0 && inputranamount < bankbalance){
                                                double bankresult = bankbalance - inputranamount;
                                                System.out.println("you sent the bank acc " + inputtran + " the money " + inputranamount + "$" +
                                                        " your new balance acc is " + bankresult + "$");
                                            }
                                            else if (inputranamount > bankbalance) {
                                                System.out.println("your bank balance not enougth");
                                            }
                                            else {
                                                System.out.println("invalid amount");
                                            }

                                        }
                                        else {
                                            System.out.println("invalid number account");
                                        }
                                }

                        }
                        break;
                    case 7:
                        System.out.println("Manage Account");
                        System.out.println("1. change the pin");
                        System.out.println("2. change the language");
                        System.out.println("3. Report Lost");
                        System.out.println("4. Block Transaction");
                        System.out.println("5. Return Transaction");
                        System.out.println("");
                        Scanner mangeinput = new Scanner(System.in);
                        int inputmange = mangeinput.nextInt();
                        switch (inputmange){
                            case 1:
                                System.out.println("Plz enter your new pin");
                                System.out.println("");
                                Scanner pininput = new Scanner(System.in);
                                String inputpin = pininput.nextLine();
                                String newpin =  inputpin;
                                if (inputpin.length() == 4){
                                    System.out.println("confirm new pin");
                                    System.out.println("");
                                    Scanner conpininput = new Scanner(System.in);
                                    String inputpincon = conpininput.nextLine();
                                    if (inputpincon.equals(newpin)){
//                                        String newpin = "";
                                        System.out.println("-EVCPlus-] you successfuly change your pin");
                                    }
                                    else {
                                        System.out.println("you enter wrong confirm pin");
                                    }
                                }
                                else {
                                    System.out.println("you have to enter 4 length pin");
                                }
                                break;
                            case 2:
                                System.out.println("chnage the language");
                                System.out.println("1. Soomaali");
                                System.out.println("2. English");
                                System.out.println("");
                                Scanner laninput = new Scanner(System.in);
                                int inputlan = laninput.nextInt();
                                switch (inputlan){
                                    case 1:
                                        System.out.println("[-EVCPlus-] waxad ku gulesatay ina luqadada badasho");
                                        break;
                                    case 2:
                                        System.out.println("-EVCPlus-] you successfuly changed language");
                                }

                        }
                        break;
                    case 8:
                        System.out.println("");
                    default:
                        System.out.println("plz select valid option");
                }

            }
            else {
                System.out.println("warning Pin-ka galisay mahan mid sax ah!");
            }
        }
        if(checkinput.startsWith("*712") && (checkinput.endsWith("*"))){
            System.out.println("gali numberka!");
            Scanner num = new Scanner(System.in);
            String sendernum = num.nextLine();
            if (sendernum.length () == 9 || sendernum.length() == 10 || sendernum.length() == 7){
                System.out.println("gali lacagta!");
                Scanner money = new Scanner(System.in);
                double sendermoney = money.nextDouble();
                if (sendermoney <= balance && sendermoney > 0){
                    System.out.println("gali pin kaaga ");
                    Scanner pininput = new Scanner(System.in);
                    int userinput = pininput.nextInt();
                    if (userinput == pin){
                        double resultmoney = balance - sendermoney;
                        System.out.println("-[EVC-PLUS]waxaad udirtay numberka " + sendernum + " lacag dhan "+
                                sendermoney + "$");
                        System.out.println("haraagagu waa " + resultmoney + " $");
                    }
                    else {
                        System.out.println("warning!! pin ka galisay mahan mid sax ah");
                    }
                }
                if (sendermoney <= 0){
                    System.out.println("something went wrong!! ");
                }
                if (sendermoney > balance){
                    System.out.println("haraagaga kguma filna!");
                }
            }
            else if (sendernum.length() < 8) {
                System.out.println("number ka galisay wu qaldan yhy");
            }
            else if (sendernum.length() > 10) {
                System.out.println("numberkan mahan mid jira!");
            }
        }
        if (checkinput.startsWith("*711") && checkinput.endsWith("#")){
            System.out.println("fadlan gali pin-kaga");
            Scanner checkpin = new Scanner(System.in);
            int pincheck = checkpin.nextInt();
            if (pincheck == pin){
                System.out.println("[-EVC-PLUS] haragaagu waa " + balance + "$");
            }
            else {
                System.out.println("warning! pin ka galisay wu qaldan yahay");
            }
        }
        else {
            System.out.println("qaabka ugalisay waa qalad!!! " );
        }
    }
}
