import org.jetbrains.kotlin.utils.addToStdlib.safeAs

plugins {
    kotlin("jvm") version "1.7.22"
}

buildscript {
    apply(from="dependencies")
    apply(from="dependencies.gradle.kts")
}

apply(from="dependencies")
apply(from="dependencies.gradle.kts")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val projectDependency = rootProject.ext["libraries"] as Map<*, *>

    testImplementation(projectDependency["junitJupiter"]!!)
    testRuntimeOnly(projectDependency["junitEngine"]!!)

    implementation("org.apache.commons:commons-lang3:${rootProject.ext["commonsVersion"]}")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}