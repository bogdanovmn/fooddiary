package com.github.bogdanovmn.fooddiary.cli.something;


import com.github.bogdanovmn.cmdlineapp.CmdLineAppBuilder;

public class App {
	public static void main(String[] args) throws Exception {
		new CmdLineAppBuilder(args)
			.withJarName("something")
			.withDescription("")
//			.withArg("option-name", "option descr")
			.withEntryPoint(
				cmdLine -> {

				}
			).build().run();
	}
}
