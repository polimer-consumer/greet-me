package com.github.polimerconsumer.greetme.dialogs

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.event.ActionEvent
import javax.swing.Action
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel


class GreetDialogWrapper(project: Project?) : DialogWrapper(project) {

    init {
        title = "Greet Me"
        init()
    }

    override fun createCenterPanel(): JComponent {
        val dialogPanel = JPanel(BorderLayout())

        val label = JLabel("Testing")
        label.preferredSize = Dimension(100, 100)
        dialogPanel.add(label, BorderLayout.CENTER)

        return dialogPanel
    }

    override fun createActions(): Array<Action> {
        val okAction = object : DialogWrapperExitAction("OK", OK_EXIT_CODE) {
            override fun doAction(actionEvent: ActionEvent) {
                super.doAction(actionEvent)
            }
        }

        return arrayOf(okAction)
    }
}