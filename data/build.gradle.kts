plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
dependencies {
    implementation(project(":domain"))

    api(libs.retrofit)
    api(libs.converter.gson)
    implementation(libs.javax.inject)
}