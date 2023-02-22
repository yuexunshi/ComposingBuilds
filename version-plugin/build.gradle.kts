plugins {
    `kotlin-dsl`
}
gradlePlugin {
    plugins{
        register("versionPlugin") {
            id = "version-plugin"
            implementationClass = "com.example.plugin.VersionPlugin"
        }
        register("ComposePlugin") {
            id = "compose-plugin"
            implementationClass = "com.example.plugin.ComposePlugin"
        }
    }
}

dependencies {
    implementation("com.android.tools.build:gradle:7.3.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
}

