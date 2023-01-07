package com.example.firsthomework

fun main(){
    val task1= Task(1,"mohammed","First Grade",true)
    val task2= Task(2,"khalid","Second Grade",true)
Todo().addTask(task = task1)
    Todo().addTask(task = task2)

Todo().show()

}


 open class Todo{

   private val tasks = arrayListOf<Task>()

    fun show(){
        for (i in tasks){
            println("$tasks")

        }
    }
    fun addTask(task: Task) {
        tasks.add(task)
        tasks.add(task)
        println(tasks)


    }
    fun removeTask(task: Task){
        tasks.remove(task)
        tasks.remove(task)


    }
    fun changeTask(task: Task){
    task.isCompleted = false

    }

}

data class Task(val id:Int = 0, val name:String ="",val note:String ="",var isCompleted:Boolean = false){

}

