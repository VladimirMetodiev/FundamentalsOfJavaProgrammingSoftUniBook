package Methods;

public class BlankReceipt {
    static void printBlank(){
        getHeader();
        getBody();
        getFooter();
    }
    static void getHeader(){
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }
    static void getBody(){
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }
    static void getFooter(){
        System.out.println("------------------------------");
        System.out.println("(c) SoftUni");
    }
    public static void main(String[] args){
        printBlank();
    }
}
