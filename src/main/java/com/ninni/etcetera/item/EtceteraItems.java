package com.ninni.etcetera.item;

import com.ninni.etcetera.EtceteraTags;
import com.ninni.etcetera.block.EtceteraBlocks;
import com.ninni.etcetera.sound.EtceteraSoundEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.ninni.etcetera.Etcetera.*;

@SuppressWarnings("unused")
public class EtceteraItems {

    public static final Item ETCETERA = register("etcetera", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC).fireproof()));

    public static final Item RAW_BISMUTH_BLOCK = register("raw_bismuth_block", new BlockItem(EtceteraBlocks.RAW_BISMUTH_BLOCK, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item BISMUTH_BLOCK = register("bismuth_block", new BlockItem(EtceteraBlocks.BISMUTH_BLOCK, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item BISMUTH_BARS = register("bismuth_bars", new BlockItem(EtceteraBlocks.BISMUTH_BARS, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item NETHER_BISMUTH_ORE = register("nether_bismuth_ore", new BlockItem(EtceteraBlocks.NETHER_BISMUTH_ORE, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item RAW_BISMUTH = register("raw_bismuth", new Item(new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item BISMUTH_INGOT = register("bismuth_ingot", new Item(new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item IRIDESCENT_GLASS = register("iridescent_glass", new BlockItem(EtceteraBlocks.IRIDESCENT_GLASS, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item IRIDESCENT_TERRACOTTA = register("iridescent_terracotta", new BlockItem(EtceteraBlocks.IRIDESCENT_TERRACOTTA, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item IRIDESCENT_CONCRETE = register("iridescent_concrete", new BlockItem(EtceteraBlocks.IRIDESCENT_CONCRETE, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item IRIDESCENT_LANTERN = register("iridescent_lantern", new BlockItem(EtceteraBlocks.IRIDESCENT_LANTERN, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item CHISEL = register("chisel", new TransformingItem(EtceteraToolMaterials.BISMUTH, CHISELLING_MANAGER::getMap, new FabricItemSettings().group(ITEM_GROUP).maxCount(1).maxDamage(145), EtceteraSoundEvents.ITEM_CHISEL_USE, EtceteraTags.CHISELLABLE));
    public static final Item WRENCH = register("wrench", new WrenchItem(EtceteraToolMaterials.BISMUTH, new FabricItemSettings().group(ITEM_GROUP).maxCount(1).maxDamage(145)));
    public static final Item HAMMER = register("hammer", new HammerItem(EtceteraToolMaterials.BISMUTH, (int)7.5, -3.6F, HAMMERING_MANAGER::getMap, new FabricItemSettings().group(ITEM_GROUP).maxCount(1).maxDamage(80), EtceteraSoundEvents.ITEM_HAMMER_USE, EtceteraTags.HAMMERABLE));
    public static final Item HANDBELL = register("handbell", new HandbellItem(new FabricItemSettings().group(ITEM_GROUP).maxCount(1)));

    public static final Item DRUM = register("drum", new BlockItem(EtceteraBlocks.DRUM, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item DICE = register("dice", new BlockItem(EtceteraBlocks.DICE, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item FRAME = register("frame", new BlockItem(EtceteraBlocks.FRAME, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item BOUQUET = register("bouquet", new BlockItem(EtceteraBlocks.BOUQUET, new FabricItemSettings().group(ITEM_GROUP).maxCount(16)));
    public static final Item TERRACOTTA_VASE = register("terracotta_vase", new BlockItem(EtceteraBlocks.TERRACOTTA_VASE, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item ITEM_STAND = register("item_stand", new BlockItem(EtceteraBlocks.ITEM_STAND, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item SQUID_LAMP = register("squid_lamp", new WallStandingBlockItem(EtceteraBlocks.SQUID_LAMP, EtceteraBlocks.WALL_SQUID_LAMP, new Item.Settings().group(ITEM_GROUP)));
    public static final Item TIDAL_HELMET = register("tidal_helmet", new ArmorItem(EtceteraArmorMaterials.TIDAL, EquipmentSlot.HEAD, new Item.Settings().rarity(Rarity.UNCOMMON).group(ITEM_GROUP)));
    public static final Item TURTLE_RAFT = register("turtle_raft", new TurtleRaftItem(new Item.Settings().group(ITEM_GROUP).maxCount(1)));

    public static final Item CRUMBLING_STONE = register("crumbling_stone", new BlockItem(EtceteraBlocks.CRUMBLING_STONE, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item WAXED_CRUMBLING_STONE = register("waxed_crumbling_stone", new BlockItem(EtceteraBlocks.WAXED_CRUMBLING_STONE, new FabricItemSettings().group(ITEM_GROUP)));

    public static final Item LEVELED_STONE = register("leveled_stone", new BlockItem(EtceteraBlocks.LEVELED_STONE, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item LEVELED_STONE_STAIRS = register("leveled_stone_stairs", new BlockItem(EtceteraBlocks.LEVELED_STONE_STAIRS, new FabricItemSettings().group(ITEM_GROUP)));
    public static final Item LEVELED_STONE_SLAB = register("leveled_stone_slab", new BlockItem(EtceteraBlocks.LEVELED_STONE_SLAB, new FabricItemSettings().group(ITEM_GROUP)));


    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, id), item);
    }

    static { CompostingChanceRegistry.INSTANCE.add(BOUQUET, 0.85f); }
}
