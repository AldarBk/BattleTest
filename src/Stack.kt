class Stack<T> {

    internal val elements = mutableListOf<T>()

    fun push(element: T) {
        elements.add(element)
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }


    fun pop(): T? {
        return if (elements.isEmpty()) null
        else elements.removeAt(elements.lastIndex)
    }
}



