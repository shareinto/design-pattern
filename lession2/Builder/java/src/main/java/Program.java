/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {
        PersonNoPatten person1 = new PersonNoPatten("Coltrane",
                "Rosco",
                "Purvis",
                null,
                null,
                null,
                "Hazzard",
                "Georgia",
                false,
                true,
                true);
        PersonWithPattern person2 = new PersonWithPattern.PersonBuilder()
                .lastName("Coltrane")
                .firstName("Rosco")
                .middleName("Purvis")
                .salutation(null)
                .suffix(null)
                .streatAddress(null)
                .city("Hazzard")
                .state("Georgia")
                .isFemale(false)
                .isEmployed(true)
                .isHomeOwner(true)
                .build();
        System.out.println(String.format("person1: %s", person1.getLastName()));
        System.out.println(String.format("person2: %s", person2.getLastName()));
    }
}
