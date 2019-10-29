package com.mcmoddev.multiblocktest.init;

import com.mcmoddev.multiblocktest.MultiBlockTest;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 *
 */
public final class ExampleModFluids {

	/**
	 *
	 */
	private ExampleModFluids() {
		//
	}

	/**
	 *
	 */
	public static final Fluid EXAMPLE_FLUID = new Fluid("example_fluid",
			new ResourceLocation(MultiBlockTest.MODID, "blocks/example_fluid_still"),
			new ResourceLocation(MultiBlockTest.MODID, "blocks/example_fluid_flow"));

	/**
	 *
	 */
	public static void init() {
		EXAMPLE_FLUID.setDensity(1);
		EXAMPLE_FLUID.setViscosity(1);
		EXAMPLE_FLUID.setTemperature(1);
		EXAMPLE_FLUID.setLuminosity(1);
		EXAMPLE_FLUID.setUnlocalizedName(MultiBlockTest.MODID + "." + "example_fluid");
		FluidRegistry.registerFluid(EXAMPLE_FLUID);
		FluidRegistry.addBucketForFluid(EXAMPLE_FLUID);
	}
}
