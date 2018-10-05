import java.util.*;
import java.util.TreeSet;

public class Person implements Comparable{
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
        @Override
        public int compareTo (Object o){
 //       return this.age - ((Person) o).age;
        if (this.age == ((Person) o).age)
            return this.name.compareTo(((Person) o).name);
        return this.age - ((Person) o).age;
       // return=this.name.compareTo(((Person) o).name) написать тернарный оператор


    }
        public static void main (String args[]){
        Set<Person> treeSet = new TreeSet<>(new Child());
        treeSet.add(new Person("dAgi", 17));
        treeSet.add(new Person("Ari", 17));
        treeSet.add(new Person("ghgi", 17));

        for (Person person : treeSet) {
            System.out.println(person.name + " " + person.age);
        }
    }

    }