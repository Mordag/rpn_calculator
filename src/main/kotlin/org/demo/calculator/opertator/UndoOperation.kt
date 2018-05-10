package org.demo.calculator.opertator

import java.util.*

class UndoOperation
constructor(private val operationStack: LinkedList<Operation>) : Operation(OperationType.UNDO) {

    override fun onExecute(stack: LinkedList<Double>, values: Array<Double>): Boolean {
        operationStack.pollLast().revert(stack)
        return true
    }
}