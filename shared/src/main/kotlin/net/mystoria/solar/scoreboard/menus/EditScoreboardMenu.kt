package net.mystoria.solar.scoreboard.menus

import net.kyori.adventure.text.Component
import net.revive.framework.menu.IMenu
import net.revive.framework.menu.button.IButton
import net.revive.framework.sender.FrameworkPlayer

class EditScoreboardMenu : IMenu {
    override val metaData: IMenu.MetaData = IMenu.MetaData()

    override fun getButtons(player: FrameworkPlayer): Map<Int, IButton> {
        TODO("Not yet implemented")
    }

    override fun getTitle(player: FrameworkPlayer): Component {
        TODO("Not yet implemented")
    }
}