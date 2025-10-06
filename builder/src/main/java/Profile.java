public class Profile {

    private final String name;
    private final String phone;
    private final String birthDate;
    private final String email;

    private Profile(ProfileBuilder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.birthDate = builder.birthDate;
        this.email = builder.email;
    }


    public static class ProfileBuilder {
        private String name;
        private String phone;
        private String birthDate;
        private String email;

        public ProfileBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProfileBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public ProfileBuilder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public ProfileBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Profile build() {
            return new Profile(this);
        }
    }

    @Override
    public String toString() {
        return "Profile [name = " + name + ", phone = " + phone + ", email = " + email + ", birthDate = " + birthDate + "]";
    }
}
