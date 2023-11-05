
dependencies {
    implementation(project(":shared"))
    compileOnly("net.revive.framework:paper-api:1.2.1")
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("me.lucko:helper:5.6.10")
    kapt("me.lucko:helper:5.6.10")
}