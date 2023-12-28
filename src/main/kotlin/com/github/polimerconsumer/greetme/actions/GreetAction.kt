package com.github.polimerconsumer.greetme.actions

import com.github.polimerconsumer.greetme.dialogs.GreetDialogWrapper
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ui.Messages

class GreetAction : AnAction() {
    override fun actionPerformed(actionEvent: AnActionEvent) {
        val userName = Messages.showInputDialog(
            actionEvent.project,
            "What's your name, buddy?",
            "Greet Me",
            Messages.getQuestionIcon()
        )

        if (!userName.isNullOrEmpty()) {
            val greetingMessage = "Hello, $userName!"
            Messages.showMessageDialog(actionEvent.project, greetingMessage, "Greet Me", Messages.getInformationIcon())
        } else {
            Messages.showMessageDialog(actionEvent.project, "Hello, anonymous", "Greet Me", Messages.getInformationIcon())
        }
    }

    override fun update(actionEvent: AnActionEvent) {
        val presentation = actionEvent.presentation
        val project = actionEvent.getData(CommonDataKeys.PROJECT)
        presentation.isEnabledAndVisible = project != null
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.EDT
    }
//    override fun actionPerformed(actionEvent: AnActionEvent) {
//        // val greetDialogWindow = GreetDialogWrapper(actionEvent.project)
//
//        Messages.showMessageDialog(actionEvent.project, "Hello world", "Greet Me", Messages.getQuestionIcon())
//        // greetDialogWindow.showAndGet()
//    }
}