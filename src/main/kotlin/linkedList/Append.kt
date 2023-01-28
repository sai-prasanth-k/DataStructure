package linkedList

fun main(){

    // Append

    val linkedList = LinkedList<Int>()

    linkedList.appendNode(10)
    linkedList.appendNode(20)
    linkedList.appendNode(30)
    linkedList.appendNode(40)

    // Different way using Scope

    linkedList.apply {
        appendNode(50)
        appendNode(60)
        appendNode(70)
        appendNode(80)
    }

    println(linkedList)
}