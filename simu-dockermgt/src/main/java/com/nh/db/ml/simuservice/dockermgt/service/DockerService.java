package com.nh.db.ml.simuservice.dockermgt.service;

import java.util.List;

import com.github.dockerjava.api.model.Container;

public interface DockerService {

	/**
	 * set bitrate for a docker
	 * 
	 * @param idDocker
	 * @param bitrate
	 */
	public abstract void setBitrate(String idDocker, Integer bitrate);

	/**
	 * set default bitrate(2500kbps) for all docker server
	 * 
	 * @param idDocker
	 * @param bitrate
	 */
	public abstract void setDefaultBitrate();

	/**
	 * Get Bitrate of docker
	 * @param idDocker
	 */
	public abstract void getBitrate(String idDocker);

	/**
	 * get status of dockers
	 * 
	 * @param idDocker
	 * @param bitrate
	 */
	public abstract List<Container> getstatus();

}