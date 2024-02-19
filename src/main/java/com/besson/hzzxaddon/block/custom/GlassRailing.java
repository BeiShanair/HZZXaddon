package com.besson.hzzxaddon.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class GlassRailing extends HorizontalBlock {
    public GlassRailing(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE_N = java.util.Optional.of(
            Block.makeCuboidShape(0, 0, 8, 16, 25, 16)).get();
    private static final VoxelShape SHAPE_W = java.util.Optional.of(
            Block.makeCuboidShape(8, 0, 0, 16, 25, 16)).get();
    private static final VoxelShape SHAPE_S = java.util.Optional.of(
            Block.makeCuboidShape(0, 0, 0, 16, 25, 8)).get();
    private static final VoxelShape SHAPE_E = java.util.Optional.of(
            Block.makeCuboidShape(0, 0, 0, 8, 25, 16)).get();

    @Override
    public VoxelShape getShape(BlockState blockState, IBlockReader blockReader, BlockPos blockPos, ISelectionContext selectionContext) {
        switch (blockState.get(HORIZONTAL_FACING)){
            case NORTH:
                return SHAPE_N;
            case WEST:
                return SHAPE_W;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING,context.getPlacementHorizontalFacing().getOpposite());
    }
}
