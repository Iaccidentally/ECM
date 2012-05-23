package com.github.iaccidentally.ecm.commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DebuggingLogger {
	public void DebugLog(String text) throws IOException {
		File DebuggingLog = new File("plugins" + File.pathSeparator + "ECM"
				+ File.pathSeparator + "DebugLog.log");
		boolean canUseDebugLog = DebuggingLog.exists()
				&& DebuggingLog.canWrite();

		if (canUseDebugLog) {
			FileWriter outFile = new FileWriter(DebuggingLog, true);
			PrintWriter out = new PrintWriter(outFile);
			out.println(text);
			out.close();
		}
	}
}
