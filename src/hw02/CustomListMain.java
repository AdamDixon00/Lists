package hw02;

/**
 * Author:        Adam Dixon
 * Description: This is the main method
 */
public class CustomListMain {
    public static <E> void main(String[] args) {
        

        //Integer List
        CustomList<Integer> integer1 = new CustomList<>(1,2,3,4,5,6,7,8,9);
        CustomList<Integer> integer2 = new CustomList<>(9,7,6,5,4,3,2,1);
        CustomList<Integer> integer3 = new CustomList<>(5,3,2,1,7,8,1);
        CustomList<Integer> integer4 = new CustomList<>(5,3,5,8,6,4);
        CustomList<Integer> integer5 = new CustomList<>(4,6,2,7,84,4,8,2);
        CustomList<Integer> integer6 = new CustomList<>(2,4,67,8,9,2,34,4);
        CustomList<Integer> integer7 = new CustomList<>(2,3,5,7,6,34,5,62,71,84);

        System.out.println(integer1.get(4));
        System.out.println(integer2.get(2,5));
        integer3.put(3,4);
        System.out.println(integer3);
        System.out.println(integer4.toString());
        integer5.reverse();
        System.out.println(integer5);
        integer6.shuffle();
        System.out.println(integer6);
        integer7.size();
        System.out.println(integer7);


        
        //String List
        CustomList<String> String1 = new CustomList<>("This","is","so","crazy","wow");
        CustomList<String> String2 = new CustomList<>("Is","this","the","hardest","class","ever?");
        CustomList<String> String3 = new CustomList<>("The","stiffest","drink","you","can","get","me");
        CustomList<String> String4 = new CustomList<>("The", "Silliest", "string");
        CustomList<String> String5 = new CustomList<>("such","foolish","boy", "A");
        CustomList<String> String6 = new CustomList<>("I");
        CustomList<String> String7 = new CustomList<>("Have");
        CustomList<String> String8 = new CustomList<>("never","have","I","ever");
        

        System.out.println(String1.get(1));
        System.out.println(String2.get(1,3));
        String3.put(2, "Idea");
        System.out.println(String3);
        String4.reverse();
        System.out.println(String4);
        String5.shuffle();
        System.out.println(String5);
        System.out.println(String6.size());
        System.out.println(String7.toString());
        String8.sort();
        System.out.println(String8);

   
        //Double List
        CustomList<Double> double1 = new CustomList<>(17.5,91.4,24.2,13.9,11.1);
        CustomList<Double> double2 = new CustomList<>(7.6,9.1,3.5,6.6);
        CustomList<Double> double3 = new CustomList<>(7.7,90.1,70.7);
        CustomList<Double> double4 = new CustomList<>(7.7,4.5,4.5,32.4);
        CustomList<Double> double5 = new CustomList<>(2.3,13.3,1634.3,63.3,143.3);
        CustomList<Double> double6 = new CustomList<>(29.3,2351.23,135.23,137.5);

        double1.put(3,3.6);
        System.out.println(double1);
        double2.reverse();
        System.out.println(double2);
        System.out.println(double3.get(2));
        double4.shuffle();
        System.out.println(double4);
        double5.sort();
        System.out.println(double5);
        double6.size();
        System.out.println(double6);
            
        Person person1 = new Person("John", 17,1 );
        Person person2 = new Person("Adam", 26, 304772993);
        Person person3 = new Person("Kevin", 21, 987654321);
        Person person4 = new Person("Kyle", 32, 167893562);
        Person person5 = new Person("Tabby", 24, 740256293);
        Person person6 = new Person("Olivia", 20, 927539173);
        Person person7 = new Person("James", 40, 720193048);

        person1.setId(123456789);
        person2.setName("Oliva");
        person3.getAge();
        person4.setAge(31);
        person5.getId();
        person6.compareTo(person7);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
        System.out.println(person6.toString());

    }
}
