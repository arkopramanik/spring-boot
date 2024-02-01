## Actuator
Actuators are used to provide production-ready features for our application

	(Monitor and manage our application)

-> To work with Actuators spring boot provided below starter

```maven
	   <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

```



-> We can write below configuration in application.yml file to expose actuator endpoints

```yaml
-------------------------------application.yml----------------------
management:
  endpoints:
    web:
      exposure:
        include: '*'
		 exclude: 'beans'

  endpoint:
    shutdown:
      enabled: true

---------------------------------------------------------------------
```

############  URL : http://localhost:8080/actuator/  ############

health : http://localhost:8080/actuator/health

mappings : http://localhost:8080/actuator/mappings

beans : http://localhost:8080/actuator/beans

heapdump : http://localhost:8080/actuator/heapdump

threaddump : http://localhost:8080/actuator/threaddump

Shutdown : http://localhost:8080/actuator/shutdown


Note: Shutdown is a special endpoint which is used to stop our application and it is mapped to POST request.
