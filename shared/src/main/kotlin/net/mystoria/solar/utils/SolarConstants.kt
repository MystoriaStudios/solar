package net.mystoria.solar.utils

import net.revive.framework.constants.Tailwind
import net.revive.framework.utils.applySmallCaps
import net.revive.framework.utils.buildComponent

object SolarConstants {
    val PREFIX = buildComponent {
        text("S".applySmallCaps(), "#ff5045")
        text("O".applySmallCaps(), "#fe7943")
        text("L".applySmallCaps(), "#fda241")
        text("A".applySmallCaps(), "#fcca3f")
        text("R".applySmallCaps(), "#fbf33d")
        text(" » ", Tailwind.GRAY_600)

    }
}