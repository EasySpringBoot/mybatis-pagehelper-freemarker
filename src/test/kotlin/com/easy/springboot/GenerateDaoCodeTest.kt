package com.easy.springboot

import com.easy.springboot.mybatispagehelperfreemarker.GenerateDaoCode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class GenerateDaoCodeTest {
    @Test
    fun test() {
        GenerateDaoCode.doGenerate()
    }
}
