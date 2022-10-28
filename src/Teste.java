import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Teste {


    public static void main(String[] args) {

        long count = IntStream.range(1, 100).count();


        List<Integer> inteiros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 1, 9, 8));



        long count1 = inteiros.stream()
                .filter(i -> i <= 10)
                .count();

        System.out.println(count1);
    }
}
