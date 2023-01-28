package linkedList

fun main(){
    val linkedList = LinkedList<Int>()

    for (i in 1..10){
        linkedList.apply {
            appendNode(i)
        }
    }
    println(linkedList.searchNode(2)?.value)
}