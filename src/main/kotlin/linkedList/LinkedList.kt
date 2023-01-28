package linkedList

class LinkedList<T> {

    private var head : Node<T>?=null
    private var tail : Node<T>?=null
    private var size : Int = 0

    fun isLinkedListEmpty(): Boolean{
        return size == 0
    }

    override fun toString(): String {
        return if (isLinkedListEmpty()){
            "Linked List is Empty"
        }else {
             head.toString()
        }
    }

    // Push is used to add elements at start of the list
    fun pushNode(value: T){
        head = Node(value, nextNode = head)
        if (tail == null){
            tail = head
        }
        size += 1
    }

    // Append is used to add elements at end of the list
    fun appendNode(value: T){
        if (isLinkedListEmpty()){
            pushNode(value)
            return
        }

        tail?.nextNode = Node(value)
        tail = tail?.nextNode
        size +=1

    }

    // Search is used to search an selected Node in list

    fun searchNode(givenIndex : Int):Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode!= null && currentIndex<givenIndex){
            currentNode = currentNode.nextNode
            currentIndex +=1
        }
        return currentNode
    }

    // Insert is used to add after the selected Node in list
    fun insertNode(value: T, afterNode: Node<T>){
        if (afterNode == tail){
            appendNode(value)
            return
        }
        val node = Node(value, nextNode = afterNode.nextNode)
        afterNode.nextNode = node
        size +=1
    }
}
