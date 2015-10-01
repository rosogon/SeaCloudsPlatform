SeaClouds Platform
==================
![SeaClouds Project][SeaClouds-banner]
[SeaClouds-banner]: http://www.seaclouds-project.eu/img/header_test.jpg  "SeaClouds Project"
==================
[![Build Status](https://api.travis-ci.org/SeaCloudsEU/SeaCloudsPlatform.svg?branch=master)](https://travis-ci.org/SeaCloudsEU/SeaCloudsPlatform)

This is a proof of concept of the **SeaClouds Platform** ([www.seaclouds-project.eu](http://www.seaclouds-project.eu)), integrating a first version of the [Discoverer & Planner](../planner-branch/planner/) (considering the [Matchmaker process](../planner-branch/planner/matchmaker/)), [Deployer](./deployer/), [Monitor](./monitor/) and [SLA Service](https://github.com/SeaCloudsEU/sla-core/) components, into a [**Unified Dashboard**](./dashboard/src/main/webapp).


This work is part of the ongoing European research project *EC-FP7-ICT-610531* SeaClouds, and it's *currently under development*.

Contributing
-------------
If you want to help us with the development of this project please read carefully our [**Contributing Guide**](CONTRIBUTING.md).

Getting Started
-------------------
* Installation guide: please follow the instruction to know [how to deploy SeaClouds](usage/installer/README.md)

## Deploy SeaClouds
A deployment of SeaClouds can be launched using Apache Brooklyn. We currently support deployments against Bring Your
Own Nodes (BYON) and to all the IaaS provider supported by [Apache jclouds](http://jclouds.org).

# Launching SeaClouds platform

- Download [Apache Brooklyn](https://www.apache.org/dyn/closer.lua/incubator/brooklyn/apache-brooklyn-0.8.0-incubating/apache-brooklyn-0.8.0-incubating-bin.tar.gz) and unpack it 
- Run Brooklyn with `--catalogAdd seaclouds-catalog.bom` 

## Deploying SeaClouds on the cloud

- Select `SeaClouds platform` application from Apache Brooklyn dropdown menu
- Edit `location` specifying the cloud provider and the credentials to use it, in the YAML format.
- run it


## Deploying SeaClouds on BYON

Make sure you have [Vagrant](https://www.vagrantup.com/), [Virtual Box](https://www.virtualbox.org/)

- Configure your local environemnt:
```bash
cd byon
vagrant up
```
This spins up a virtual environment, made up of 2 VMs, that is accessible at `192.168.100.10` and `192.168.100.11`.

Finally, run `SeaClouds Platform on BYON` application template from Apache Brooklyn.

If you prefer you can also launch the platform deployment from CLI


## SeaClouds release 0.7.0-M19

A detailed description of [0.7.0-M19](https://github.com/SeaCloudsEU/SeaCloudsPlatform/releases/tag/0.7.0-M19) SeaClouds release including:
- SeaClouds components and their interactions
- A guide to get an install SeaClouds Platform
- An example of how to use SeaClouds Platform and exploit its capabilities and the capabilies of each of its components

can be found in the [Integrated Platform deliverable](https://drive.google.com/file/d/0B3naRHlVBGTEdmYySFVWSGdIYzA/view?usp=sharing).

### Troubleshooting

When deploying SeaClouds platform an [Apache Brooklyn](http://brooklyn.io) instance will be started on your
workstation, accessible at `http://localhost:8081` by default. Please double-check in nohup.out the correct url.

You may need to update the `privateKeyFile` property in the blueprint to the actual path.
By default, it points to `~/seaclouds-installer/byon/seaclouds_id_rsa`  but YMMV.

For more information, please visit [Apache Brooklyn](https://brooklyn.incubator.apache.org/download/index.html)


How to release it!
-------------------
In order to release a new version:

- `mvn clean install` If everything is ok:
- `mvn -DdryRun=true release:prepare -DreleaseVersion=0.7.0-M19 -Dtag=0.7.0-M19 -DdevelopmentVersion=0.8.0-SNAPSHOT` and wait for a message like `Release preparation simulation complete.`

Then:
- `mvn release:clean`
- `mvn release:prepare -DreleaseVersion=0.7.0-M19 -Dtag=0.7.0-M19 -DdevelopmentVersion=0.8.0-SNAPSHOT`
- `mvn release:perform`

- test the staging repository, and finally promote release it!

##License##
Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
