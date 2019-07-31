import java.util.*;



    class Person {
       public String name;
       public int age;


        public Person( String name, int age) {
            this.name = name;
            this.age = age;

        }



        public static void main (String[] args){
            PersonAgeComparator personAgeComparator =new PersonAgeComparator();
            PersonNameComparator personNameComparator= new PersonNameComparator();
            TreeSet<Person> set = new TreeSet<Person>(personNameComparator);
            Person p1 =new Person("George", 15);
            Hobby h1=new Hobby("Mihai", 6);

            Person p2 =new Person("Alin", 25);
            Person p3 = new Person ("Maria", 30);
            set.add(p1);
            set.add(p2);
            set.add(p3);
            for (Person p: set){
                System.out.println(p.name+""+p.age+"");

            }
        }
    }

