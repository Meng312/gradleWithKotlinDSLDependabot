import org.jetbrains.kotlin.utils.addToStdlib.safeAs

plugins {
    kotlin("jvm") version "1.6.10"
}

buildscript {
    apply(from="dependencies.gradle")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val projectDependency = rootProject.ext["libraries"] as Map<*, *>

    testImplementation(projectDependency["junitJupiter"]!!)
    testRuntimeOnly(projectDependency["junitEngine"]!!)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}