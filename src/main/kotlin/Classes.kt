/*
visibility modifiers for classes include
public, private, protected, internal.

the default is public
 */

//sufficient for creating a class
class PlainShort {}
class ShortClass

//the keyword constructor is mandatory when visibility modifiers are applied, else it can be omitted
class WithConstructor constructor(name: String, age: Int) {}
class WithoutConstructor (name: String, age: Int) {}
class MandatoryConstructor internal constructor(name: String,age: Int)

class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

//some properties can be immutable
class ThisPerson(val firstName: String, lastName: String, var age: Int) {}

class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
    get() {
        return if (field.isNullOrBlank()) "No description" else "$field!"
    }

    fun show() {
        println(title)
    }

    override fun toString(): String {
        return "$title - $description"
    }
}

fun main() {
    val course = Course("Kotlin Essential Training")
    course.description = "secrets you want to know"
    course.show()
    println(course)
}