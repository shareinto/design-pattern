/**
 * Created by Administrator on 2016/12/18.
 */
public class PersonWithPattern {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomeOwner;

    private PersonWithPattern(PersonBuilder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.salutation = builder.salutation;
        this.suffix = builder.suffix;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.isFemale = builder.isFemale;
        this.isEmployed = builder.isEmployed;
        this.isHomeOwner = builder.isHomeOwner;
    }

    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private String salutation;
        private String suffix;
        private String streetAddress;
        private String city;
        private String state;
        private boolean isFemale;
        private boolean isEmployed;
        private boolean isHomeOwner;

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder salutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public PersonBuilder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public PersonBuilder streatAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public PersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder state(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder isFemale(boolean isFemale) {
            this.isFemale = isFemale;
            return this;
        }

        public PersonBuilder isEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }

        public PersonBuilder isHomeOwner(boolean isHomeOwner) {
            this.isHomeOwner = isHomeOwner;
            return this;
        }

        public PersonWithPattern build() {
            return new PersonWithPattern(this);
        }
    }
}
