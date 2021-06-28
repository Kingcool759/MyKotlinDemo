package com.example.mykotlindemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.mykotlindemo", appContext.packageName)
    }

    @Test
    fun test() {

    }

    class DogKt {
        fun run() = "狗会跑"
        fun cry() = "狗会汪汪"
    }

    private fun DogKt.order() = "扩展功能-》狗听从指令"


    @Test
    fun main() {
        var ex = DogKt()
        println(ex.run())
        println(ex.cry())
        println(ex.order())  //此时order函数就是扩展函数
        /**
         * 打印结果：
         * I/System.out: 狗会跑
         * I/System.out: 狗会汪汪
         * I/System.out: 扩展功能-》狗听从指令
         */
    }
}