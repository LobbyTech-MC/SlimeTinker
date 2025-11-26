package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.TinkersSmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Materials {

    private Materials() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Vanilla + Core SF

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_COPPER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COPPER",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "铜粒",
        "由熔融铜制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_TIN = ThemeUtils.themedItemStack(
        "NUGGET_CAST_TIN",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "锡粒",
        "由熔融锡制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ZINC = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ZINC",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "锌粒",
        "由熔融锌制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALUMINUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALUMINUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "铝粒",
        "由熔融铝制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGNESIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGNESIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "镁粒",
        "由熔融镁制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_LEAD = ThemeUtils.themedItemStack(
        "NUGGET_CAST_LEAD",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "铅粒",
        "由熔融铅制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SILVER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SILVER",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "银粒",
        "由熔融银制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_COAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COAL",
        Material.POLISHED_BLACKSTONE_BUTTON,
        ThemeItemType.CRAFTING,
        "煤粒",
        "由熔融煤制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_STEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_STEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "钢粒",
        "由熔融钢制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAMASCUS_STEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAMASCUS_STEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "大马士革钢粒",
        "由熔融大马士革钢制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DURALIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DURALIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "硬铝粒",
        "由熔融硬铝制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BRONZE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "青铜粒",
        "由熔融青铜制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALU_BRONZE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "铝青铜粒",
        "由熔融铝青铜制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_HARD_METAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_HARD_METAL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "硬化金属粒",
        "由熔融硬化金属制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_COR_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COR_BRONZE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "科林斯青铜粒",
        "由熔融科林斯青铜制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SOLDER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SOLDER",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "焊锡粒",
        "由熔融焊锡制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BILLON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BILLON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "银铜合金粒",
        "由熔融银铜合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BRASS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BRASS",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "黄铜粒",
        "由熔融黄铜制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRASS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALU_BRASS",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "铝黄铜粒",
        "由熔融铝黄铜制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_NICKEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_NICKEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "镍粒",
        "由熔融镍制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_COBALT = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COBALT",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "钴粒",
        "由熔融钴制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "强化合金粒",
        "由熔融强化合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_FERROSILICON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_FERROSILICON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "硅铁粒",
        "由熔融硅铁制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_REDSTONE_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REDSTONE_ALLOY",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "红石合金粒",
        "由熔融红石合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BOOMERITE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Boomer合金粒",
        "由熔融Boomer合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SEFIRITE",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Sefi合金粒",
        "由熔融Sefi合金制成的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_CRINGLEIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "圣诞合金粒",
        "由熔融圣诞合金制成的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_FONDNESS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_FONDNESS",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "喜爱粒",
        "带有喜爱意义的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_DEVOTION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DEVOTION",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "深爱粒",
        "带有深爱意义的梨"
    );
    public static final SlimefunItemStack NUGGET_CAST_PASSION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_PASSION",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "热情粒",
        "带有热情意义的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_LOVE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_LOVE",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "爱之粒",
        "由纯真的爱铸造而成的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_NICE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_NICE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Nice粒",
        "Nice~"
    );
    public static final SlimefunItemStack NUGGET_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SMITHIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Smithium Nugget",
        "A straight-forward metal with various uses",
        "in core industry tasks."
    );
    public static final SlimefunItemStack NUGGET_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ANNIVERSARIUM",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "周年庆粒",
        "庆祝粘液科技10周年!"
    );
    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED_DRACONIUM",
        Material.CRIMSON_BUTTON,
        ThemeItemType.CRAFTING,
        "强化龙粒",
        "由无尽的愤怒铸造而成的粒"
    );
    // endregion

    // region Ingots
    public static final SlimefunItemStack INGOT_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "INGOT_CAST_BOOMERITE",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Boomer合金锭",
        "由熔融Boomer合金制成的锭"
    );
    public static final SlimefunItemStack INGOT_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "INGOT_CAST_SEFIRITE",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Sefi合金锭",
        "由熔融Sefi合金制成的锭",
        "不稳定,只能存在一小段时间"
    );
    public static final SlimefunItemStack INGOT_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_CRINGLEIUM",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "圣诞合金锭",
        "由熔融圣诞合金制成的锭",
        "不稳定,只能存在一小段时间"
    );
    public static final SlimefunItemStack INGOT_CAST_FONDNESS = ThemeUtils.themedItemStack(
        "INGOT_CAST_FONDNESS",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "喜爱锭",
        "带有喜爱意义的锭"
    );
    public static final SlimefunItemStack INGOT_CAST_DEVOTION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DEVOTION",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "深爱锭",
        "带有深爱意义的锭"
    );
    public static final SlimefunItemStack INGOT_CAST_PASSION = ThemeUtils.themedItemStack(
        "INGOT_CAST_PASSION",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "热情锭",
        "带有热情意义的锭"
    );
    public static final SlimefunItemStack INGOT_CAST_LOVE = ThemeUtils.themedItemStack(
        "INGOT_CAST_LOVE",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "爱之锭",
        "由纯真的爱制成的锭"
    );
    public static final SlimefunItemStack INGOT_CAST_NICE = ThemeUtils.themedItemStack(
        "INGOT_CAST_NICE",
        Material.GOLD_INGOT,
        ThemeItemType.CRAFTING,
        "Nice锭",
        "Nice~"
    );
    public static final SlimefunItemStack INGOT_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_SMITHIUM",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Smithium Ingot",
        "A straight-forward metal with various uses",
        "in core industry tasks."
    );
    public static final SlimefunItemStack INGOT_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_ANNIVERSARIUM",
        Material.GOLD_INGOT,
        ThemeItemType.CRAFTING,
        "周年庆锭",
        "庆祝粘液科技10周年!"
    );
    public static final SlimefunItemStack INGOT_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_REINFORCED_DRACONIUM",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "强化龙锭",
        "由无尽的愤怒铸造而成的锭"
    );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_COPPER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COPPER",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "铜块",
        "由熔融铜制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_TIN = ThemeUtils.themedItemStack(
        "BLOCK_CAST_TIN",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "锡块",
        "由熔融锡制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_ZINC = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ZINC",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "锌块",
        "由熔融锌制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALUMINUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALUMINUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "铝块",
        "由熔融铝制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGNESIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGNESIUM",
        Material.PINK_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "镁块",
        "由熔融镁制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_LEAD = ThemeUtils.themedItemStack(
        "BLOCK_CAST_LEAD",
        Material.PURPLE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "铅块",
        "由熔融铅制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_SILVER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SILVER",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "银块",
        "由熔融银制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_STEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_STEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "钢块",
        "由熔融钢制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_DAMASCUS_STEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_DAMASCUS_STEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "大马士革钢块",
        "由熔融大马士革钢制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_DURALIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_DURALIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "硬铝块",
        "由熔融硬铝制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "青铜块",
        "由熔融青铜制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALU_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "铝青铜块",
        "由熔融铝青铜制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_HARD_METAL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_HARD_METAL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "硬化金属块",
        "由熔融硬化金属制成的块"
    );
    public static final SlimefunItemStack BLOCK_CAST_COR_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COR_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "科林斯青铜块",
        "由熔融科林斯青铜制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_SOLDER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SOLDER",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "焊锡块",
        "由熔融焊锡制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_BILLON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BILLON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "银铜合金块",
        "由熔融银铜合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_BRASS = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BRASS",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "黄铜块",
        "由熔融黄铜制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRASS = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALU_BRASS",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "铝黄铜块",
        "由熔融铝黄铜制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_NICKEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_NICKEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "镍块",
        "由熔融镍制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_COBALT = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COBALT",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "钴块",
        "由熔融钴制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "强化合金块",
        "由熔融强化合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_FERROSILICON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_FERROSILICON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "硅铁块",
        "由熔融硅铁制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_REDSTONE_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REDSTONE_ALLOY",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "红石合金块",
        "由熔融红石合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BOOMERITE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Boomer合金块",
        "由熔融Boomer合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SEFIRITE",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Sefi合金块",
        "由熔融Sefi合金制成的块"
    );
    public static final SlimefunItemStack BLOCK_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_CRINGLEIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "圣诞合金块",
        "由熔融圣诞合金制成的块"
    );
    public static final SlimefunItemStack BLOCK_CAST_LOVE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_LOVE",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "爱之块",
        "由纯爱制成的块"
    );
    public static final SlimefunItemStack BLOCK_CAST_NICE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_NICE",
        Material.GOLD_BLOCK,
        ThemeItemType.CRAFTING,
        "Nice块",
        "Nice~"
    );

    public static final SlimefunItemStack BLOCK_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SMITHIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Smithium Block",
        "A straight-forward metal with various uses",
        "in core industry tasks."
    );
    public static final SlimefunItemStack BLOCK_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ANNIVERSARIUM",
        Material.GOLD_BLOCK,
        ThemeItemType.CRAFTING,
        "周年庆块",
        "庆祝粘液科技10周年!"
    );
    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED_DRACONIUM",
        Material.RED_CONCRETE,
        ThemeItemType.CRAFTING,
        "强化龙块",
        "由无尽的愤怒铸造而成的块"
    );
    // endregion

    // region Crafts
    public static final SlimefunItemStack MOD_PLATE = ThemeUtils.themedItemStack(
        "MOD_PLATE",
        Material.OBSIDIAN,
        ThemeItemType.MOD,
        "强化合金板",
        ThemeUtils.PASSIVE + "一个模组,可以让工具",
        ThemeUtils.PASSIVE + "有几率不消耗耐久"
    );

    public static final SlimefunItemStack GROUT = ThemeUtils.themedItemStack(
        "GROUT",
        Material.GRAVEL,
        ThemeItemType.CRAFTING,
        "水泥",
        ThemeUtils.PASSIVE + "可用来烧制成焦黑砖"
    );


    public static final SlimefunItemStack SEARED_BRICK = ThemeUtils.themedItemStack(
        "SEARED_BRICK",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "焦黑砖",
        ThemeUtils.PASSIVE + "用于合成匠魂冶炼炉方块"
    );

    public static final SlimefunItemStack SMELTERY_CONTROLLER = ThemeUtils.themedItemStack(
        "SMELTERY_CONTROLLER",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "冶炼炉控制器",
        ThemeUtils.PASSIVE + "用于建造匠魂冶炼炉"
    );

    public static final SlimefunItemStack SEARED_TANK = ThemeUtils.themedItemStack(
        "SEARED_TANK",
        Material.RED_NETHER_BRICK_WALL,
        ThemeItemType.CRAFTING,
        "焦黑液罐",
        ThemeUtils.PASSIVE + "用于建造匠魂冶炼炉"
    );

    public static final SlimefunItemStack SPOUT = ThemeUtils.themedItemStack(
        "SPOUT",
        Material.POLISHED_BLACKSTONE_BRICK_WALL,
        ThemeItemType.CRAFTING,
        "焦黑浇铸口",
        ThemeUtils.PASSIVE + "用于建造匠魂冶炼炉"
    );

    public static final SlimefunItemStack SEARED_BRICK_BLOCK = ThemeUtils.themedItemStack(
        "SEARED_BRICK_BLOCK",
        Material.POLISHED_BLACKSTONE_BRICKS,
        ThemeItemType.CRAFTING,
        "焦黑石砖",
        ThemeUtils.PASSIVE + "用于建造匠魂冶炼炉"
    );
    // endregion

    // endregion

    // region Infinity Expansion

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_INFINITY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_INFINITY",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "无尽粒",
        "由熔融无尽制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGSTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGSTEEL",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "磁钢粒",
        "由熔融磁钢制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_TITANIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_TITANIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "钛粒",
        "由熔融钛制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MYTHRIL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MYTHRIL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "秘银粒",
        "由熔融秘银制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ADAMANTITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ADAMANTITE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "精金粒",
        "由熔融精金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGNONIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGNONIUM",
        Material.CRIMSON_BUTTON,
        ThemeItemType.CRAFTING,
        "镁合金粒",
        "由熔融镁合金制成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_VOID = ThemeUtils.themedItemStack(
        "BLOCK_CAST_VOID",
        Material.NETHERITE_BLOCK,
        ThemeItemType.CRAFTING,
        "虚空块",
        "由熔融虚空(?)制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_INFINITY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_INFINITY",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "无尽块",
        "由熔融无尽制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGSTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGSTEEL",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "磁钢块",
        "由熔融磁钢制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_TITANIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_TITANIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "钛块",
        "由熔融钛制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_MYTHRIL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MYTHRIL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "秘银块",
        "由熔融制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_ADAMANTITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ADAMANTITE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "精金块",
        "由熔融精金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGNONIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGNONIUM",
        Material.PURPLE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "镁合金块",
        "由熔融镁合金制成的块"
    );

    // endregion

    // endregion

    // region SFWarfare

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_SLIMESTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SLIMESTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "软钢粒",
        "由熔融软钢制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_SLIMESTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED_SLIMESTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "强化软钢粒",
        "由熔融强化软钢制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_OSMIUM",
        Material.WARPED_BUTTON,
        ThemeItemType.CRAFTING,
        "锇粒",
        "由熔融锇制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM_SUPER_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_OSMIUM_SUPER_ALLOY",
        Material.WARPED_BUTTON,
        ThemeItemType.CRAFTING,
        "锇高温合金粒",
        "由熔融锇高温合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_UNPATENTABILUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_UNPATENTABILUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "非专利品粒",
        "由熔融非专利品制成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_SLIMESTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SLIMESTEEL",
        Material.SLIME_BLOCK,
        ThemeItemType.CRAFTING,
        "软钢块",
        "由熔融软钢制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_SLIMESTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED_SLIMESTEEL",
        Material.SLIME_BLOCK,
        ThemeItemType.CRAFTING,
        "强化软钢块",
        "由熔融强化软钢制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_OSMIUM",
        Material.LIGHT_BLUE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "锇块",
        "由熔融锇制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM_SUPER_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_OSMIUM_SUPER_ALLOY",
        Material.BLUE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "锇高温合金块",
        "由熔融锇高温合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_UNPATENTABILUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_UNPATENTABILUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "非专利品块",
        "由熔融非专利品制成的块"
    );

    // endregion

    // endregion

    // region DynaTech

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_STAINLESSSTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_STAINLESSSTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "不锈钢粒",
        "由熔融不锈钢制成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_STAINLESSSTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_STAINLESSSTEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "不锈钢块",
        "由熔融不锈钢制成的块"
    );

    // endregion

    // endregion

    // region LiteXpansion
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_REFINED_IRON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REFINED_IRON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "精炼铁粒",
        "由熔融精炼铁制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MIXED_METAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MIXED_METAL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "合金粒",
        "由熔融合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ADVANCED_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ADVANCED_ALLOY",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "高级合金粒",
        "由熔融高级合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAG_THOR = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAG_THOR",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "镁钍合金粒",
        "由熔融镁钍合金制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SCRAP = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SCRAP",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "废料粒",
        "由熔融废料制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_IRIDIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_IRIDIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "铱粒",
        "由熔融铱制成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_REFINED_IRON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REFINED_IRON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "精炼铁块",
        "由熔融精炼铁制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_MIXED_METAL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MIXED_METAL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "合金块",
        "由熔融合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_ADVANCED_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ADVANCED_ALLOY",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "高级合金块",
        "由熔融高级合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAG_THOR = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAG_THOR",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "镁钍合金块",
        "由熔融镁钍合金制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_SCRAP = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SCRAP",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "废料块",
        "由熔融废料制成的块"
    );

    public static final SlimefunItemStack BLOCK_CAST_IRIDIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_IRIDIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "铱块",
        "由熔融铱制成的块"
    );

    // endregion

    // endregion

    // region TranscEndance

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_DAXI_STRENGTH = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_STRENGTH",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(S)粒",
        "由熔融超能力核心(S)制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_ABSORPTION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_ABSORPTION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(A)粒",
        "由熔融超能力核心(A)制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_FORTITUDE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_FORTITUDE",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(F)粒",
        "由熔融超能力核心(F)制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_SATURATION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_SATURATION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(H)粒",
        "由熔融超能力核心(H)制成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_REGENERATION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_REGENERATION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(R)粒",
        "由熔融超能力核心(R)制成的粒"
    );

    // endregion

    // region Ingots

    public static final SlimefunItemStack INGOT_CAST_DAXI_STRENGTH = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_STRENGTH",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(S)锭",
        "由熔融超能力核心(S)制成的锭"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_ABSORPTION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_ABSORPTION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(A)锭",
        "由熔融超能力核心(A)制成的锭"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_FORTITUDE = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_FORTITUDE",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(F)锭",
        "由熔融超能力核心(F)制成的锭"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_SATURATION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_SATURATION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(H)锭",
        "由熔融超能力核心(H)制成的锭"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_REGENERATION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_REGENERATION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(R)锭",
        "由熔融超能力核心(R)制成的锭"
    );

    // endregion

    // endregion

    private static final ItemStack[] RECIPE_GROUT = new ItemStack[]{
        new ItemStack(Material.CLAY), new ItemStack(Material.SAND), new ItemStack(Material.SAND),
        new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.GRAVEL),
        new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL)
    };

    private static final ItemStack[] RECIPE_SEARED_BRICK = new ItemStack[]{
        Materials.GROUT, null, null,
        null, null, null,
        null, null, null
    };

    private static final ItemStack[] RECIPE_SEARED_BRICK_BLOCK = new ItemStack[]{
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
        null, null, null
    };

    private static final ItemStack[] RECIPE_SMELTERY_CONTROLLER = new ItemStack[]{
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_SMELTERY_SPOUT = new ItemStack[]{
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_SMELTERY_TANK = new ItemStack[]{
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_REINFORCED_PLATE = new ItemStack[]{
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,
        Materials.BLOCK_CAST_REINFORCED, new ItemStack(Material.OBSIDIAN), Materials.BLOCK_CAST_REINFORCED,
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED
    };

    public static void set(SlimeTinker p) {

        // Vanilla + Core SF + Tinker's General
        new UnplaceableBlock(ItemGroups.MATERIALS, GROUT, Workbench.TYPE, RECIPE_GROUT).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, SEARED_BRICK, RecipeType.SMELTERY, RECIPE_SEARED_BRICK).register(p);
        new TinkersSmeltery(ItemGroups.MATERIALS, SMELTERY_CONTROLLER, Workbench.TYPE, RECIPE_SMELTERY_CONTROLLER).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SEARED_TANK, Workbench.TYPE, RECIPE_SMELTERY_TANK).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SPOUT, Workbench.TYPE, RECIPE_SMELTERY_SPOUT).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SEARED_BRICK_BLOCK, Workbench.TYPE, RECIPE_SEARED_BRICK_BLOCK).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, MOD_PLATE, Workbench.TYPE, RECIPE_REINFORCED_PLATE).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COPPER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COPPER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_LEAD, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_LEAD, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SILVER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SILVER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALUMINUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALUMINUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGNESIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGNESIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ZINC, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ZINC, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_TIN, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_TIN, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DURALIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_DURALIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALU_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALU_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_HARD_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_HARD_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COR_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COR_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SOLDER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SOLDER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BILLON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BILLON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALU_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALU_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_NICKEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_NICKEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COBALT, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COBALT, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_FERROSILICON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_FERROSILICON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_FONDNESS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_FONDNESS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DEVOTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DEVOTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_PASSION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_PASSION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);

        // Infinity Expansion
        if (SupportedPluginsManager.INFINITY_EXPANSION) {
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_VOID, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_INFINITY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_INFINITY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_TITANIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_TITANIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MYTHRIL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MYTHRIL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ADAMANTITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ADAMANTITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGNONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGNONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // SFWarfare
        if (SupportedPluginsManager.SLIMEFUN_WARFARE) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_OSMIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_OSMIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_UNPATENTABILUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_UNPATENTABILUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // DynaTech
        if (SupportedPluginsManager.DYNATECH) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // LiteXpansion
        if (SupportedPluginsManager.LITEXPANSION) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REFINED_IRON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REFINED_IRON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MIXED_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MIXED_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAG_THOR, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAG_THOR, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SCRAP, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SCRAP, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_IRIDIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_IRIDIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // TranscEndence
        if (SupportedPluginsManager.TRANSCENDENCE) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_STRENGTH, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_STRENGTH, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_ABSORPTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_ABSORPTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_FORTITUDE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_FORTITUDE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_SATURATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_SATURATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_REGENERATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_REGENERATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        }
    }
}
