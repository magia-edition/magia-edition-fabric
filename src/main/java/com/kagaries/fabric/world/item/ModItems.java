package com.kagaries.fabric.world.item;

import com.kagaries.fabric.Magia;
import com.kagaries.fabric.world.block.ModBlocks;
import com.kagaries.fabric.world.item.material.EmeraldMaterial;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.logging.Level;

public class ModItems {

    public static final AxeItem EMERALD_AXE = (AxeItem) register(new AxeItem(EmeraldMaterial.INSTANCE, 6, -3.35F, new Item.Settings()), "emerald_axe");

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(Magia.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        Magia.getLogger().info("Registering Block: {}:{}", itemID.getNamespace(), itemID.getPath());

        // Return the registered item!
        return registeredItem;
    }

    public static void initialize() {

    }
}
