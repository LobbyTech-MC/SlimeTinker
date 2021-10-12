package io.github.sefiraat.slimetinker.items.templates;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.data.persistent.PersistentDataAPI;
import lombok.Getter;
import net.guizhanss.minecraft.slimetinker.utils.LangUtils;
import net.md_5.bungee.api.ChatColor;
import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class PartTemplate extends UnplaceableBlock {

    private final String name;
    @Getter
    private String materialType;

    public PartTemplate(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, String name) {
        super(itemGroup, item, recipeType, recipe);
        this.name = name;
    }

    public String getName(String material) {
        return LangUtils.getMaterialName(material) + ThemeUtils.ITEM_PART + " " + name;
    }

    public List<String> getLore(String material, ChatColor color) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add(ThemeUtils.PASSIVE + "一个工具部件,本身没有任何作用");
        list.add(ThemeUtils.PASSIVE + "但可以在匠魂工具组装台组装成工具");
        list.add("");
        list.add(ThemeUtils.CLICK_INFO + "材质: " + color + LangUtils.getMaterialName(material));
        return list;
    }

    public ItemStack getStack(String material, String partClass, @Nullable String partType, ChatColor color) {
        ItemStack itemStack = this.getItem().clone();
        ItemMeta im = itemStack.getItemMeta();
        Validate.notNull(im, "Meta null, boo!");
        im.setLore(getLore(material, color));
        im.setDisplayName(color + getName(material));
        PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartMaterial(), material);
        PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartClass(), partClass);
        if (partType != null) {
            PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartType(), partType);
        }
        itemStack.setItemMeta(im);
        return itemStack;
    }

}

