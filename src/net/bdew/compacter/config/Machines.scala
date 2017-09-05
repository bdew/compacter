/*
 * Copyright (c) bdew, 2015 - 2017
 * https://github.com/bdew/compacter
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.compacter.config

import net.bdew.compacter.CompacterMod
import net.bdew.compacter.blocks.compacter.MachineCompacter
import net.bdew.lib.config.MachineManager

object Machines extends MachineManager(Tuning.getSection("Machines"), CompacterMod.guiHandler, Blocks) {
  registerMachine(MachineCompacter)
}
