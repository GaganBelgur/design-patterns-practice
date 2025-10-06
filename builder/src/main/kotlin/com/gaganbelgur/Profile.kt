package com.gaganbelgur.com.gaganbelgur

class Profile private constructor(builder: ProfileBuilder) {

    private val name: String = builder.name
    private val phone: String = builder.phone
    private val email: String = builder.email
    private val birthDay: String = builder.birthDay

    fun getName() = name

    fun getPhone() = phone

    fun getEmail() = email

    fun getBirthDay() = birthDay

    class ProfileBuilder {
        internal var name: String = ""
        internal var phone: String = ""
        internal var email: String = ""
        internal var birthDay: String = ""

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