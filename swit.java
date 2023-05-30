public class swit {
    public static void main(String[] args) {
        int days=31;
        switch(days){
            case 31:
                System.out.println("January,March,May,July,August,October,December");
                break;
            case 30:
                System.out.println("April,June,September,Novemnber");
                break;
            case 29:
                System.out.println("February");
                break;
            default:
                System.out.println("Enter valid days");
        }
    }
}
