package com.ruskserver.townytacticsmc.command

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

object treaty_tab: TabCompleter{
    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): MutableList<String>? {
        if (args.size == 1){
            return mutableListOf<String>("new", "list", "invite", "delete", "leave")
        }
        return null
    }
}