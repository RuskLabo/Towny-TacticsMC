package com.ruskserver.townytacticsmc.misc

import com.palmergames.bukkit.towny.`object`.Town
import me.silverwolfg11.maptowny.managers.LayerManager
import me.silverwolfg11.maptowny.objects.MarkerOptions
import me.silverwolfg11.maptowny.platform.MapLayer
import java.util.*
import java.util.function.Function

object map: LayerManager{
    override fun renderTown(town: Town) {
        TODO("Not yet implemented")
    }

    override fun renderTowns(towns: MutableCollection<Town>) {
        TODO("Not yet implemented")
    }

    override fun removeTownMarker(town: Town): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeTownMarker(townUUID: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun getTownyWorldLayerProvider(worldName: String): MapLayer {
        TODO("Not yet implemented")
    }

    override fun registerReplacement(key: String, function: Function<Town, String>) {
        TODO("Not yet implemented")
    }

    override fun unregisterReplacement(key: String) {
        TODO("Not yet implemented")
    }

    override fun getTownInfoMarker(town: Town): MarkerOptions {
        TODO("Not yet implemented")
    }
}