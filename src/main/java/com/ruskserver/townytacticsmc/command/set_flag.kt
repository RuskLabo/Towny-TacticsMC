package com.ruskserver.townytacticsmc.command

import com.palmergames.bukkit.towny.TownyAPI
import com.palmergames.bukkit.towny.exceptions.TownyException
import com.palmergames.bukkit.towny.`object`.Town
import com.palmergames.bukkit.towny.utils.MetaDataUtil
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import com.ruskserver.townytacticsmc.main
import java.util.*


object set_flag: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        setflag(sender as Player,args)
        return false;
    }

    private fun setflag(player: Player,args: Array<out String>){
        val town: Town? = TownyAPI.getInstance().getTown(player)
        MetaDataUtil.addNewStringMeta(town,"townytacticsmc_flag", args[0],true)
        player.sendMessage("§b国旗が設定されました " + args[0] + "")
    }
}