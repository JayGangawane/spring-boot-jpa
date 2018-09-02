# spring-boot-jpa

# by default only /actuator/health and /actuator/metrics endpoints are exposed.
# if we want all actuator endpoints to be exposed, set the below property to * in application.properties
# management.endpoints.web.exposure.include=*
Exposing 14 endpoint(s) beneath base path '/actuator'
"{[/actuator/auditevents],methods=[GET]
"{[/actuator/beans],methods=[GET]"{[/actuator/health],methods=[GET]
"{[/actuator/conditions],methods=[GET]
"{[/actuator/configprops],methods=[GET]
"{[/actuator/env/{toMatch}],methods=[GET]
"{[/actuator/env],methods=[GET]
"{[/actuator/info],methods=[GET]
"{[/actuator/loggers],methods=[GET]
"{[/actuator/loggers/{name}],methods=[GET]
"{[/actuator/loggers/{name}],methods=[POST]
"{[/actuator/heapdump],methods=[GET]
"{[/actuator/threaddump],methods=[GET]
"{[/actuator/metrics],methods=[GET]
"{[/actuator/metrics/{requiredMetricName}]
"{[/actuator/scheduledtasks],methods=[GET]
"{[/actuator/httptrace],methods=[GET]
"{[/actuator/mappings],methods=[GET]
"{[/actuator],methods=[GET]