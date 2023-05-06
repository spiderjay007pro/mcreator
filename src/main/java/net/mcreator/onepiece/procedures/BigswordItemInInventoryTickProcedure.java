package net.mcreator.onepiece.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class BigswordItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.FLAMING_ARROWS, 100000);
	}
}
