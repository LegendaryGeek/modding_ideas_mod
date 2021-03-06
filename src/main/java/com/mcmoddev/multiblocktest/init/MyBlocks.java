package com.mcmoddev.multiblocktest.init;

import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;

import com.mcmoddev.multiblocktest.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;

/**
 *
 */
public final class MyBlocks {

	/**
	 *
	 */
	private MyBlocks() {
		//
	}

	/**
	 *
	 */
    public static final Block CAPACITOR_BANK_BASE     = new CapacitorBankBase(Material.IRON);
    public static final Block CAPACITOR_BANK_ADVANCED = new CapacitorBankAdvanced(Material.IRON);
    public static final Block CAPACITOR_BANK_MASSIVE  = new CapacitorBankMassive(Material.IRON);
    public static final Block CAPACITOR_BANK_FINAL    = new CapacitorBankFinal(Material.IRON);
    public static final Block BLOCK_BANK_CONTROLLER   = new CapBankController(Material.IRON);
    public static final Block BLOCK_BANK_INPUT        = new CapBankInputJack(Material.IRON);
    public static final Block BLOCK_BANK_OUTPUT       = new CapBankOutputJack(Material.IRON);
    public static final Block CREATIVE_CAPACITOR      = new CapBankCreative(Material.IRON);
    
    public static final Item[] cap_items = { new ItemBlock(CAPACITOR_BANK_BASE).setRegistryName(CAPACITOR_BANK_BASE.getRegistryName()), 
    		new ItemBlock(CAPACITOR_BANK_ADVANCED).setRegistryName(CAPACITOR_BANK_ADVANCED.getRegistryName()),
    		new ItemBlock(CAPACITOR_BANK_MASSIVE).setRegistryName(CAPACITOR_BANK_MASSIVE.getRegistryName()),
    		new ItemBlock(CAPACITOR_BANK_FINAL).setRegistryName(CAPACITOR_BANK_FINAL.getRegistryName()),
    		new ItemBlock(CREATIVE_CAPACITOR).setRegistryName(CREATIVE_CAPACITOR.getRegistryName())};
    public static final Block[] capacitors = { CAPACITOR_BANK_BASE,  CAPACITOR_BANK_ADVANCED, CAPACITOR_BANK_MASSIVE, CAPACITOR_BANK_FINAL, CREATIVE_CAPACITOR };
    public static final Block[] allBlocks = { CAPACITOR_BANK_BASE,  CAPACITOR_BANK_ADVANCED, CAPACITOR_BANK_MASSIVE, CAPACITOR_BANK_FINAL, BLOCK_BANK_CONTROLLER, BLOCK_BANK_INPUT, BLOCK_BANK_OUTPUT, CREATIVE_CAPACITOR};
    public static final Item[] mbItems = Arrays.asList(BLOCK_BANK_CONTROLLER, BLOCK_BANK_INPUT, BLOCK_BANK_OUTPUT).stream()
    		.map(b -> new ItemBlock(b).setRegistryName(b.getRegistryName())).collect(Collectors.toCollection(Vector::new)).toArray(new Item[3]);
}
