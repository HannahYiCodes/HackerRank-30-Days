package notesthirtydays.nestedlogic;

public class NestedLogic {
    // Investigate First
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner in = new Scanner(System.in);
//        String returnedDateStr = in.nextLine();
//        String dueDateStr = in.nextLine();
//        int fine = 0;
//
//        List<Integer> rd = Arrays.asList(returnedDateStr.split("\\s")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
//
//        List<Integer> d = Arrays.asList(dueDateStr.split("\\s")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
//
//        if(rd.get(2).equals(d.get(2)) && rd.get(1).equals(d.get(1)) && rd.get(0) > d.get(0)) {
//            //check diff between days
//            fine = 15 * (rd.get(0)- d.get(0));
//        }
//        else if(rd.get(2).equals(d.get(2)) && rd.get(1) > d.get(1)) {
//            fine = 500 * (rd.get(1)- d.get(1));
//        }
//        else if(rd.get(2) > d.get(2)){
//            fine = 10000;
//        }
//        System.out.println(fine);
//    }
}
