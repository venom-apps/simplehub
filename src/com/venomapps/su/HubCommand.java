package com.venomapps.su;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ListenerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class HubCommand extends Command {

	public HubCommand() {
		super("hub");
	}

	@SuppressWarnings("deprecation")
	@Override
	public void execute(CommandSender sender, String[] args) {
		if(!(sender instanceof ProxiedPlayer)) {
			sender.sendMessage((BaseComponent) new TextComponent("You must be a player to do the command /hub"));
			return;
		}
		final ProxiedPlayer proxiedPlayer = (ProxiedPlayer)sender;
		final ListenerInfo listenerInfo = proxiedPlayer.getPendingConnection().getListener();
		final String fallBackServerName = listenerInfo.getDefaultServer();
		proxiedPlayer.connect(BungeeCord.getInstance().getServerInfo(fallBackServerName));
	}
}