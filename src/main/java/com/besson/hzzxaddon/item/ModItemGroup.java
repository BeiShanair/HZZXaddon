package com.besson.hzzxaddon.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup HZZX_TAB = new ItemGroup("hzzx_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.HZZX_ICON.get());
        }
    };
}
