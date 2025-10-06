package com.gaganbelgur.com.gaganbelgur

class Profile private constructor(builder: ProfileBuilder) {

    val name: String = builder.name
    val phone: String = builder.phone
    val email: String = builder.email
    val birthDay: String = builder.birthDay

    class ProfileBuilder {
        var name: String = ""
            private set

        var phone: String = ""
            private set

        var email: String = ""
            private set

        var birthDay: String = ""
            private set

        fun setName(name: String): ProfileBuilder {
            this.name = name
            return this
        }

        fun setPhone(phone: String) = apply {
            this.phone = phone
        }

        fun setEmail(email: String) = apply {
            this.email = email
        }

        fun setBirthday(birthDay: String) = apply {
            this.birthDay = birthDay
        }

        fun build() = Profile(this)
    }

    override fun toString(): String {
        return "Profile(name='$name', phone='$phone', email='$email', birthDay='$birthDay')"
    }

}