package com.example.myapplication12
fun main(){
val task1= Task(1,"mohammed","First Grade",true)
val task2= Task(2,"khalid","Second Grade",true)
Todo().addTask(task = task1)
Todo().addTask(task = task2)
    Todo().changeTask(task2)
    Todo().removeTask(task2)

Todo().show()


}


 class Todo{

    private val tasks = arrayListOf<Task>()

    fun show(){
if (tasks.isNotEmpty()){
        for (i in tasks){
            println("$tasks")
            return
        }
    }else
        println("array is empty")
    }
      fun addTask(task: Task) {
        tasks.add(task)
        println("Items added")
        return


    }
    fun removeTask(task: Task){
        tasks.remove(task)
        println("records has been Deleted")
        return


    }
    fun changeTask(task: Task){
        if (!task.isCompleted){
            task.isCompleted = true
            println("records Changed")
            return
        }else
            println("No need to Change record it's true")


    }

}

data class Task(val id:Int = 0, val name:String ="",val note:String ="",var isCompleted:Boolean = false){

}
