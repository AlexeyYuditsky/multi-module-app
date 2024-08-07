plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
dependencies {
    implementation(project(":domain"))

    implementation(libs.retrofit)
    implementation(libs.converter.gson)
}