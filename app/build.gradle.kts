plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val jupiterVersion: String by rootProject.extra

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:$jupiterVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

//dependencies {
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
////
////    testImplementation(rootProject.ext.supportDependencies.junit_jupiter)
////    testRuntimeOnly(rootProject.ext.supportDependencies.junit_engine)
//}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}