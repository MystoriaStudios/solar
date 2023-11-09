package net.mystoria.solar.scoreboard

import net.kyori.adventure.text.Component
import net.revive.framework.annotation.Scoreboard
import net.revive.framework.flavor.annotation.Inject
import net.revive.framework.scoreboard.IScoreboard
import net.revive.framework.sender.FrameworkPlayer

@Scoreboard
object SolarScoreboardProvider : IScoreboard {

    @Inject
    lateinit var config: ScoreboardConfig
    override fun getScores(player: FrameworkPlayer): List<Component> {
        return config.lines // run replacements
    }

    override fun getTitle(player: FrameworkPlayer): Component {
        return config.title
    }

    override fun shouldDisplay(player: FrameworkPlayer) = config.enabled
}