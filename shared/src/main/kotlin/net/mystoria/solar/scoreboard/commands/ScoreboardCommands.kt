package net.mystoria.solar.scoreboard.commands

import net.mystoria.solar.scoreboard.ScoreboardConfig
import net.mystoria.solar.utils.SolarConstants
import net.revive.framework.annotation.command.AutoRegister
import net.revive.framework.command.FrameworkCommand
import net.revive.framework.commands.annotation.CommandAlias
import net.revive.framework.commands.annotation.CommandPermission
import net.revive.framework.commands.annotation.Description
import net.revive.framework.commands.annotation.Subcommand
import net.revive.framework.constants.Tailwind
import net.revive.framework.flavor.annotation.Inject
import net.revive.framework.sender.FrameworkPlayer
import net.revive.framework.sender.FrameworkSender
import net.revive.framework.utils.buildComponent

@AutoRegister
@CommandAlias("scoreboard")
@CommandPermission("framework.command.scoreboard")
object ScoreboardCommands : FrameworkCommand() {

    @Inject
    lateinit var config: ScoreboardConfig

    @Subcommand("toggle")
    @Description("Enables/disables the scoreboard system.")
    fun toggle(sender: FrameworkSender<*>) {
        config.enabled = config.enabled.not() // toggle the scoreboard board

        sender.sendMessage(
            buildComponent(SolarConstants.PREFIX) {
                text("The scoreboard system has been toggled ", "#FFFFFF")

                if (config.enabled) {
                    text("on", Tailwind.GREEN_500)
                } else {
                    text("off", Tailwind.RED_500)
                }

                text(".", "#FFFFFF")
            }
        )
    }

    @Subcommand("editor|edit")
    @Description("Edit all the scoreboard lines inside a menu.")
    fun editor(sender: FrameworkPlayer) {
        // TODO: add a method to open menu in FrameworkPlayer
    }
}