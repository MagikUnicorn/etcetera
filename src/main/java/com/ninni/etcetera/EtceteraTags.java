package com.ninni.etcetera;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.ninni.etcetera.Etcetera.*;

@SuppressWarnings("unused")
public interface EtceteraTags {
    TagKey<Item> CONCRETE = TagKey.of(Registry.ITEM_KEY, new Identifier(MOD_ID, "concrete"));
    TagKey<Item> ALL_CONCRETE = TagKey.of(Registry.ITEM_KEY, new Identifier(MOD_ID, "all_concrete"));
    TagKey<Item> ALL_TERRACOTTA = TagKey.of(Registry.ITEM_KEY, new Identifier(MOD_ID, "all_terracotta"));
    TagKey<Item> PACKED_SILT_ITEM = TagKey.of(Registry.ITEM_KEY, new Identifier(MOD_ID, "packed_silt"));

    TagKey<Block> NON_MODIFIABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(MOD_ID, "non_modifiable"));
    TagKey<Block> CHISELLABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(MOD_ID, "chisellable"));
    TagKey<Block> HAMMERABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(MOD_ID, "hammerable"));
    TagKey<Block> PACKED_SILT_BLOCK = TagKey.of(Registry.BLOCK_KEY, new Identifier(MOD_ID, "packed_silt"));
}
