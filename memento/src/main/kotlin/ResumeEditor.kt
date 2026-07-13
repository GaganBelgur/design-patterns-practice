package com.gaganbelgur

//Originator + Memento Class
class ResumeEditor {
    private var name: String? = null
    private var education: String? = null
    private var experience: String? = null
    private var skills: List<String> = emptyList()

    fun setName(name: String?) {
        this.name = name
    }

    fun setEducation(education: String?) {
        this.education = education
    }

    fun setExperience(experience: String?) {
        this.experience = experience
    }

    fun setSkills(skills: List<String>) {
        this.skills = skills
    }

    fun printResume() {
        println("x:----- Resume -----")
        println("Name: $name")
        println("Education: $education")
        println("Experience: $experience")
        println("Skills: $skills")
        println("x:------------------")
    }

    // Save the current state as a Memento
    fun save(): Memento {
        return Memento(name, education, experience, skills.toList())
    }

    // Restore state from Memento
    fun restore(memento: Memento) {
        this.name = memento.name
        this.education = memento.education
        this.experience = memento.experience
        this.skills = memento.skills
    }

    // Inner Memento class
    class Memento (
        val name: String?,
        val education: String?,
        val experience: String?,
        val skills: List<String>
    )
}