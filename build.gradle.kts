plugins {
    kotlin("jvm") version "1.5.10"
}

buildscript {
    apply(from="dependencies.gradle.kts")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
//val junit_jupiter: String by rootProject.ext
//val junit_engine: String by rootProject.ext
//
//dependencies {
//    implementation(kotlin("stdlib"))
//    testImplementation(junit_jupiter)
//    testRuntimeOnly(junit_engine)
//}

val jupiterVersion: String by rootProject.extra

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:$jupiterVersion")
}