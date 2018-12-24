package com.kierek.hold.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.kierek.config.Constants
import com.kierek.hold.HoldGame

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.title = "Hold"
        config.width = Constants.GAME_W
        config.height = Constants.GAME_H
        LwjglApplication(HoldGame(), config)
    }
}
