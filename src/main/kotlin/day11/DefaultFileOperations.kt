package day11

import java.io.File
import java.io.FileNotFoundException


fun main() {
    val file = DefaultFileOperations()

    file.copy("C:\\koko\\winter_kotlin_study\\src\\main\\save.txt", "C:\\koko\\winter_kotlin_study\\src\\main\\kotlin\\day11\\text.txt")
}

class DefaultFileOperations: FileOperations {
    override fun copy(sourcePath: String, targetPath: String) {
        try{
            val original = File(sourcePath)
            val copy = File(targetPath)
            copy.writeText(original.readText())
        } catch (e: FileNotFoundException) {
            println(e.message)
        }
    }
}