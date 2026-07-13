package com.gaganbelgur

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val resumeEditor = ResumeEditor()
    val history = ResumeHistory()

    with(resumeEditor) {
        setName("Gagan Belgur")
        setSkills(listOf("Java", "Kotlin", "Python"))
    }

    history.save(resumeEditor)
    resumeEditor.printResume()

    //Now will add DSA, System Design
    with(resumeEditor) {
        setEducation("B.Tech in Information Science")
        setExperience("Software Engineer at Philips")
    }
    history.save(resumeEditor)
    resumeEditor.printResume()

    // Undo the last change
    history.undo(resumeEditor)
    resumeEditor.printResume()
}