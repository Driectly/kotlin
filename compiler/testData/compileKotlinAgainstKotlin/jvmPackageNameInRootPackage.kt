// IGNORE_BACKEND: NATIVE
// FILE: A.kt

@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
@file:JvmPackageName("bar")

fun f() = "OK"

var v: Int = 1

// FILE: B.kt
// LANGUAGE_VERSION: 1.2

fun box(): String {
    v = 2
    if (v != 2) return "Fail"
    return f()
}
