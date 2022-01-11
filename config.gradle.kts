mapOf(
    Pair("minSdkVer", 22),
    Pair("targetSdkVer", 25),
    Pair("compiledSdkVer", 25),
    Pair("buildToolsVer", "26-rc4"),
    Pair("jupiterVersion","5.6.0")
).entries.forEach {
    project.extra.set(it.key, it.value)
}