package org.demo.calculator

import org.demo.calculator.input.InputController
import java.util.*

class CalculatorApp {

    private val scanner: Scanner = Scanner(System.`in`)
    private val inputController: InputController = InputController()

    fun run() {
        while (true) {
            val input = scanner.nextLine()
            inputController.executeInput(input).forEach {
                println(it)
            }
        }
    }
}