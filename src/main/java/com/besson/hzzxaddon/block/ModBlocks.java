package com.besson.hzzxaddon.block;

import com.besson.hzzxaddon.HZZXAddon;
import com.besson.hzzxaddon.block.custom.*;
import com.besson.hzzxaddon.item.ModItemGroup;
import com.besson.hzzxaddon.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HZZXAddon.MOD_ID);

    public static final RegistryObject<Block> DESK = registerBlock("desk",
            () -> new Desk(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> CHAIR = registerBlock("chair",
            () -> new Chair(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> AIR_CONDITION = registerBlock("air_condition",
            () -> new Aircondition(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> BLACKBOARD1 = registerBlock("blackboard1",
            () -> new BlackBoard1(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> BLACKBOARD2 = registerBlock("blackboard2",
            () -> new BlackBoard2(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> BLACKBOARD3 = registerBlock("blackboard3",
            () -> new BlackBoard3(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> DISPLAY1 = registerBlock("display1",
            () -> new Display1(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> DISPLAY2 = registerBlock("display2",
            () -> new Display2(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> DISPLAY3 = registerBlock("display3",
            () -> new Display3(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> LIGHT = registerBlock("light",
            () -> new Light(AbstractBlock.Properties.create(Material.IRON).notSolid().setLightLevel((state)->{
                return 15;
            })));
    public static final RegistryObject<Block> FRONT_LIGHT = registerBlock("front_light",
            () -> new FrontLight(AbstractBlock.Properties.create(Material.IRON).notSolid().setLightLevel((state)->{
                return 15;
            })));
    public static final RegistryObject<Block> ENCLOSURE = registerBlock("enclosure",
            () -> new Enclosure(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> AIR_CONDITION2 = registerBlock("air_condition2",
            () -> new Aircondition2(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> EXTERNAL_UNIT = registerBlock("external_unit",
            () -> new ExternalUnit(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> EXTERNAL_UNIT2 = registerBlock("external_unit2",
            () -> new ExternalUnit2(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> COMPUTER = registerBlock("computer",
            () -> new Computer(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> COMPUTER_DESK = registerBlock("computer_desk",
            () -> new ComputerDesk(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> COMPUTER_CHAIR = registerBlock("computer_chair",
            () -> new ComputerChair(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> FOUR_BRICKS = registerBlock("four_bricks",
            () -> new FourBricks(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> GLASS_RAILING = registerBlock("glass_railing",
            () -> new GlassRailing(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> PLATFORM = registerBlock("platform",
            () -> new Platform(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> LOCKER = registerBlock("locker",
            () -> new Locker(AbstractBlock.Properties.create(Material.IRON).notSolid()));
    public static final RegistryObject<Block> RUNWAY1 = registerBlock("runway1",
            () -> new Runway1(AbstractBlock.Properties.create(Material.WOOL)));
    public static final RegistryObject<Block> RUNWAY2 = registerBlock("runway2",
            () -> new Runway2(AbstractBlock.Properties.create(Material.WOOL)));
    public static final RegistryObject<Block> RUNWAY3 = registerBlock("runway3",
            () -> new Runway3(AbstractBlock.Properties.create(Material.WOOL)));
    public static final RegistryObject<Block> RUNWAY4 = registerBlock("runway4",
            () -> new Runway4(AbstractBlock.Properties.create(Material.WOOL)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> tRegistryObject = BLOCKS.register(name,block);
        registerBlockItem(name,tRegistryObject);
        return tRegistryObject;
    }
    private static <T extends Block> void registerBlockItem(String name,Supplier<T> block){
        ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties().group(ModItemGroup.HZZX_TAB)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
