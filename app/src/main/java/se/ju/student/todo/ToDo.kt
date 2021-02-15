package se.ju.student.todo

data class ToDo(
    val id: Int,
    var title: String,
    var content: String
){
    override fun toString() = title
}
