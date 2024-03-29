/*
 * Copyright (c) Interactive Information R & D (I2RD) LLC.
 * All Rights Reserved.
 *
 * This software is confidential and proprietary information of
 * I2RD LLC ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with I2RD.
 */


package com.proteusframework.build

import java.text.SimpleDateFormat

/**
 * Version class for build script.
 * @author Russ Tennant (russ@i2rd.com)
 * @since 12/3/13 4:02 PM
 */
class Version
{
    /**
     * Optional variable that can be defined in the build.gradle
     * to determine where the ProjectInformation.java class is put
     * when {@link #generateProjectInformationClass()} is called.
     * If not defined, the package name is <code> "${project.group}.${project.name}"</code>.
     * <p>
     *     Example: <br>
     *     <code>ext[Version.PROJECT_INFORMATION_PACKAGE] = 'com.example.app.config'
     * </p>
     */
    public static final String PROJECT_INFORMATION_PACKAGE = 'projectInformationPackage'

    String versionNumber;
    String originalVersion
    String thisVersion
    String status
    Date buildTime
    def project

    Version(String versionValue, def project)
    {
        this.project = project
        buildTime = new Date()
        originalVersion = versionValue
        if (originalVersion.endsWith('-SNAPSHOT'))
        {
            status = 'integration'
            versionNumber = originalVersion.substring(0, originalVersion.length() - '-SNAPSHOT'.length())
//            thisVersion = "${versionNumber}-${getTimestamp()}"
            thisVersion = versionValue
        }
        else
        {
            status = 'release'
            thisVersion = versionValue
            versionNumber = versionValue
        }
    }

    boolean isSnapshot()
    {
        originalVersion.endsWith('-SNAPSHOT')
    }

    String getTimestamp()
    {
        // version is incorporated into iml files - keep simple for VCS
        if(project.isIDEA) return 'SNAPSHOT'

        // Convert local file timestamp to UTC
        def format = new SimpleDateFormat('yyyyMMddHHmmss')
        format.setCalendar(Calendar.getInstance(TimeZone.getTimeZone('Etc/UTC')));
        return format.format(buildTime)
    }

    int getCommitAsNumber()
    {
        Integer.parseInt(project.gitinfo.commit.substring(0,7), 16)
    }

    String toString()
    {
        thisVersion
    }

