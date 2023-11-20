package Task22;

import java.util.*;
import java.util.stream.Collectors;

public class DupOdd {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,3,4,5,6,7,7,8,9,13,12,10,7);

        List<Integer>oddDistNumbers=

        numbers.stream().distinct().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println(oddDistNumbers);
        
    }
    
}
