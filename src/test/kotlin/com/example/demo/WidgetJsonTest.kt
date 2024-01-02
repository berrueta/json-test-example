package com.example.demo

import org.springframework.boot.test.autoconfigure.json.JsonTest
import org.springframework.boot.test.json.JacksonTester
import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

@JsonTest
class WidgetJsonTest {
    @Autowired
    private lateinit var jacksonTester: JacksonTester<Widget>

    @Test
    fun `json serialisation deserialisation roundtrip`() {
        val widget = Widget(name = "foo", weight = Weight(10.0, "Kilograms"))
        
        assertThat(jacksonTester.parseObject(jacksonTester.write(widget).json))
            .isEqualTo(widget)
    }
}