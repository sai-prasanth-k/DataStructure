package linkedList


fun main(){
    val linkedList = LinkedList<Int>()

    for (i in 14..19){
        linkedList.appendNode(i)
    }

    val afterNodeReference = linkedList.searchNode(3)
    if (afterNodeReference != null){
        linkedList.insertNode( value = 11,afterNode =afterNodeReference )
    }

    // Using Scope
    afterNodeReference.also {
        if (it != null) {
            linkedList.insertNode( value = 12,afterNode =it )
        }
    }

    println(linkedList)
}