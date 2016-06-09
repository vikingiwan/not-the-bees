package com.vikingiwan.ntbMod.world;

import java.util.Random;

import com.vikingiwan.ntbMod.init.ntbBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ntbWorldGenerator implements IWorldGenerator {
	//@formatter:off
	
	private WorldGenerator gen_cage_ore;
	
	//@formater:on
	
	public ntbWorldGenerator() {
		this.gen_cage_ore = new WorldGenMinable(ntbBlocks.cage_ore.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: //overworld
			this.runGenerator(this.gen_cage_ore, world, random, chunkX, chunkZ, 10, 1, 20);
			break;
		case -1: //nether
			
			break;
		case 1: //end
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 ||  maxHeight > 256 || minHeight > maxHeight)
				throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
	
		int heightDifference = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDifference);
			int z = chunk_Z * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
}
