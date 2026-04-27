plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

// Define your version and native variables
val lwjglVersion = "3.4.1"
val jomlVersion = "1.10.8"
val lwjglNatives = "natives-windows"

repositories {
    mavenCentral()
}

dependencies {
    // --- LWJGL Dependencies ---
    implementation(platform("org.lwjgl:lwjgl-bom:$lwjglVersion"))

    implementation("org.lwjgl:lwjgl")
    implementation("org.lwjgl:lwjgl-assimp")
    implementation("org.lwjgl:lwjgl-glfw")
    implementation("org.lwjgl:lwjgl-nfd")
    implementation("org.lwjgl:lwjgl-openal")
    implementation("org.lwjgl:lwjgl-opengl")
    implementation("org.lwjgl:lwjgl-stb")

    // --- LWJGL Natives ---
    implementation("org.lwjgl:lwjgl::$lwjglNatives")
    implementation("org.lwjgl:lwjgl-assimp::$lwjglNatives")
    implementation("org.lwjgl:lwjgl-glfw::$lwjglNatives")
    implementation("org.lwjgl:lwjgl-nfd::$lwjglNatives")
    implementation("org.lwjgl:lwjgl-openal::$lwjglNatives")
    implementation("org.lwjgl:lwjgl-opengl::$lwjglNatives")
    implementation("org.lwjgl:lwjgl-stb::$lwjglNatives")

    // --- JOML ---
    implementation("org.joml:joml:$jomlVersion")

    // --- Testing ---
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}