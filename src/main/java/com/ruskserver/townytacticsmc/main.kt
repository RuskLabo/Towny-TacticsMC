package com.ruskserver.townytacticsmc

import com.palmergames.bukkit.towny.TownyCommandAddonAPI
import com.palmergames.bukkit.towny.TownyCommandAddonAPI.CommandType
import com.palmergames.bukkit.towny.`object`.Town
import com.palmergames.bukkit.towny.`object`.metadata.StringDataField
import com.palmergames.bukkit.towny.utils.MetaDataUtil
import com.ruskserver.townytacticsmc.command.set_flag
import com.ruskserver.townytacticsmc.command.treaty
import com.ruskserver.townytacticsmc.command.treaty_tab
import me.silverwolfg11.maptowny.MapTownyPlugin
import org.bukkit.plugin.java.JavaPlugin


class main: JavaPlugin() {
    private val town_flag = StringDataField("townytacticsmc_flag", "")
    override fun onEnable() {
        println("initialize Towny-TacticsMC....")
        val treatyCommand = getCommand("treaty")
        if(treatyCommand != null){
            getCommand("treaty")?.setExecutor(treaty)
            getCommand("treaty")?.setTabCompleter(treaty_tab)
            TownyCommandAddonAPI.addSubCommand(CommandType.TOWN_SET, "flag", set_flag)
            logger.info("/treaty を登録しました")
        } else {
            logger.severe("/treaty を登録できませんでした")
        }
        saveDefaultConfig()
        println("Complate! Verison " + config.get("verison") + " Loaded")
    }

    override fun onDisable() {
        saveDefaultConfig()
        println("Shuddown Towny-TacticsMC")
    }

    public fun getTownFlag(town: Town): String? {
        if (MetaDataUtil.hasMeta(town, town_flag))
            return MetaDataUtil.getString(town, town_flag)
        else
            return null
    }

    public fun setTownFlag(town: Town,args: Array<out String>){
        MetaDataUtil.addNewStringMeta(town,"townytacticsmc_flag", args.toString(),true)
    }
}