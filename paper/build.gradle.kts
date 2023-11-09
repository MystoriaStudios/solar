
dependencies {
    implementation(project(":shared"))
    compileOnly("net.revive.framework:paper-api:1.2.2")
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")

    compileOnly("com.squareup.retrofit2:retrofit:2.9.0")
    compileOnly("me.lucko:helper:5.6.10")
    kapt("me.lucko:helper:5.6.10")
}