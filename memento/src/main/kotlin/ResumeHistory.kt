package com.gaganbelgur

import java.util.Stack

//Care Taker
class ResumeHistory {

    private val history = Stack<ResumeEditor.Memento>()

    fun save(editor: ResumeEditor) {
        history.push(editor.save())
        println("Saved ${history.size}")
    }

    fun undo(editor: ResumeEditor) {
        if (history.size > 1) {
            history.pop()                 // Remove current snapshot
            editor.restore(history.peek()) // Restore previous snapshot
            println("Undo ${history.size}")
        } else {
            println("Nothing to undo")
        }
    }
}