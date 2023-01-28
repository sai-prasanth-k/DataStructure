package linkedList

fun main(){

    //Push
    val linkedList = LinkedList<Int>()

    linkedList.pushNode(10)//10
    linkedList.pushNode(20)//20,10
    linkedList.pushNode(30)//30,20,10
    linkedList.pushNode(40)//40,30,20,10

    //Different way using loop
    for (i in 50..150 step 10){
        linkedList.pushNode(i)
    }

    println(linkedList)
}