    private def getCommit(String text)
    {
        def matcher = text =~ /_commit = "([^"]+)/
        return matcher ? matcher[0][1] : 'unknown commit'
    }

    private def getVersion(String text)
    {
        def matcher = text =~ /_version = "([^"]+)/
        return matcher ? matcher[0][1] : 'unknown version'
    }

    /**
     * Generate a version class for the project.
     * @param destDir optional destination directory for ProjectInformation source file.
     */
    void generateProjectInformationClass(def destDir = null)
    {
        def now = new SimpleDateFormat('yyyyMMdd\'T\'HHmmssZ').format(new java.util.Date())
        def srcDir = destDir?:(project.sourceSets.main.java.srcDirs.iterator().next())
        def packageName = project.hasProperty(PROJECT_INFORMATION_PACKAGE) ?
            project[PROJECT_INFORMATION_PACKAGE] : "${project.group.toString()}.${project.name}";
        def packageDir = new File(srcDir, packageName.replace('.', '/'))
        packageDir.mkdirs()
        def gitIgnore = new File(packageDir, '.gitignore')
        if(!gitIgnore.exists()) {
            gitIgnore.text = """# Ignore auto generated file ProjectInformation.java
ProjectInformation.java
.gitignore"""
        }
        def generatedClass = new File(packageDir, 'ProjectInformation.java')
        if(generatedClass.exists()
            && getCommit(generatedClass.text) == project?.gitinfo?.commit?:''
            && getVersion(generatedClass.text) == versionNumber
        )
        {
            println 'ProjectInformation.java up-to-date. SKIPPING'
            return;
        }
        generatedClass.text = """
/*
 * Copyright (c) Interactive Information R & D (I2RD) LLC.
 * All Rights Reserved.
 *
 * This software is confidential and proprietary information of
 * I2RD LLC ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with I2RD.
 */

package ${packageName};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Generated;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import net.proteusframework.core.lang.ClassPathResources;

// CHECKSTYLE:OFF

/**
 * Project Information.
 * @author Auto Generated (noreply@i2rd.com)
 */
@Generated(value= "Generated by build system", date = "${now}")
public final class ProjectInformation
{
    /** Name. */
    private static final String _name = "${project.name}";
    /** Group. */
    private static final String _group = "${project.group}";
    /** Version. */
    private static final String _version = "${versionNumber}";
    /** Commit. */
    private static final String _commit = "${project?.gitinfo?.commit?:''}";
    /** Branch. */
    private static final String _branch = "${project?.gitinfo?.branch?:''}";
    /** Status: release, milestone, integration. */
    private static final String _status = "${status}";

    /**
    * Utility class constructor.
    */
    private ProjectInformation()
    {
    }

    /**
     * Get the project name: "{@value #_name}"
     * @return the name.
     */
    public static String getName() 
    { 
        return _name; 
    }

    /**
     * Get the project group: "{@value #_group}"
     * @return the group.
     */
    public static String getGroup() 
    { 
        return _group; 
    }

    /**
     * Get the project version: "{@value #_version}"
     * @return the version.
     */
    public static String getVersion() 
    { 
        return _version; 
    }

    /**
     * Get the commit id: "{@value #_commit}"
     * @return the commit id.
     */
    public static String getCommit() 
    { 
        return _commit; 
    }

    /**
     * Get the branch: "{@value #_branch}"
     * @return the branch.
     */
    public static String getBranch() 
    { 
        return _branch; 
    }

    /**
     * Get the project status: "{@value #_status}"
     * @return the status.
     */
    public static String getStatus() 
    { 
        return _status; 
    }

    /**
     * Get the major version number.
     * @return the major version number
     * @throws NumberFormatException if version is in the wrong format.
     * @throws IndexOutOfBoundsException if version is in the wrong format.
     */
    public static int getMajorVersion() 
    { 
        return Integer.parseInt(getVersion().substring(0, getVersion().indexOf('.'))); 
    }

    /**
    * Get the module versions as defined in the MANIFEST.MF files.
    * @return the module versions.
    */
    public static Map<String, String> getManifestModuleVersions()
    {
        TreeMap<String, String> modules = new TreeMap<>();
        final ClassPathResources classPathResources = new ClassPathResources();
        try
        {
            final List<URL> urls = classPathResources.list(new ClassPathResources.Filter()
            {
                @Override
                public boolean accept(URL url, String fileName)
                {
                    return fileName.toUpperCase().contains("MANIFEST.MF");
                }
            });
            for (URL url : urls)
            {
                try(InputStream is = url.openStream())
                {
                    final Manifest manifest = new Manifest(is);
                    final Attributes mainAttributes = manifest.getMainAttributes();
                    String title = mainAttributes.getValue("Implementation-Title");
                    if(StringFactory.isEmptyString(title))
                        title = mainAttributes.getValue("Bundle-Name");
                    String version = mainAttributes.getValue("Implementation-Version");
                    if(StringFactory.isEmptyString(version))
                        version = mainAttributes.getValue("Bundle-Version");
                    if(!StringFactory.isEmptyString(title) && !StringFactory.isEmptyString(version)
                        && !title.startsWith("%"))
                        modules.put(title, version);
                }
                catch (IOException e)
                {
                    LogManager.getLogger(ProjectInformation.class).error("Unable to load manifest: " + url, e);
                }
            }
        }
        catch (IOException e)
        {
            LogManager.getLogger(ProjectInformation.class).error("Unable to search classpath.", e);
        }
        modules.put(getName(), getVersion());
        return modules;
    }
}

"""

    }
}
