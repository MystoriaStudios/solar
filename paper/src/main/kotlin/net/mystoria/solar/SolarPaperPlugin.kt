package net.mystoria.solar

import me.lucko.helper.plugin.ap.Plugin
import me.lucko.helper.plugin.ap.PluginDependency
import net.revive.framework.annotation.retrofit.UsesRetrofit
import net.revive.framework.plugin.ExtendedKotlinPlugin

@Plugin(
    name = "Solar",
    version = "1.0.01-SNAPSHOT",
    authors = ["Mystoria Studios"],
    website = "https://mystoria.dev/",
    depends = [
        PluginDependency("Framework")
    ]
)
@UsesRetrofit
class SolarPaperPlugin : ExtendedKotlinPlugin() {

    companion object {
        lateinit var instance: SolarPaperPlugin

        fun use(lambda: (SolarPaperPlugin) -> Unit) {
            lambda.invoke(instance)
        }
    }
}