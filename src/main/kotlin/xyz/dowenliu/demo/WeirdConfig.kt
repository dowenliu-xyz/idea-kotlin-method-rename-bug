package xyz.dowenliu.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WeirdConfig {
    @Bean(initMethod = "in")
    fun weirdBeanNeedInit(): WeirdBeanNeedInit = WeirdBeanNeedInit()
}

class WeirdBeanNeedInit {
    fun `in`() {
        println("init")
    }
}