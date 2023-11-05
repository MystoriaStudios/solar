package net.mystoria.solar.scoreboard

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextDecoration
import net.revive.framework.config.JsonConfig
import net.revive.framework.constants.Tailwind
import net.revive.framework.utils.applySmallCaps
import net.revive.framework.utils.buildComponent

@JsonConfig(fileName = "scoreboard.json")
data class ScoreboardConfig(
    var enabled: Boolean = true,

    var title: Component = buildComponent {
        text("FRAMEWORK") {
            it.color(Tailwind.AMBER_400)
            it.decorate(TextDecoration.BOLD)
        }
    },

    var lines: List<Component> = listOf(
        buildComponent {
            text("LOBBY SERVER".applySmallCaps(), "#3f3f46")
        },

        Component.empty(),

        buildComponent {
            text("┃ ", Tailwind.AMBER_600)
            text("INFORMATION".applySmallCaps(), Tailwind.AMBER_400)
        },

        buildComponent {
            text("┃ ", Tailwind.AMBER_600)
            text("PLAYER: ".applySmallCaps(), Tailwind.GRAY_400)
            text("%player%", "#FFFFFF")
        },

        buildComponent {
            text("┃ ", Tailwind.AMBER_600)
            text("PING: ".applySmallCaps(), Tailwind.GRAY_400)
            text("%ping%", "#FFFFFF")
        },

        Component.empty(),


        buildComponent {
            text("┃ ", Tailwind.AMBER_600)
            text("SERVERS".applySmallCaps(), Tailwind.AMBER_400)
        },

        buildComponent {
            text("┃ ", Tailwind.AMBER_600)
            text("LIFESTEAL".applySmallCaps(), "#dc2626")
        },

        buildComponent {
            text("┃ ", Tailwind.AMBER_600)
            text("SKYBLOCK".applySmallCaps(), Tailwind.AMBER_300)
        },

        // Footer
        buildComponent {
            text("PLAY.MYSTORIA.DEV".applySmallCaps(), "#92cace")
        }
    )
)