package com.nh.db.ml.simuservice.sessionmgt.cli;

import com.lexicalscope.jewel.cli.Option;

public interface CliConfig {
		
	@Option(shortName="d", longName = "simudocker", defaultToNull=true)
	String getSimuDocker();
	@Option(shortName="f", longName = "folder", defaultToNull=true)
	String getFolder();

}
