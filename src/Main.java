//import java.util.Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] arrNum = {2,10,31,11,200,55,21,61,78,95,33,81,101,72,211};
        List<Integer> listNum = Arrays.stream(arrNum).collect(Collectors.toList());


        //Even Numbers
        List<Integer> evenList = listNum.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        //Number starts with 1
        List<Integer> oneList = listNum.stream().filter(number -> number.toString().startsWith("1")).collect(Collectors.toList());

        //Find total numbers
        long total = listNum.stream().count();

        //Sort all values
        List<Integer> ascList = listNum.stream().sorted(((o1, o2) -> o1.compareTo(o2))).collect(Collectors.toList());
        List<Integer> descList = listNum.stream().sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());

        System.out.println(evenList);
        System.out.println(oneList);
        System.out.println(total);
        System.out.println(ascList);
        System.out.println(descList);
        System.out.println("---");

    }
}
