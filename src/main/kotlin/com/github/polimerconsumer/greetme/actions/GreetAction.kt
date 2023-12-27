package com.github.polimerconsumer.greetme.actions

import com.github.polimerconsumer.greetme.dialogs.GreetDialogWrapper
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class GreetAction : AnAction() {
    override fun actionPerformed(actionEvent: AnActionEvent) {
        // val greetDialogWindow = GreetDialogWrapper(actionEvent.project)

        Messages.showMessageDialog(actionEvent.project, "Hello world", "Greet Me", Messages.getQuestionIcon())
        // greetDialogWindow.showAndGet()
    }
}