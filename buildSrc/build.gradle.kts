plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(18)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("gradle-plugin", "1.9.0"))
    implementation(kotlin("stdlib"))
}
