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
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(18)
}