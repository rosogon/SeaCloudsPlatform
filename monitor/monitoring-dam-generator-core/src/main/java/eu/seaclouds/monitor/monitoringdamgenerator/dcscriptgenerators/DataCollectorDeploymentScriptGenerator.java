package eu.seaclouds.monitor.monitoringdamgenerator.dcscriptgenerators;

import eu.seaclouds.monitor.monitoringdamgenerator.adpparsing.Module;

public interface DataCollectorDeploymentScriptGenerator {
    public static final String MODACLOUDS_TOWER4CLOUDS_MANAGER_IP = "MODACLOUDS_TOWER4CLOUDS_MANAGER_IP";
    public static final String MODACLOUDS_TOWER4CLOUDS_MANAGER_PORT = "MODACLOUDS_TOWER4CLOUDS_MANAGER_PORT";
    public static final String MODACLOUDS_TOWER4CLOUDS_DC_SYNC_PERIOD = "MODACLOUDS_TOWER4CLOUDS_DC_SYNC_PERIOD";
    public static final String MODACLOUDS_TOWER4CLOUDS_RESOURCES_KEEP_ALIVE_PERIOD = "MODACLOUDS_TOWER4CLOUDS_RESOURCES_KEEP_ALIVE_PERIOD";
    public static final String MODACLOUDS_TOWER4CLOUDS_CLOUD_PROVIDER_ID = "MODACLOUDS_TOWER4CLOUDS_CLOUD_PROVIDER_ID";
    public static final String MODACLOUDS_TOWER4CLOUDS_CLOUD_PROVIDER_TYPE = "MODACLOUDS_TOWER4CLOUDS_CLOUD_PROVIDER_TYPE";
    public static final String MODACLOUDS_TOWER4CLOUDS_PAAS_SERVICE_ID = "MODACLOUDS_TOWER4CLOUDS_PAAS_SERVICE_ID";
    public static final String MODACLOUDS_TOWER4CLOUDS_PAAS_SERVICE_TYPE = "MODACLOUDS_TOWER4CLOUDS_PAAS_SERVICE_TYPE";
    public static final String MODACLOUDS_TOWER4CLOUDS_VM_ID = "MODACLOUDS_TOWER4CLOUDS_VM_ID";
    public static final String MODACLOUDS_TOWER4CLOUDS_VM_TYPE = "MODACLOUDS_TOWER4CLOUDS_VM_TYPE";
    public static final String MODACLOUDS_TOWER4CLOUDS_LOCATION_ID = "MODACLOUDS_TOWER4CLOUDS_LOCATION_ID";
    public static final String MODACLOUDS_TOWER4CLOUDS_LOCATION_TYPE = "MODACLOUDS_TOWER4CLOUDS_LOCATION_TYPE";
    public static final String MODACLOUDS_TOWER4CLOUDS_INTERNAL_COMPONENT_ID = "MODACLOUDS_TOWER4CLOUDS_INTERNAL_COMPONENT_ID";
    public static final String MODACLOUDS_TOWER4CLOUDS_INTERNAL_COMPONENT_TYPE = "MODACLOUDS_TOWER4CLOUDS_INTERNAL_COMPONENT_TYPE";

    public String generateDataCollectorDeploymentScript(Module moduleInfo,
            String monitoringManagerIp, int monitoringManagerPort);
}