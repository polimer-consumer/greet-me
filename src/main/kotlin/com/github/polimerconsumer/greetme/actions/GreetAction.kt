package com.github.polimerconsumer.greetme.actions

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
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
        val project: Project? = actionEvent.project
        actionEvent.presentation.isEnabledAndVisible = project != null
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.BGT
    }
//    override fun actionPerformed(actionEvent: AnActionEvent) {
//        // val greetDialogWindow = GreetDialogWrapper(actionEvent.project)
//
//        Messages.showMessageDialog(actionEvent.project, "Hello world", "Greet Me", Messages.getQuestionIcon())
//        // greetDialogWindow.showAndGet()
//    }
}