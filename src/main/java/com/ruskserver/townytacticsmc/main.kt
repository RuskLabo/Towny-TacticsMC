package com.ruskserver.townytacticsmc

import com.ruskserver.townytacticsmc.command.treaty
import com.ruskserver.townytacticsmc.command.treaty_tab
import org.bukkit.plugin.java.JavaPlugin

class main: JavaPlugin() {
    override fun onEnable() {
        println("initialize Towny-TacticsMC....")
        val helloCommand = getCommand("treaty")
        if(helloCommand != null){
            getCommand("treaty")?.setExecutor(treaty)
            getCommand("treaty")?.setTabCompleter(treaty_tab)
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
}