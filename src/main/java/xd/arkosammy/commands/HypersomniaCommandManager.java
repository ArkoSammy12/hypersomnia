package xd.arkosammy.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import xd.arkosammy.commands.categories.InsomniaToggle;

public abstract class HypersomniaCommandManager {

    private HypersomniaCommandManager(){}
    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment){

        LiteralCommandNode<ServerCommandSource> hypersomniaNode = CommandManager
                .literal("hypersomnia")
                .build();

        dispatcher.getRoot().addChild(hypersomniaNode);
        InsomniaToggle.register(hypersomniaNode);

    }

}
