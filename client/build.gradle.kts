plugins {
    kotlin("jvm")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":singleton"))
    implementation(project(":factory"))
    implementation(project(":abstractfactory"))
    implementation(project(":builder"))
    implementation(project(":prototype"))
    implementation(project(":adapter"))
    implementation(project(":bridge"))
    implementation(project(":lrucache"))
    testImplementation(kotlin("test"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(18)
}