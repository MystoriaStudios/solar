package net.mystoria.solar.utils

import net.kyori.adventure.text.format.TextDecoration
import net.revive.framework.constants.Tailwind
import net.revive.framework.utils.applySmallCaps
import net.revive.framework.utils.buildComponent

object SolarConstants {
    val PREFIX = buildComponent {
        text("S".applySmallCaps()) {
            it.color("#ff5045")
            it.decorate(TextDecoration.BOLD)
        }

        text("O".applySmallCaps()) {
            it.color("#fe7943")
            it.decorate(TextDecoration.BOLD)
        }

        text("L".applySmallCaps()) {
            it.color("#fda241")
            it.decorate(TextDecoration.BOLD)
        }

        text("A".applySmallCaps()) {
            it.color("#fcca3f")
            it.decorate(TextDecoration.BOLD)
        }

        text("R".applySmallCaps()) {
            it.color("#fbf33d")
            it.decorate(TextDecoration.BOLD)
        }

        text(" » ", Tailwind.GRAY_600)
    }
}