
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.onepiece.item.SpikeytridentItem;
import net.mcreator.onepiece.item.SaddiItem;
import net.mcreator.onepiece.item.MrknockbackItem;
import net.mcreator.onepiece.item.MochimochiItem;
import net.mcreator.onepiece.item.MiningItem;
import net.mcreator.onepiece.item.LeopardItem;
import net.mcreator.onepiece.item.GomugomunomiItem;
import net.mcreator.onepiece.item.GodswordItem;
import net.mcreator.onepiece.item.ElectricclawItem;
import net.mcreator.onepiece.item.BuddhaItem;
import net.mcreator.onepiece.item.BigswordItem;
import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OnePieceMod.MODID);
	public static final RegistryObject<Item> GOMUGOMUNOMI = REGISTRY.register("gomugomunomi", () -> new GomugomunomiItem());
	public static final RegistryObject<Item> SPIKEYTRIDENT = REGISTRY.register("spikeytrident", () -> new SpikeytridentItem());
	public static final RegistryObject<Item> LEOPARD = REGISTRY.register("leopard", () -> new LeopardItem());
	public static final RegistryObject<Item> BUDDHA = REGISTRY.register("buddha", () -> new BuddhaItem());
	public static final RegistryObject<Item> MOCHIMOCHI = REGISTRY.register("mochimochi", () -> new MochimochiItem());
	public static final RegistryObject<Item> SADDI = REGISTRY.register("saddi", () -> new SaddiItem());
	public static final RegistryObject<Item> ELECTRICCLAW = REGISTRY.register("electricclaw", () -> new ElectricclawItem());
	public static final RegistryObject<Item> MINING = REGISTRY.register("mining", () -> new MiningItem());
	public static final RegistryObject<Item> GODSWORD = REGISTRY.register("godsword", () -> new GodswordItem());
	public static final RegistryObject<Item> MRKNOCKBACK = REGISTRY.register("mrknockback", () -> new MrknockbackItem());
	public static final RegistryObject<Item> BIGSWORD = REGISTRY.register("bigsword", () -> new BigswordItem());
	public static final RegistryObject<Item> AETHERBLOCK = block(OnePieceModBlocks.AETHERBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
