import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Child implements Comparator <Person> {




        public int compare(Person o1, Person o2)
        {
            return o1.age-o2.age;
        }

    }


