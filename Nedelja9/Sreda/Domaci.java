
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Domaci {

    //Sve brojeve deljive sa 3 uvecati za 2

    public static List<Integer> div3plus2(List<Integer> numbers) {
        return numbers.stream().map(x -> x % 3 == 0 ? x + 2 : x).collect(Collectors.toList());
    }

    //Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja

    public static List<Integer> div3afterdoubled (List<Integer> numbers) {
        return numbers.stream().map(x -> x * 2).filter(x ->x % 3 == 0).collect(Collectors.toList());
    }

    //Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate

    public static List<Integer> oddsMultTwoDuplicatesOut(List<Integer> numbers){
        List<Integer> oddsMultTwo = numbers.stream().map(x -> x % 2 != 0 ? x*2 : x).collect(Collectors.toList());
        return new ArrayList<>(new HashSet<>(oddsMultTwo));
    }
}
