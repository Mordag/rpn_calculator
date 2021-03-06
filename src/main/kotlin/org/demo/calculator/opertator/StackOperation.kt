package org.demo.calculator.opertator

import java.util.*

/**
 * Operation which is used to insert new elements to the stack. This operation type requires no elements from the
 * stack in order to work but can be reverted if needed.
 */
class StackOperation(private val value: String) : Operation(OperationType.STACK) {

    override fun onExecute(stack: LinkedList<Double>, values: Array<Double>): Boolean {
        /**
         * Converts given new value from [String] to [Double].
         */
        val doubleValue = value.toDoubleOrNull()

        /**
         * If the doubleValue is null, the [String] is not numeric.
         */
        return if (doubleValue != null) {
            stack.addLast(doubleValue)
            true
        } else false
    }
}