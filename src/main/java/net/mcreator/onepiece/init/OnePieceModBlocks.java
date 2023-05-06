
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.onepiece.block.AetherblockBlock;
import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OnePieceMod.MODID);
	public static final RegistryObject<Block> AETHERBLOCK = REGISTRY.register("aetherblock", () -> new AetherblockBlock());
}
