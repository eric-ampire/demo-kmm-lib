package com.ericampire.demo.kmm

import org.junit.Test
import kotlin.test.assertEquals

class JvmBaseTest {
  @Test
  fun testNonAsciiString() {
    val utf8String = "Gödel"
    val actual = Base64Factory.createEncoder().encodeToString(utf8String.toByteArray())
    assertEquals("R8O2ZGVs", actual)
  }
}