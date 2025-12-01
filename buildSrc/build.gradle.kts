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
    implementation(kotlin("gradle-plugin", "2.1.0"))
    implementation(kotlin("stdlib"))
}
