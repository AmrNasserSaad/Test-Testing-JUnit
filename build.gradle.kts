plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Kotest
    testImplementation("io.kotest:kotest-runner-junit5:5.7.2")
    testImplementation("io.kotest:kotest-assertions-core:5.7.2")

    // Google Truth
    testImplementation("com.google.truth:truth:1.4.2")

    // parameterized test
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")

    // mock K
    testImplementation("io.mockk:mockk:1.14.0")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}