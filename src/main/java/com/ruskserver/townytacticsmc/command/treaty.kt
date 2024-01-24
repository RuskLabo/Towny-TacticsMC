package com.ruskserver.townytacticsmc.command

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object treaty: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (args.isEmpty()){
            sender.sendMessage("/treaty help")
        }
        return true
    }
}
