package com.gaganbelgur;

public class ProfileJava {

    private final String name;
    private final String phone;
    private final String birthDate;
    private final String email;

    private ProfileJava(ProfileBuilder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.birthDate = builder.birthDate;
        this.email = builder.email;
    }

    public static class ProfileBuilder {
        private final String name;
        private final String phone;
        private String birthDate;
        private String email;

        public ProfileBuilder(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public ProfileBuilder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public ProfileBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ProfileJava build() {
            return new ProfileJava(this);
        }
    }

    @Override
    public String toString() {
        return "Profile [name = " + name + ", phone = " + phone + ", email = " + email + ", birthDate = " + birthDate + "]";
    }
}
