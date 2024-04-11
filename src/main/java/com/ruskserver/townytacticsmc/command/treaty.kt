package com.ruskserver.townytacticsmc.command

import com.palmergames.bukkit.towny.TownyAPI
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import com.palmergames.bukkit.towny.TownyAPI.*

object treaty: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (args.isEmpty()){
            sender.sendMessage("/treaty help")
        }
        if (args.size == 1 && args[1].contains("new")){
            sender.sendMessage("" + ChatColor.AQUA + "" + args[2] + "という条約の作成に成功しました")

        }
        return true
    }
}
