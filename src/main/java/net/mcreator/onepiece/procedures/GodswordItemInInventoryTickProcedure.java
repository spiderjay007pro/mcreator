package net.mcreator.onepiece.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class GodswordItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack).isEnchanted()) {
			(itemstack).enchant(Enchantments.SHARPNESS, 100);
		}
	}
}
