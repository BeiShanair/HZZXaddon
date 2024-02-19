package com.besson.hzzxaddon.item;

import com.besson.hzzxaddon.HZZXAddon;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HZZXAddon.MOD_ID);

    public static final RegistryObject<Item> HZZX_ICON = ITEMS.register("hzzx_icon",
            () -> new Item(new Item.Properties().group(ModItemGroup.HZZX_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
