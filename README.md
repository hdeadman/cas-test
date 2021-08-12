# CAS running as jar

This started as a [spring intializer project](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.5.4-SNAPSHOT&packaging=jar&jvmVersion=11&groupId=com.test&artifactId=cas&name=cas&description=Demo%20project%20for%20Spring%20Boot&packageName=com.test.cas):  
and then CAS dependencies were added and adjustments made until CAS runs as a jar.

Mainly required adding repositories to build.gradle, 
disabling some auto-configuration classes in spring boot, 
and adding a ThymeProperties bean that was missing for some reason. 

This is a throw-away proof of concept that might be incorporated into main CAS project
or CAS Intiailizr. CAS starts up but hasn't otherwise been tested (at all). 