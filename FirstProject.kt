package com.example.firsthomework

fun main(){

    val todo = Todo()
    val task1= Task(1,"mohammed","First Grade",true)
    val task2= Task(2,"khalid","Second Grade",true)
    todo.addTask(task = task1)
    todo.addTask(task = task2)
    todo.specificTask(task2.id)
//todo.show()



}


 open class Todo{

     fun specificTask(id: Int){

         println(id)

     }

   private val tasks = arrayListOf<Task>()

    fun show(){
        for (i in tasks){
            println("$tasks")

        }
    }
    fun addTask(task: Task) {
        tasks.add(task)
        tasks.add(task)
       // println(tasks)
        return


    }
    fun removeTask(task: Task){
        tasks.remove(task)
        tasks.remove(task)
        println("records Deleted")
        return


    }
    fun changeTask(task: Task){
        if (!task.isCompleted){
            task.isCompleted = true
            println("records Changed")
            return
        }


    }

}

data class Task(val id:Int = 0, val name:String ="",val note:String ="",var isCompleted:Boolean = false){

}

