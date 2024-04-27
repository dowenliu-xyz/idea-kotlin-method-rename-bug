package xyz.dowenliu.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IdeaKotlinMethodRenameBugApplication

fun main(args: Array<String>) {
    runApplication<IdeaKotlinMethodRenameBugApplication>(*args)
}
