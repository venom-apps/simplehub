package com.venomapps.su;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
	
	@Override
	public void onEnable() {
		System.out.print(ChatColor.YELLOW + "[" + ChatColor.GREEN + "SimpleHub" + ChatColor.YELLOW + "] " + ChatColor.GREEN + "Plugin successfully loaded!");
		getProxy().getPluginManager().registerCommand(this, new HubCommand());
	}
	
	@Override
	public void onDisable() {
		System.out.print(ChatColor.YELLOW + "[" + ChatColor.RED + "SimpleHub" + ChatColor.YELLOW + "] " + ChatColor.RED + "Plugin successfully unloaded!");
	}
}