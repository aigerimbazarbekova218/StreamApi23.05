import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Alex", "Sam"};
        int[] a = {1, 2, 3, 4, 5};

        List<String> names = new ArrayList<>(Arrays.asList("Alex", "Sam"));
        Stream.of(array).forEach(System.out::println);
        names.stream().forEach(System.out::println);
        Arrays.stream(array).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 6, 7, 8, 9));
        list.stream()
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer * integer);
                    }
                });


        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7));
        list1.stream()
                .forEach(integer -> System.out.println(integer * integer));

        System.out.println("_______________________________________________");

        List<String> list2 = new ArrayList<>(Arrays.asList("Aigerim", "Bazarbekova"));

        list2.forEach(System.out::println);
        list2.stream()
                .map(new Function<String, Object>() {
                    @Override
                    public Object apply(String s) {
                        return s.toLowerCase();
                    }
                }).forEach(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) {
                        System.out.println(o);
                    }
                });
        list2.stream()
                .map(x -> x.toLowerCase()).forEach(System.out::println);
        System.out.println("_____________________________________________________");


        List<Integer> list3 = new ArrayList<>(Arrays.asList(200, 400, 500));
        list3.stream()
                .map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer integer) {
                        return integer / 10 ;
                    }
                }).forEach(new Consumer<Object>() {

                    @Override
                    public void accept(Object o) {
                        System.out.println(o);
                    }
                });


        list3.stream()
                .map(x->x/10)
                .forEach(System.out::println);
        System.out.println("__________________________________________________________________");

        List<Student>list4=new ArrayList<>(Arrays.asList(
                new Student(12, "Bolotbekovna"),
                new Student(13,"Bazarbekova"),
                new Student(14, "Raimbekova")));
        list4.stream()
                .map(new Function<Student, Object>() {
                    @Override
                    public Object apply(Student student) {
                        return student.getFIO();
                    }
                }).forEach(new Consumer<Object>() {

                    @Override
                    public void accept(Object o) {
                        System.out.println(o);
                    }
                });

        List<Student>list5=new ArrayList<>(Arrays.asList(new Student(12, "Bolotbekovna"),
                new Student(13,"Bazarbekova"),
                new Student(14, "Raimbekova")));
        list5.stream()
                .map((x)->x.getFIO()).forEach(o -> System.out.println(o));



        System.out.println("______________________________________________________");
        List <String> list6=new ArrayList<>(Arrays.asList("Оля", "Юля"));
        list6.stream()
                .map(new Function<String, Object>() {
                    @Override
                    public Object apply(String s) {
                        return s+" " +s;
                    }
                }).forEach(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) {
                        System.out.println(o);
                    }
                });


        List <String> list7=new ArrayList<>(Arrays.asList("Оля", "Юля"));
        list7.stream()
                .map( s -> s + s).forEach(o -> System.out.println(o));


        List <Student>students=new ArrayList<>(Arrays.asList(
                new Student(1,"Bazarbekova"),
                new Student(2,"Teshebaeva"),
                new Student(3,"Chyrmasheva")
        ));
       // List<Student>lastname=students.stream().map(x->x.getLastname().collect(Collector.toList));
        System.out.println("________________________________________________________________");
     Integer[] array2=new Integer[]{1,2,3,4,5,6,7,8,9};
        List<Integer>list8=Arrays.stream(array2).collect(Collectors.toList());
        list8.stream()
                .map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer integer){
                        if(integer%3==0){
                            integer=0;
                        }else {
                            integer=integer*10;
                        }
                        return integer;
                    }
                }).forEach(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) {
                        System.out.println(o);
                    }
                });
        List <Integer> list9=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        list9.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if(integer%2==0){
                            return true;
                        }
                        return false;
                    }
                }).forEach(System.out::println);


        list9.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
        System.out.println("____________________________________________________");
        List <Integer> list10=new ArrayList<>(Arrays.asList(1,2,34,4,5));
        System.out.println(list10.stream()
                .max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                }));
        List <Integer> list11=new ArrayList<>(Arrays.asList(1,2,34,4,5));
        list11.stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });

        List <Integer> list12=new ArrayList<>(Arrays.asList(1,2,34,4,5));
list12.stream()
        .distinct().forEach(System.out::println);

    }
}